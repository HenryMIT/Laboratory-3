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
public class SavingAccount extends Account {

    //Atributes 
    private String startDate;
    private int monthsNumber;
    private float intererest;

    
    public SavingAccount(String startDate, int monthsNumber, float intererest, String accountNumber, double balance, Client client) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.monthsNumber = monthsNumber;
        this.intererest = intererest;
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
        interestTotal = (this.getMonthsNumber()
                * super.getBalance())
                * (this.getInterest()/100);

        return super.getBalance() + interestTotal;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthsNumber() {
        return monthsNumber;
    }

    public void setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
    }

    public float getInterest() {
        return intererest;
    }

    public void setIntererest(float intererest) {
        this.intererest = intererest;
    }

    //to String
    public String toString() {
        String result = "\nACCOUNT TYPE: SAVING ACCOUNT"
                + "\nSaving Start Date: " + this.getStartDate()
                + "\nMonths: " + this.getMonthsNumber()
                + "\nInterest: " + this.getInterest() + "%"
                + "\nInterest you got: "
                + (this.getMonthsNumber()
                * super.getBalance()
                * (this.getInterest()/100)
                / 100)
                + "\nStart Date + Interest Won: " + this.interestCalculation();
        return super.toString() + result;
    }

}
