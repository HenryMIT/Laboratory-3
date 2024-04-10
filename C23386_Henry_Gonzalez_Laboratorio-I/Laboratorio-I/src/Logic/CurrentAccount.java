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
public class CurrentAccount extends Account {

    //Atributes
    private float interest;

    public CurrentAccount(float interest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(interestCalculation() + amount);
    }

    @Override
    public void Withdraw(double amount) {
        super.setBalance(interestCalculation() - amount);
    }

    @Override
    public double interestCalculation() {
        double interestTotal = 0;
        interestTotal = super.getBalance() * (this.getInterest() / 100) / 12;
        return super.getBalance() + interestTotal;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    // To String
    public String toString() {

        String result = "\nACCOUNT TYPE: CURRENT ACCOUNT"
                + "\nInterest: " + this.getInterest() + "%"
                + "\nInterest you got: "
                + (super.getBalance() * (this.getInterest() / 100) / 12)
                + "\nInterest Won: " + this.interestCalculation();

        return super.toString() + result;
    }

}
