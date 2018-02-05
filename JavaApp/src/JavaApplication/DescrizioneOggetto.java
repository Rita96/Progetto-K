/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Toalgrim
 */
public class DescrizioneOggetto {
    /* variabili */
    private int idOggetto, maxOfferta, idUser, oggettoAttivo;
    private String nomeOggetto, descrizioneOggetto, dataInizioAsta, oraInizioAsta;

    
    
    /* Costruttore pubblico */
    public DescrizioneOggetto() {
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
    
    public static String getDescrizione(int codice) throws SQLException { 
        
    String str1 = null;
    String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
    ResultSet rs = Oggetto.stOgg.executeQuery(sql);
    
    if(rs.next()) { 
        str1 = rs.getString("Descrizione");
    }

    return str1;
    
    }

    public static String getNomeOggetto(int codice) throws SQLException { 
        
    String str1 = null;
    String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
    ResultSet rs = Oggetto.stOgg.executeQuery(sql);
    
    if(rs.next()) { 
        str1 = rs.getString("NomeOggetto");
    }
    
    return str1;
    
    }

    public static String getOggettoAttivo(int codice) throws SQLException { 
        
    String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
    ResultSet rs = Oggetto.stOgg.executeQuery(sql);
    String str1 = null;
    
    if(rs.next()) { 
        str1 = rs.getString("AstaAttiva");
        System.out.println(str1);
    }
    
    return str1;
    
    }

    public static String getidUser(int codice) throws SQLException { 
    
    String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
    ResultSet rs = Oggetto.stOgg.executeQuery(sql);
    String str1 = null;
    if(rs.next()) { 
        str1 = rs.getString("IDuser");
    }
    return str1;

    
    }

    public static String getMaxofferta(int codice) throws SQLException { 
    
    String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
    ResultSet rs = Oggetto.stOgg.executeQuery(sql);
    String str1 = null;
    
    if(rs.next()) { 
        str1 = rs.getString("MAXofferta");
    }
    return str1;
    }
    
    public static String getDataInizioAsta (int codice) throws SQLException {
        
        String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
        ResultSet rs = Oggetto.stOgg.executeQuery(sql);
        String str1 = null;
        
        if(rs.next()) { 
        str1 = rs.getString("DataInizio");
        }
        
    return str1;
    }
    
    public static String getOraInizioAsta (int codice) throws SQLException {
        String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
        ResultSet rs = Oggetto.stOgg.executeQuery(sql);
        String str1 = null;
        
        if(rs.next()) { 
        str1 = rs.getString("OraInizioAsta");
        }
        
    return str1;
    }



}