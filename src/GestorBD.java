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

    //Eric
    public void insertPunt() throws XQException {
        System.out.println("insertPunt");

        System.out.println("Como quieres que se llame: ");
        String tooltip = scanner.nextLine();

        System.out.println("Cual es su latitud: ");
        String latitud = scanner.nextLine();

        System.out.println("Cual es su longitud: ");
        String longitud = scanner.nextLine();

        XQExpression xqExpression = conn.createExpression();

        String insert = "update insert " +

            "<Punt>" +
                "<Coord>" +
                    "<ED50_COORD_X>432140.399</ED50_COORD_X>" +
                    "<ED50_COORD_Y>4584741.446</ED50_COORD_Y>" +
                    "<ETRS89_COORD_X>432048.452</ETRS89_COORD_X>" +
                    "<ETRS89_COORD_Y>4584540.488</ETRS89_COORD_Y>" +
                    "<Longitud>"+longitud+"</Longitud>" +
                    "<Latitud>"+latitud+"</Latitud>" +
                "</Coord>" +
                "<Icon>http://www.barcelona.cat/estatics-planol/v0.8/img/w/bg/K/K004.png</Icon>" +
                "<Tooltip>"+tooltip+"</Tooltip>" +
                "<URL>http://www.bcn.cat</URL>" +
            "</Punt> " +

            "preceding doc('/db/transportes/TRANSPORTS_GEOXML.xml')/Guiamap_Xchange/Punt[1]";

        xqExpression.executeCommand(insert);
    }

    //Aaron
    public void deletePunt(){
        System.out.println("deletePunt");

    }

    //Eric
    public void replacePunt() throws XQException {
        System.out.println("replacePunt");

        System.out.println("Como se llama el que quieres cambiar: ");
        String tooltip = scanner.nextLine();

        System.out.println("Como quieres que se llame: ");
        String nuevaTooltip = scanner.nextLine();

        XQExpression xqExpression = conn.createExpression();
        String insert = "update value doc('/db/transportes/TRANSPORTS_GEOXML.xml')/Guiamap_Xchange/Punt[Tooltip='"+tooltip+"']/Tooltip with '"+nuevaTooltip+"' ";
        xqExpression.executeCommand(insert);
    }

    public void getAllPuntsNames(){ //Aaron
        System.out.println("getAllPuntsNames");

    }
    public void getLatitudAndLongitud(){ //Eric
        System.out.println("getLatitudAndLongitud");

    }
    public void replaceImageByName(){ //Aaron
        System.out.println("replaceImageByName");

    }

    public void tancarSessio() throws XQException { //tancarSessió
        conn.close();
    }

}