/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapp;

/**
 *
 * @author Karandeep Parashar
 */
public class Savings extends Account {
    // Properties specific to Savings account
    private int safetyDepositBoxID;
    private int safetyDepostitBoxKey;
    
    // Constructor to initilize settings for the saving properties
    public Savings(String name,String sSn, double initDeposit){
        super(name,sSn,initDeposit);
        accountNumber = "1"+accountNumber;
        setSafetyDepositBox();
        
    }
    
    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25; 
    }
    
    // List any methods specific to savings account
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
        safetyDepostitBoxKey = (int)(Math.random()*Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(
                " Your savings Account Features" + 
                "\nSafety Deposit Box ID: " + safetyDepositBoxID + 
                "\nSafety Deposit Box Key: " + safetyDepostitBoxKey        
        );
    }

    
    
}
