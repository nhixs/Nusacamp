package cobaRegex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagus,Mentari,Solihin
 */
import nusaSearch.*;
import nusasort.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class javaconnect {
    private static Connection connection;
    
    public static Connection ConnectDb(){
         if (connection == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
               
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/regextest","root","");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }       
    return connection;
    }
   
    }

