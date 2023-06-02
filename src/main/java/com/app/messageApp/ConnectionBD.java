/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.messageApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author naya
 */
public class ConnectionBD {
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/MessagesApplication","root","");
            
        }
        catch(SQLException e){
            System.out.println("Clase connectionBD");
            System.out.println(e);
        }
        return connection;
    }
    
}
