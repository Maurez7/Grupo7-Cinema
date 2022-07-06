package conexion;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    String bd = "cine";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String pass = "admin";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion(){
        
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, user, pass);
            System.out.println("SE CONECTO A LA DB");
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println("NO SE CONECTO A LA DB");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
