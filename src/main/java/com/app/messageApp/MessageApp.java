/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.app.messageApp;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author naya
 */
public class MessageApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        do{
            System.out.println("-----------------------");
            System.out.println("MESSAGES APPLICATION");
            System.out.println("1. Create Message");
            System.out.println("2. Read Message");
            System.out.println("3. Update Message");
            System.out.println("4. Delete Message");
            System.out.println("5. Exit");
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    MessageService.createMessageService();
                    break;
                case 2: 
                    MessageService.readMessageService();
                    break;
                case 3:
                    MessageService.updateMessageService();
                    break;
                case 4:
                    MessageService.deleteMessageService();
                    break;
                default:
                    break;
               
            }
            
        }while(option != 5);
        sc.close();
        System.out.println("You have successfully exited the program");
    }
}
