/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NmapTutor;

import java.sql.*;

/**
 *
 * @author work
 */
public class DBConnectionlookup {
    
    Connection conlookup =null;
    
    public static Connection  ConnectionDB(){
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conlookup = DriverManager.getConnection("jdbc:sqlite:lookup.db");
            System.out.println("Connection  Succeeded");
            return conlookup;
            
    }
    catch(Exception e){
        System.out.println("Connection failed" + e);
        return null;
        
        
    }
}
   }    