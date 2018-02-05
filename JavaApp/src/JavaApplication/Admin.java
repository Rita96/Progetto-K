/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author toalgrim
 */
public class Admin {
    
    String nomeUtente;
    
    public Admin(Login l1) {
        this.nomeUtente = l1.getNomeUtente();
    }
    
    public String getNomeUtente() {
        return this.nomeUtente;
    }
    
    public static void rimuoviUtente(Connection db, int codice) {
        try {
            PreparedStatement st = db.prepareStatement("DELETE FROM user WHERE IDuser = " + codice + ";");
            st.executeUpdate(); 
        }
        catch (Exception e){
            System.out.println("Errore nell'eliminare l'utente");
        }
        
    }
    
    
    
    
    
}
