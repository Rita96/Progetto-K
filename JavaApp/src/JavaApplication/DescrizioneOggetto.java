/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Toalgrim
 */
public class DescrizioneOggetto {
    /* variabili */
    private int idOggetto, maxOfferta, idUser, oggettoAttivo;
    private String nomeOggetto, descrizioneOggetto, dataInizioAsta, oraInizioAsta, oraFineAsta, dataFineAsta;
    private Connection db;

    
    
    /* Costruttore pubblico */
    public DescrizioneOggetto(int codice, Connection db) {
        this.db = db;
        String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.idOggetto = codice;
                this.maxOfferta = rs.getInt("MAXofferta");
                this.idUser = rs.getInt("IDuser");
                this.oggettoAttivo = rs.getInt("AstaAttiva");
                this.nomeOggetto = rs.getString("NomeOggetto");
                this.descrizioneOggetto = rs.getString("Descrizione");
                this.dataInizioAsta = rs.getString("DataInizioAsta");
                this.oraInizioAsta = rs.getString("OraInizioAsta");
                this.oraFineAsta = rs.getString("OraFineAsta");
                this.dataFineAsta = rs.getString("DataFineAsta");
            }
        } catch (Exception e) {
            System.out.println("Errore, oggetto non trovato");
        }

    
        
}
    /* Metodi getter e setter */
     
    
    public void setIdOggetto(int idOggetto) {
        this.idOggetto = idOggetto;
    }
    
    public void setMaxOfferta(int maxOfferta) {
        this.maxOfferta = maxOfferta;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    public void setOggettoAttivo(int oggettoAttivo) {
        this.oggettoAttivo = oggettoAttivo;
    }
    
    public void setNomeOggetto(String nomeOggetto) {
        this.nomeOggetto = nomeOggetto;
    }
    
    public void setDescrizioneOggetto(String descrizioneOggetto) {
        this.descrizioneOggetto = descrizioneOggetto;
    }
    
    public String toString() {
        return this.idOggetto + " - " + this.nomeOggetto;
    }
    
    public String getDescrizione() throws SQLException {
        return this.descrizioneOggetto;
    }

    public String getNomeOggetto() { 
        return this.nomeOggetto;
    }

    public int getOggettoAttivo() { 
        return this.oggettoAttivo;
    }

    public int getidUser() { 
        return this.idUser;
    }

    public int getMaxofferta(){ 
        return this.maxOfferta;
    }
    
    public String getDataInizioAsta (){
        return this.dataInizioAsta;
    }
    
    public String getOraInizioAsta (){
        return this.oraInizioAsta;
    }
    
    public String getOraFineAsta() {
        return this.oraFineAsta;
    }
    
    public String getDataFineAsta()  {
        return this.dataFineAsta;
    }
    
    /*  mertodi get db
    public static String getOraInizioAsta (int codice) throws SQLException {
        String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
        ResultSet rs = Oggetto.stOgg.executeQuery(sql);
        String str1 = null;
        
        if(rs.next()) { 
        str1 = rs.getString("OraInizioAsta");
        }
        
    return str1;
    }
    */
    



}