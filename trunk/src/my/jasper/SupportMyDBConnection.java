/*
 * SupportMyDBConnection.java
 *
 * Created on September 6, 2007, 11:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package my.jasper;

import java.sql.*;

/**
 *
 * @author noniko
 */
public class SupportMyDBConnection {
    
    private Connection myConnection;
    
    /**
     * Creates a new instance of SupportMyDBConnection
     */
    public SupportMyDBConnection() {
        
    }
    
    public void init(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            myConnection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/patienttracker","root", "heyyou");
        } catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
                rs.close();
            } catch(Exception e){}
            
        }
    }
    
    public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
                stmt.close();
            } catch(Exception e){}
            
        }
    }
    
    public void destroy(){
        
        if(myConnection !=null){
            
            try{
                myConnection.close();
            } catch(Exception e){}
            
            
        }
    }
    
}
