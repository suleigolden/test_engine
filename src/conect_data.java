
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULEIGOLDEN
 */
public class conect_data {
    public static Connection conect(){
        
        try{
            Class.forName("org.sqlite.JDBC");
           // Connection con= DriverManager.getConnection("jdbc:sqlite:src\\testdatabase.sqlite");
            Connection con= DriverManager.getConnection("jdbc:sqlite:C:\\test engine01.01\\src\\testdatabase.sqlite");
          // Connection con =DriverManager.getConnection("jdbc:sqlite:C:\\Program Files\\test engine01.01\\src\\testdatabase.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Established");//DriverManager.getConnection("jdbc:sqlite:sample.db");
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    public static void main(String[] args){
       conect_data.conect();
    }
}
