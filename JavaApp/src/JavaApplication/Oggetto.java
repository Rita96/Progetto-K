/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;


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
    public static void aggiungiOggetto(int i, int prezzoAsta, String nomeOgg, String descrizioneOgg, Date date, String time) throws SQLException {
               
        
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        java.sql.Time sqlTime = new java.sql.Time(System.currentTimeMillis());
        
        try {
                 
                sqlDate = new java.sql.Date(date.getTime());
        }
        catch (Exception ex) {
            System.out.println("Errore inserimento data");
        }
       
        try {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                Date timeInsert = null;
                timeInsert = sdf.parse(time);
                sqlTime = new java.sql.Time(timeInsert.getTime());
        }
        catch (Exception ex) {
            System.out.println("Errore inserimento data");
        }
                
        // Inserisco nel database i dati ricevuti precedentemente da tastiera
        String query = " insert into Oggetti (IDoggetto, NomeOggetto, Descrizione, MaxOfferta, DataInizio, OraInizioAsta)" + " values (?, ?, ?, ?, ?, ?)";
        preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt (1, i);
        preparedStmt.setString (2, nomeOgg);
        preparedStmt.setString   (3, descrizioneOgg);
        preparedStmt.setInt(4, prezzoAsta);
        preparedStmt.setDate(5, sqlDate);
        preparedStmt.setTime(6, sqlTime);
        preparedStmt.execute();
        conn.close();
    }
        
   
    /* Conto il numero di insert che il database ha disponibili per creare il nuovo codice oggetto */
    public static int trovaID() throws SQLException {
        
        // Provo a collegarmi al database
        try {
                Oggetto.conn = new DBConnection().connect();
                Oggetto.stOgg = conn.createStatement();
        }
        catch (Exception exc)  { 
            System.out.println("Errore nella lettura del database");
        }
        
        // Leggo il numero di righe e creo il codice ID per gli oggetti
        ResultSet rs = stOgg.executeQuery ("SELECT * FROM Oggetti");
        int i = 0;
        while (rs.next()) {
           i++;
        }
        i += 1001;
        return i;
    } 
}
