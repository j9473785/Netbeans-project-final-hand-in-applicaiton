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
public class DBConnection {
    
    Connection con =null;
    
    public static Connection  ConnectionDB(){
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:login1.db");
            System.out.println("Connection  Succeeded");
            return con;
            
    }
    catch(Exception e){
        System.out.println("Connection failed" + e);
        return null;
        
        
    }
}
   }    