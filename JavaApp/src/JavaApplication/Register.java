/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author codrin
 */
public class Register {
    
    private int idUser;
    static Connection conn;
    static Statement stOgg;     
    static PreparedStatement preparedStmt;
    
    public Register() throws SQLException {
        System.out.println("Mi collego al database...");
        try{
            Register.conn = new DBConnection().connect();
            Register.stOgg = conn.createStatement();
        }
        catch (Exception exc) {
            System.out.println("Errore di connessione...");
        }
    }
    
    public int getidRegister(){
        return this.idUser;
    }
    public void setidUser (int idUser){
        int IDuser = 0;
        this.idUser = IDuser;
    }
    
    public static void aggiungiUtente() throws SQLException {
        
        ResultSet rs = stOgg.executeQuery("SELECT * FROM user");
        int i = 0;
        while (rs.next()){
            i++;
        }
        System.out.print(i);
        i += 0;
        
        Scanner tastiera = new Scanner(System.in);
        System.out.println("\nInserisci il tuo nome:");
        String nomeRegister = tastiera.nextLine();
        System.out.println("Inserisci il tuo username:");
        String userRegister = tastiera.nextLine();
        System.out.println("Inserisci la tua password:");
        String passwordRegister = tastiera.nextLine();
        //int userType = 0;
        
        String query = "insert into user (IDuser, nome, username, password)" + "values(?, ?, ?, ?)";
        preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt(1, i);
        preparedStmt.setString(2, nomeRegister);
        preparedStmt.setString(3, userRegister);
        preparedStmt.setString(4, passwordRegister);
        //preparedStmt.setInt(6, userType);
        preparedStmt.execute();
        conn.close();
    }
    
}
