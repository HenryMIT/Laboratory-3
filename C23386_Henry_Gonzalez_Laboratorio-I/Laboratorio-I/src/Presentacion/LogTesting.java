/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

import Domain.Client;
import Logic.Account;
import Logic.Log;
import Logic.SavingAccount;
import Logic.CurrentAccount;

/**
 *
 * @author Usuario
 */
public class LogTesting {

    public LogTesting() {
    }

    public void test() {

        Client client1 = new Client("7-0280-0839", "Neythan", "88501700", "Limon, Veracruz");
        Client client2 = new Client("3-0557-0126", "Diana", "89081309", "Limon, Pueblo Nuevo");
        Client client3 = new Client("2-0255-0255", "Carlos", "87755565", "Limon, Juan Pablo");
        Client client4 = new Client("3-0321-0987", "Rodrigo", "702514256", "Limon, Corina 1");
        Client client5 = new Client("6-0852-0654", "Adriana", "65522235", "Limon, Corina 2");
        Client client6 = new Client("4-0741-0321", "Ludobiko Peluche", "72126363", "Limon, Limon Centro");

        Account account1 = new SavingAccount("2024-03-15", 12, 15, "104560", 25000, client1);
        Account account2 = new SavingAccount("2024-03-15", 6, 12, "104561", 15000, client2);
        Account account3 = new SavingAccount("2024-03-16", 3, 1, "104562", 41000, client3);
        Account account4 = new CurrentAccount(12, "104563", 12000, client4);
        Account account5 = new CurrentAccount(13, "104564", 5000, client5);
        Account account6 = new CurrentAccount(8, "104565", 120000, client6);

        Log log[] = new Log[6];
        log[0] = new Log("Amount Deposit", account1, 7000); 
        account1.deposit(log[0].getMovement());
        log[1] = new Log("Amount Deposit", account2, 5000);
        account2.deposit(log[1].getMovement());
        log[2] = new Log("Withdrawal Amount", account3, 5000);
        account3.Withdraw(log[2].getMovement());
        log[3] = new Log("Amount Depositt", account4, 5000);
        account4.deposit(log[3].getMovement());
        log[4] = new Log("Withdrawal Amount", account5, 7000);
          account5.Withdraw(log[4].getMovement());
        log[5] = new Log("Amount Deposit", account6, 5000);
        account6.deposit(log[5].getMovement());

        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println(log[i].toString());
            }
        }
    }
}
