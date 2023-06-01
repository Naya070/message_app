/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.app.message_app;

import java.sql.Connection;

/**
 *
 * @author naya
 */
public class Message_app {

    public static void main(String[] args) {
        Connection_bd connection = new Connection_bd();
        try(Connection cnx = connection.get_connection()){
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
