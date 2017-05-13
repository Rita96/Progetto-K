/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.util.Scanner;
import java.io.*;


/**
 *
 * @author toalgrim
 */

public class Oggetto {
    Connection conn; 
    
//    private String NomeOggetto;
//    private String Descrizione;
    private int idOggetto;
    
    public Oggetto(int IDoggetto) {
        this.conn = new DBConnection().connect();
        this.idOggetto=IDoggetto;
//        this.NomeOggetto = nomeoggetto;
//        this.Descrizione = descrizione;
}
    public int getidOggetto() {
        return this.idOggetto;
    }
    
   
   
    
    public void setidOggetto(int IDoggetto) {
        this.idOggetto = IDoggetto;
    }
    
    
    public static void aggiungiOggetto() {
        
        
        String sql = "insert into Oggetti (NomeOggetto, Descrizione, DataInizioAsta, offerta)?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(2, NomeOggettoField.getText());
            ps.setString(3, DescrizioneField.getText());
            ps.setString(4, DataInizioAstaField.getText());
            ps.setString(5, offertaField.getText());
            
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.dispose();
                MainMenu mm = new MainMenu ();
                mm.show();
               
            }
            else {
                JOptionPane.showMessageDialog(null, "Username & Password Invalid");
                
            }
        }
        catch (Exception e) {
            
        }
    }                                           

    }
    
}
