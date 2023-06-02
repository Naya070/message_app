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
    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/Messages_Application","root","");
            if(connection != null){
                System.out.println("conexión exitosa");
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return connection;
    }
    
}
