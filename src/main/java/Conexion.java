import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con = null;
    String bd = "bd_usuarios";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";

    public Connection getConexion(){

        Connection con = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: Database Failed to Connect" + e.getMessage());
        }
        return con;
    }

    public void CloseConecction(){
        try{
            if(con != null){
                con.close();
                JOptionPane.showMessageDialog(null, "Database Conection Closed");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: Database Failed to Connect" + e.getMessage());
        }
    }
}
