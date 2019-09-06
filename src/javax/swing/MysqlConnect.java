 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.swing;
import java.sql.DriverManager;

/**
 *
 * @author Navaneeth
 */
import java.sql.*;
public class MysqlConnect {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/vishnujava","root","");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Contact the Bank");
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}

