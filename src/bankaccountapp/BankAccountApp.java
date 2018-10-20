/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Karandeep Parashar
 */
public class BankAccountApp {
    public static void main(String[] args) throws IOException {
        List<Account> accounts = new LinkedList<Account>();
       
        // Read a CSV file then create new accounts base on that data
        String file = "C:\\Users\\Karandeep Parashar\\Documents\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders)
        {
            String name = accountHolder[0];
            String sSN  = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name+" "+sSN+" "+accountType+" $"+initDeposit);
            if(accountType.equals("Savings"))
            {
                accounts.add(new Savings(name,sSN,initDeposit));
            }
            else if(accountType.equals("Checking"))
            {
                accounts.add(new Checking(name,sSN,initDeposit));
            }
            else
            {
                    System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        
        for(Account acc: accounts)
        {
            acc.showInfo();
            System.out.println("\n*******************");
        }
        
        accounts.get((int)(Math.random()*accounts.size())).deposit(1000);
        accounts.get((int)(Math.random()*accounts.size())).withdraw(1000);        
    }
}
