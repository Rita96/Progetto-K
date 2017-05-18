/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.util.Scanner;
import java.sql.*;
import java.util.Date;


/**
 *
 * @author toalgrim
 */

public class Oggetto  {
    
    private int idOggetto;
    static Connection conn; 
    static Statement stOgg;
    static PreparedStatement preparedStmt;
    
     
    /* Costruttore della classe oggetto, una volta chiamato prova ad aprire una connessione con il database*/
    
    public Oggetto() throws SQLException {
        System.out.println("Provo a leggere il database...");
        try {
                Oggetto.conn = new DBConnection().connect();
                Oggetto.stOgg = conn.createStatement();
        }
        catch (Exception exc)  { 
            System.out.println("Errore nella lettura del database");
        }
}
    /*Metodi Get e Set per l'Id dell'oggetto*/
    
    public int getidOggetto() {
        return this.idOggetto;
    }
    public void setidOggetto(int IDoggetto) {
        this.idOggetto = IDoggetto;
    }
    
    /*Metodo per inserire un nuovo oggetto all'interno del database*/
    public static void aggiungiOggetto() throws SQLException {
        
        // Conto il numero di insert che il database ha disponibili per creare il nuovo codice oggetto
        ResultSet rs = stOgg.executeQuery ("SELECT * FROM Oggetti");
        int i = 0;
        while (rs.next()) {
           i++;
        }
        System.out.println(i);
        i += 1001;
        
        // Ricevo da input il nome, la descrizione e l'offerta minima
        Scanner testo = new Scanner (System.in);
        System.out.println("Inserisci il nome dell'oggetto:");
        String a = testo.nextLine();
        System.out.println("Inserisci la descrizione dell'oggetto");
        String b = testo.nextLine();
        System.out.println("Inserisci offerta minima");
        int f = testo.nextInt();
        System.out.println("Inserisci data inizio asta")
        
        // Inserisco nel database i dati ricevuti precedentemente da tastiera
        String query = " insert into Oggetti (IDoggetto, NomeOggetto, Descrizione, MaxOfferta, DataInizio)" + " values (?, ?, ?, ?, ?)";
        preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt (1, i);
        preparedStmt.setString (2, a);
        preparedStmt.setString   (3, b);
        preparedStmt.setInt(4, f);
        preparedStmt.setDate(5, date);
        preparedStmt.execute();
        conn.close();
        
//        String lastCrawlDate = "2014-01-28"
// PreparedStatement p = con.prepareStatement("insert into JsonData (last_crawl_date) values(?))");
//
// p.setDate(1, Date.valueOf(lastCrawlDate));
        
          
////        
//        
//        
//        String sql = "insert into Oggetti (NomeOggetto, Descrizione, DataInizioAsta, offerta)?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(2, NomeOggettoField.getText());
//            ps.setString(3, DescrizioneField.getText());
//            ps.setString(4, DataInizioAstaField.getText());
//            ps.setString(5, offertaField.getText());
//            
//            
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                this.dispose();
//                MainMenu mm = new MainMenu ();
//                mm.show();
//               
//            }
//            else {
//                JOptionPane.showMessageDialog(null, "Username & Password Invalid");
//                
//            }
//        }
//        catch (Exception e) {
//            
//        }
//    }                                           
//
//    }
    
}
}
