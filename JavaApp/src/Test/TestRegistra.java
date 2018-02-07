/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Old.Register;
import java.sql.*;

/**
 *
 * @author codrin
 */
public class TestRegistra {
    public static void main(String[] args) throws SQLException{
        
        Register register1 = new Register(); 
        Register.aggiungiUtente();
    }
    
}
