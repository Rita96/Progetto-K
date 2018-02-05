/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;



/**
 *
 * @author cl411381
 */
public class Login {
    
    //private final static int NUMERO_UTENTE_BASE = 1000;
    private Connection db;
    private int codiceUtente;
    private int tipoUtente;
    private boolean registrazioneEffettuata = false;
    private String nomeUtente;
    private String cognome;
    
    
    
    
    public Login(String nomeUtente, String password, Connection db) {
        
        this.db = db;
        int n[];
        
        if (verificaUtentePassword(nomeUtente, password)) {
            System.out.println("Utente trovato");
            n = tipoUtente(nomeUtente);
            codiceUtente = n[1];
            tipoUtente = n[0];
            this.nomeUtente = nomeUtente;
        }
        else {
        System.out.println("Utente non trovato, riprova");
        }
     }
    
    public Login(String nomeUtente, String pass1, String pass2, String nome, int tipoUtente, Connection db) {
       
        this.db = db;
        creaNuovoUtente(nomeUtente, pass1, pass2, nome, tipoUtente);
    }
    
    
    /* Metodo che verifica se il nome utente e la password coincidono*/
    public boolean verificaUtentePassword(String nomeUtente, String password) {
        boolean presenza = false;
        String sql = "select * from user where username=? and password=?";
        try {
            PreparedStatement ps = this.db.prepareStatement(sql);
            ps.setString(1, nomeUtente);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                presenza = true;
                this.cognome = rs.getString("nome");
                System.out.println(this.cognome);
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database asd");
        }
        
        return presenza;
    }
    
    
    /* Metodo che restituisce il codice dell'utente e il tipo*/
    private int[] tipoUtente(String nomeUtente) {
        int tipo[] = {0, 0};
       
        
        try {
            String sql = ("SELECT * FROM user WHERE username = '" + nomeUtente + "'");
            PreparedStatement ps = this.db.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
    
            if(rs.next()) { 
                tipo[0] = rs.getInt("TypeUser");
                tipo[1] = rs.getInt("IDuser");
            }
            
        } catch (Exception e) {
            System.out.println("Errore, utente non trovato");
        }
        return tipo;
    }
    
    
    /* metodo che verifica la presenza o meno dell'username*/
    private boolean userPresente(String username) {
        boolean presenza = false;
        String sql = "select * from user where username=?";
        try {
            PreparedStatement ps = this.db.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                presenza = true;
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database, non trovo gli utenti");
        }
        return presenza;
    }
    
    
    private void creaNuovoUtente(String nomeUtente, String pass1, String pass2, String nome,int tipoUtente) {
        
        try {
                
            PreparedStatement preparedStmt;
            int n = calcoloCodiceUtente();
            System.out.println("Nome " + nomeUtente);

            if (pass1.equals(pass2)) {
                if (!userPresente(nomeUtente) && !nomeUtente.equalsIgnoreCase("")) {
                    String query = " insert into user (IDuser, username, password, nome, TypeUser)" + " values (?, ?, ?, ?, ?)";
                    preparedStmt = this.db.prepareStatement(query);
                    preparedStmt.setInt (1, n);
                    preparedStmt.setString (2, nomeUtente);
                    preparedStmt.setString   (3, pass1);
                    preparedStmt.setString(4, nome);
                    preparedStmt.setInt(5, tipoUtente);
                    preparedStmt.execute();
                    System.out.println("Utente inserito correttamente!");
                    this.registrazioneEffettuata = true;
                    
                }
                else {
                System.out.println("Nome non disponibile");
               
                }
        }
        else {
            System.out.println("Errore, le password non coincidono");
           
        }
        }
        catch (Exception exc)  { 
            System.out.println("Errore nella lettura del database, non riesco ad inserire l'utente");
            System.err.println(exc.getLocalizedMessage());
        }
        
    }
    
    private int calcoloCodiceUtente() {
        int numero =0;
        try {
            Connection userConn = this.db;
            PreparedStatement ps = userConn.prepareStatement("SELECT * FROM user");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                numero = rs.getInt("IDuser");
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database, non sono riuscito a leggere il numero degli utenti");
        }
        numero ++;
        return numero;
        
    }
    
    public int getTipoUtente() {
        return this.tipoUtente;
    }
    
    public int getCodiceUtente() {
        return this.codiceUtente;
    }
    
    public boolean getRegistrazioneEffettuata() {
        return this.registrazioneEffettuata;
    }
    
    public String getNomeUtente() {
        return this.nomeUtente;
    }
    
    public String getCognome() {
        return this.cognome;
    }
      
    
    
    
    
}
