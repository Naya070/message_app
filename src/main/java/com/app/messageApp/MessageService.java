/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.messageApp;

import java.util.Scanner;
/**
 *
 * @author naya
 */
public class MessageService {
    public static void createMessageService() {
        Scanner sc = new  Scanner(System.in);
        
        System.out.println("Write your message:");
        String message = sc.nextLine();
        
        System.out.println("Your Name:");
        String name = sc.nextLine();
        
        Message record = new Message();
        record.setMessage(message);
        record.setAuthorMessage(name);
        
        MessageDAO.createMessageDB(record);
        
    }
    public static void readMessageService(){
        MessageDAO.readMessageDB();
    }
    public static void deleteMessageService(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indicates the ID of the message to delete");
        int idMessage = sc.nextInt();
        MessageDAO.deleteMessageDB(idMessage);
    }
    public static void updateMessageService(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your new message");
        String message = sc.nextLine();
        
        System.out.println("Indicates the ID of the message to delete");
        int idMessage = sc.nextInt();
        Message actualization = new Message();
        actualization.setIdMessage(idMessage);
        actualization.setMessage(message);
        MessageDAO.updateMessageDB(actualization);
        


        
    }
}
