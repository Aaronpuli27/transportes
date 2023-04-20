import net.xqj.exist.ExistXQDataSource;

import javax.xml.xquery.*;
import java.util.Scanner;

public class GestorBD {

    XQDataSource xqs;
    XQConnection conn;
    Scanner scanner = new Scanner(System.in);
    public GestorBD() throws XQException { //Constructor
        this.xqs = new ExistXQDataSource();
        this.conn = xqs.getConnection();
        xqs.setProperty("serverName", "localhost");
        xqs.setProperty("port", "8080");
    }

    public void insertPunt(){ //Eric

    }
    public void deletePunt() throws XQException { //Aaron
        System.out.println("Nombre (Tooltip) del Punt a borrar");
        String tooltip = scanner.nextLine();
        XQExpression expr = conn.createExpression();
        String delete = "update delete doc('/db/transportes/TRANSPORTS_GEOXML.xml')/Guiamap_Xchange/Punt[Tooltip='"+tooltip+"']";
        expr.executeCommand(delete);
    }
    public void replacePunt(){ //Eric

    }
    public void getAllPuntsNames(){ //Aaron

    }
    public void getLatitudAndLongitud(){ //Eric

    }
    public void replaceImageByName(){ //Aaron

    }

    public void tancarSessio() throws XQException { //tancarSessió
        conn.close();
    }


}