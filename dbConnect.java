package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danish Naseem
 */

import newpackage.DriverManager;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {

 
     
    public static final String db ="jdbc:mysql://localhost:3306/library";        //global constant variable
    public static final String username = "root";
    public static final String password = "";
    public static final String driverName = "com.mysql.cj.jdbc.Driver"; 
    public static  Connection con = null;
    
    public static Connection getConnection()        //declearing a function whis is to be call in main function
    {
       try
       {
          Class.forName(driverName);
          try
          { con = DriverManager.getConnection(db, username, password); 
            System.out.println("Database connected succesfully");
          }catch(SQLException e)
          {
              System.out.println("Database Connection Failed");
          }
       }catch(ClassNotFoundException ex)
       {
           System.out.println("Driver Cannot Found!");
       }  
        
       return con;  
    }
    public static void main( String[] args)       //MAIN Functiion
    {
        getConnection();            //Calling the Public Function  getConnection();
          
    }
    
}


