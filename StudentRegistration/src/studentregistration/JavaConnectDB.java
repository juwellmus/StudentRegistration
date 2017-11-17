/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Maruf
 */
public class JavaConnectDB {
    private final static String url = "jdbc:oracle:thin:@cse93:1521:XE";
    private final static String username = "SYSTEM";
    private final static String password = "123";
    
    
    public static Connection getConnection() {
        Connection con;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully Connected");
            return con;
        } catch (Exception e) {
            e.printStackTrace();            
        }
        return null;
    }
    
    
}
