/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;
import com.mysql.jdbc.Connection;


/**
 *
 * @author toalgrim
 */
public class NewMain {

   
    public static void main(String[] args) {
        Connection db = null;
        try {
            db = new DBConnection().connect();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
        LoginGui a = new LoginGui(db);
    }
    
}
