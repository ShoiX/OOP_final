/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinal;
import java.sql.*;
/**
 *
 * @author jerryco09
 */
public class OOPfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        conn con = new conn();
        
        ResultSet result = con.query("SELECT * FROM settings");
        try{
            while(result.next()){
                System.out.println(result.getString(1));
            }
        }catch(SQLException ex){
            while (ex != null) {
                System.out.println("SQL Exception: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        
    }
    
}
