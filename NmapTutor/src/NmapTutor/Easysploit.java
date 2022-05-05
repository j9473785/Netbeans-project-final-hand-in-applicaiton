/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NmapTutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author work
 */
public class Easysploit {
    
    public static Connection connectDB(){ 
        
        try{
            
          Class.forName("org.sqlite.JDBC");
          Connection conn = DriverManager.getConnection("jdbc:sqlite:login:\\C:\\Users\\work\\Documents\\NetBeansProjects\\login.db");
          System.out.println("Connection Sucessful");
          
          return conn;
          
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println("Connection Failed "+e);
            return null;
        }
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        
    }
    
}
        
