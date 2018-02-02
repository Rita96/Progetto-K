/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;

import static JavaApplication.Oggetto.preparedStmt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.Statement;


/**
 *
 * @author cl411381
 */
public class Login {
    
    private final static int NUMERO_UTENTE_BASE = 1000;
    Connection db;
    private int codiceUtente;
    private int tipoUtente;
    private boolean registrazioneEffettuata = false;
    
    
    public Login(String nomeUtente, String password) {
        int n[];
        try {
            db = new DBConnection().connect();
            if (verificaUtentePassword(nomeUtente, password)) {
                System.out.println("Utente trovato");
                n = tipoUtente(nomeUtente);
                codiceUtente = n[1];
                tipoUtente = n[0];
                
            }
            else {
            System.out.println("Utente non trovato, riprova");
            }
        } catch (Exception e) {
            System.out.println("Errore nella connessione del database");
        }
        
        
    }
    
    public Login(String nomeUtente, String pass1, String pass2, String nome) {
        try {
            db = new DBConnection().connect();
            creaNuovoUtente(nomeUtente, pass1, pass2, nome);
            
            }
        catch (Exception e) {
            System.out.println("Errore nella connessione del database");
        }
        
        
        
    }
    
    
    /* Metodo che verifica se il nome utente e la password coincidono*/
    public boolean verificaUtentePassword(String nomeUtente, String password) {
        boolean presenza = false;
        String sql = "select * from user where username=? and password=?";
        try {
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, nomeUtente);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                presenza = true;
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database");
        }
        
        return presenza;
    }
    
    
    /* Metodo che restituisce il codice dell'utente e il tipo*/
    private int[] tipoUtente(String nomeUtente) {
        int tipo[] = {0, 0};
       
        
        try {
            String sql = ("SELECT * FROM user WHERE username = '" + nomeUtente + "'");
            PreparedStatement ps = db.prepareStatement(sql);
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
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                presenza = true;
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database");
        }
        return presenza;
    }
    
    
    private void creaNuovoUtente(String nomeUtente, String pass1, String pass2, String nome) {
        
        Connection conn; 
        try {
                
            PreparedStatement preparedStmt;
            int n = calcoloCodiceUtente();
            System.out.println(n);

            if (pass1.equals(pass2)) {
                if (!userPresente(nomeUtente)) {
                String query = " insert into user (IDuser, username, password, nome, TypeUser)" + " values (?, ?, ?, ?, ?)";
                preparedStmt = db.prepareStatement(query);
                preparedStmt.setInt (1, n);
                preparedStmt.setString (2, nomeUtente);
                preparedStmt.setString   (3, pass1);
                preparedStmt.setString(4, nome);
                preparedStmt.setInt(5, 1);
                preparedStmt.execute();
                db.close();
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
            System.out.println("Errore nella lettura del database");
            System.err.println(exc.getLocalizedMessage());
        }
        
    }
    
    private int calcoloCodiceUtente() {
        int numero = 0;
        try {
            Connection userConn = new DBConnection().connect();
            PreparedStatement ps = userConn.prepareStatement("SELECT * FROM user");
            ResultSet rs = ps.executeQuery();
            //rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getInt("IDuser"));
                numero++;
            }
        }
        catch (Exception e) {
            System.out.println("Errore nell'accesso del database");
        }
        return NUMERO_UTENTE_BASE + numero;
        
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
      
    
    
    
    
}
