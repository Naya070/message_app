/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.messageApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author naya
 */
public class MessageDAO {
    public static void createMessageDB(Message message) {
        ConnectionBD dbConnect = new ConnectionBD();
        try(Connection connection = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
            String query = "INSERT INTO `messages`(`message`, `authorMessage`) VALUES (?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getAuthorMessage());
            ps.executeUpdate();
            System.out.println("Message created successfully");}
            catch(SQLException e){
                System.out.println("Message could not be created");
                System.out.println(e);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
    public static void readMessageDB(){
        ConnectionBD dbConnect = new ConnectionBD();
        try(Connection connection = dbConnect.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs=null;
            
            try{
                String query = "SELECT * FROM `messages`";
                ps = connection.prepareStatement(query);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    System.out.println("ID: "+rs.getInt("IdMessage"));
                    System.out.println("Message: "+rs.getString("Message"));
                    System.out.println("Author: "+rs.getString("AuthorMessage"));
                    System.out.println("Date: "+rs.getString("DateMessage"));
                    System.out.println("");
                }
            }
            catch(SQLException e){
                System.out.println("Clase MessagesDAO");
                System.out.println("Messages could not be retrieved");
                System.out.println(e);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }

        
    }
    public static void deleteMessageDB(int idMessage){
        ConnectionBD dbConnect = new ConnectionBD();
        try(Connection connection = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
            String query = "DELETE FROM messages WHERE `messages`.`idMessage` = ?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, idMessage);
            ps.executeUpdate();
            System.out.println("Message erased successfully");}
            catch(SQLException e){
                System.out.println("Message could not be erased");
                System.out.println(e);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }

    }
    public static void updateMessageDB(Message message){
        ConnectionBD dbConnect = new ConnectionBD();
        try(Connection connection = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
            String query = "UPDATE `messages` SET `message` = ? WHERE `messages`.`idMessage` = ?";
            ps = connection.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setInt(2, message.getIdMessage());
            ps.executeUpdate();
            System.out.println("Message updated successfully");}
            catch(SQLException e){
                System.out.println("Message could not be updated");
                System.out.println(e);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }

    }
}
