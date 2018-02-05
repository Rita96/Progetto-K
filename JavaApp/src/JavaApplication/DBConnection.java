/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author codrin
 */
public class DBConnection {
    private Connection DBConnection;
    
     public Connection connect() {
         try {
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch (ClassNotFoundException cnfe) {
             System.out.println("Connessione Fallita" + cnfe);
         }
         String url = "jdbc:mysql://173.194.255.127:3306/user_projk";
         try {
             DBConnection = (Connection) DriverManager.getConnection(url, "codrin", "kodd");
             System.out.println("Database Connesso");       
         }
         catch (SQLException se) {
             System.out.println("Errore nell'accesso al database jkiop");
         }
         return DBConnection;
     } 
    
}