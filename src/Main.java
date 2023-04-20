import javax.xml.xquery.XQException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws XQException {
        GestorBD gestorBD = new GestorBD();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("__________________________________________");
            System.out.println("Que quieres hacer?:");
            System.out.println("1: Insertar un Punt");
            System.out.println("2: Borrar un Punt");
            System.out.println("3: Remplazar un Punt");
            System.out.println("4: Ver el nombre (Tooltip) de todos los Punts");
            System.out.println("5: Ver la Latitud y longitud de un Punt");
            System.out.println("6: Cambiar la imagen de un Punt");
            System.out.println("0: Salir");
            System.out.println("__________________________________________");
            int num = scanner.nextInt();

            switch (num){
                case 1:
                    gestorBD.insertPunt();
                    break;
                case 2:
                    gestorBD.deletePunt();
                    break;
                case 3:
                    gestorBD.replacePunt();
                    break;
                case 4:
                    gestorBD.getAllPuntsNames();
                    break;
                case 5:
                    gestorBD.getLatitudAndLongitud();
                    break;
                case 6:
                    gestorBD.replaceImageByName();
                    break;
                case 0:
                    gestorBD.tancarSessio();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Eres bobo?");
                    break;
            }
        }

    }
}
