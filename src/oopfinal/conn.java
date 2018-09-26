/*
*   MySQL database connection object
*
*/
package oopfinal;
import java.sql.*;
/**
 *
 * @author jerryco09
 */

public class conn {
    public Connection con;
    public Statement stmt = null;
    public static final String dbname = "hrer";
    public static final String dbuname = "user";
    public static final String dbupass = "Mmdapo09!";
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname, dbuname, dbupass);  
        }
        catch (Exception e){
            System.out.println("Cannot connect to database");
        }
    }
    
    public ResultSet query(String q){
        ResultSet rs = null;
       
        try{
            stmt = con.createStatement();
            String query = q;
            rs = stmt.executeQuery(query);
            
        }
        catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQL Exception: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        return rs;
    }
    
    public void close(){
        try{
            con.close();
            stmt.close();
        }catch(SQLException ex){
            
        }
        
    }
    
    
    
    
}
