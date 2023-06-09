/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.messageApp;

/**
 *
 * @author naya
 */
public class Message {
    int idMessage;
    String message;
    String authorMessage;
    String dateMessage;
    
    //Constructor por defecto para cualquier operación
    public Message(){
    }
    
    //Constructor para enviar todos los datos a la BD cuando
    //estemos creando un mensaje
    public Message(String message, String authorMessage, String dateMessage) {
        this.message = message;
        this.authorMessage = authorMessage;
        this.dateMessage = dateMessage;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessage() {
        return authorMessage;
    }

    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public String getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(String dateMessage) {
        this.dateMessage = dateMessage;
    }

    

    
}
