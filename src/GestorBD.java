import net.xqj.exist.ExistXQDataSource;

import javax.xml.xquery.*;

public class GestorBD {

    XQDataSource xqs;
    XQConnection conn;
    XQExpression expr;

    public GestorBD() throws XQException { //Constructor
        this.xqs = new ExistXQDataSource();
        this.conn = xqs.getConnection();
        this.expr = conn.createExpression();
        xqs.setProperty("serverName", "localhost");
        xqs.setProperty("port", "8080");
    }

    public void insertPunt(){ //Eric

    }
    public void deletePunt(){ //Aaron

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
        expr.close();
        conn.close();
    }


}