/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Domain.Client;

/**
 *
 * @author Usuario
 */
public abstract class Account {

    //Atribute
    protected String accountNumber;
    protected double balance;
    protected Client client;

    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //-------------------------------------------------------------
    //Methods in order to represent the polimorfism
    //-------------------------------------------------------------
    public abstract void deposit(double amount);

    public abstract void Withdraw(double amount);

    public abstract double interestCalculation();

    //Redefine toString 
    public String toString() {
        String result = 
                "BANK ACCOUNT INFORMATION:"
                + "\n--------------------------------"
                + "\nAccount Number: " + this.getAccountNumber()
                + "\nBalance: " + this.getBalance()
                + "\nAccount Owner: \n" + this.getClient().toString();
        return result;
    }
}

