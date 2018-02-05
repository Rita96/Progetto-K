/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author toalgrim
 */
public class Utente {
    
    private String nome;
    private int id;
    private String username;
    private final static int TYPEUSER = 1;
    private Connection db;
    
    
    public Utente(String nome, int id, String username) {
        this.nome = nome;
        this.id = id;
        this.username = username;
    }
    
    
    public static ArrayList creaListaUtenti(Connection db){
        
        String nome;
        int id;
        String username;
        ArrayList<Utente> listaUtenti = new ArrayList<>();
        String sql = "select * from user where TypeUser=?";
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setInt(1, TYPEUSER);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("IDuser");
                username = rs.getString("username");
                nome = rs.getString("nome");
                Utente cl = new Utente(nome, id, username);
                listaUtenti.add(cl);
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database");
        }
        
        return listaUtenti;
    }
    
    public void stampaListaUtenti(ArrayList lu) {
        for (int i=0; i<lu.size(); i++) {
            System.out.println(lu.get(i));
        }
    }
    
    
    public String toString() {
        return this.id + " - " + this.username;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getUsername () {
        return this.username;
    }
    
 
    
}
