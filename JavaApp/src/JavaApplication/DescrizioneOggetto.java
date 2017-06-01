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
 * @author andre
 */
public class DescrizioneOggetto {
    /* variabili */
    private int idOggetto, maxOfferta, idUser, oggettoAttivo;
    private String nomeOggetto, descrizioneOggetto;
    
    /* Costruttore pubblico */
    public DescrizioneOggetto() {
}
    /* Metodi getter e setter */
    public int getIdOggetto() {
        return idOggetto;
    }
    
    public int getMaxofferta() {
        return maxOfferta;
    }
    
    public int getidUser() {
        return idUser;
    }
    
    public int getOggettoAttivo() {
        return oggettoAttivo;
    }
    
    public String getNomeOggetto() {
        return nomeOggetto;
    }
    
    public String getDescrizioneOggetto() {
        return descrizioneOggetto;
    } 
    
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
    
    public static void getDescrizione(int codice) throws SQLException { 
        
    Connection con = new DBConnection().connect();
    Statement st = con.createStatement();
    String sql = ("SELECT * FROM Oggetti WHERE IDoggetto = '" + codice + "'");
    ResultSet rs = st.executeQuery(sql);
    
    if(rs.next()) { 
        String str1 = rs.getString("Descrizione");
        System.out.println(str1);
    }
    
    con.close();
    
    }
}