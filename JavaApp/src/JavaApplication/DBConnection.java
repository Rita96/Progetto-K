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
             System.out.println("Connesso ");
         }
         catch (ClassNotFoundException cnfe) {
             System.out.println("Connessione Fallita!" + cnfe);
         }
         String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11163887";
         try {
             DBConnection = (Connection) DriverManager.getConnection(url, "sql11163887", "dzWTvdjb4c");
             System.out.println("Database Connesso");       
         }
         catch (SQLException se) {
             System.out.println("No Database" + se);
         }
         return DBConnection;
     } 
    
}
