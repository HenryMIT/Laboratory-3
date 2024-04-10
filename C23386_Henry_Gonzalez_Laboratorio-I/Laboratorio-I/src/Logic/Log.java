/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Log {

    //Atributes 
    private int EventId;
    private String event;
    private Date date;
    private Account account;
    private double movement;

    private static int consecutive = 0;

    public Log() {
        this.EventId = ++consecutive;
    }

    public Log( String event, Account account, double movement) {
        this();//call to the constructor    
        this.event = event;
        this.date= new java.util.Date();
        this.account = account;
        this.movement = movement;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int EventId) {
        this.EventId = EventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        Log.consecutive = consecutive;
    }

    @Override
    public String toString() {
        String result = "BANK LOG INFORMATION"
                + "\n-------------------------------"
                + "\nEvent ID:" + this.getEventId()
                + "\nEvent Type: " + this.getEvent()
                + "\nTransaction Date: " + this.getDate()
                + ",\nMovement Amount: " + this.getMovement()
                + "\nAffected Account: " + this.getAccount().toString()
                +"\n\n--------------------------------------\n\n";
        
        return result;
    }

}
