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
import java.util.ArrayList;


/**
 *
 * @author toalgrim
 */

public class Oggetto  {
    
    private int idOggetto;
    private Connection db;
    private DescrizioneOggetto dogg;
    private static final int ASTA_ATTIVA = 1;
    
     
    
    public Oggetto(int idOggetto, Connection db) throws SQLException {
        this.idOggetto = idOggetto;
        this.db = db;
        dogg = new DescrizioneOggetto(this.idOggetto, db);
}
    /*Metodi Get e Set per l'Id dell'oggetto*/
    
    public int getidOggetto() {
        return this.idOggetto;
    }
    public void setidOggetto(int IDoggetto) {
        this.idOggetto = IDoggetto;
    }
    
    /*Metodo per inserire un nuovo oggetto all'interno del database*/
    public void aggiungiOggetto(int i, int prezzoAsta, String nomeOgg, String descrizioneOgg, Date date, String time) throws SQLException {
               
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
        try {
            PreparedStatement ps = db.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps = db.prepareStatement(query);
                ps.setInt (1, i);
                ps.setString (2, nomeOgg);
                ps.setString   (3, descrizioneOgg);
                ps.setInt(4, prezzoAsta);
                ps.setDate(5, sqlDate);
                ps.setTime(6, sqlTime);
                ps.execute();
            }
        } catch (Exception e) {
            System.out.println("Errore, oggetto non trovato");
        }
        
    }
        
   
    /* Prendo l'ultimoi per creare il nuovo codice oggetto */
    public int trovaID() throws SQLException {
        PreparedStatement ps = db.prepareStatement("SELECT * FROM Oggetti");
        ResultSet rs = ps.executeQuery();
        int numero = 0;
        while (rs.next()) {
           numero = rs.getInt("IDoggetto");
        }
        numero++;
        return numero;
    } 
    
    @Override
    public String toString() {
        return this.idOggetto + " - " + this.dogg.getNomeOggetto();
    }
    
    public static ArrayList creaListaOggetti(Connection db, String s){
        int id;
        ArrayList<Oggetto> listaOggetto = new ArrayList<>();
        String sql = "SELECT * from Oggetti";
        // String sql = "select * from Oggetti where AstaAttiva=?";
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            //ps.setInt(1, ASTA_ATTIVA);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("IDoggetto");
                Oggetto o1 = new Oggetto(id, db);
                if (o1.dogg.getNomeOggetto().contains(s))
                {
                    listaOggetto.add(o1);
                }
                
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database");
        }
        
        return listaOggetto;
    }
    
    
}
