import javax.xml.xquery.XQException;

public class Main {
    public static void main(String[] args) throws XQException {
        GestorBD gestorBD = new GestorBD();
        gestorBD.deletePunt();
        gestorBD.tancarSessio();
    }
}
