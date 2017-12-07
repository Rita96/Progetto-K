/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;


/**
 *
 * @author cl411381
 */
public class Login {
    
    Connection db;
    
    
    public Login(String nomeUtente, String password) {
        db = new DBConnection().connect();
        if (utentePresente(nomeUtente, password)) {
            System.out.println("Utente trovato");
        }
        
        else {
            System.out.println("Utente non trovato, riprova");
        }
        
        
    }
    
    private boolean utentePresente(String nomeUtente, String password) {
        boolean presenza = false;
        String sql = "select * from user where username=? and password=?";
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, nomeUtente);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                presenza = true;
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database");
        }
        
        return presenza;
    }
    
}
