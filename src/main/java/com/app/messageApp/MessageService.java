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
    }
    public static void updateMessageService(){
    }
}
