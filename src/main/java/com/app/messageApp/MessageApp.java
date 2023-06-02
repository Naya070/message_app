/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.app.messageApp;

import java.sql.Connection;

/**
 *
 * @author naya
 */
public class MessageApp {

    public static void main(String[] args) {
        ConnectionBD connection = new ConnectionBD();
        try(Connection cnx = connection.get_connection()){
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
