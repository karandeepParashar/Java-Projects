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
public class Checking extends Account {
    // List the properties specific to checking account
    int debitCardNumber;
    int debitCardPin;
    
    // Cinstructor to initialize checking properties
    public Checking(String name,String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();
    }
    
    public void setRate(){
        rate = getBaseRate() * 0.15;
    }
    // List any method specific to checking account
    private void setDebitCard(){
        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPin = (int) (Math.random()*Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(" Your Checking Account Features"+"\nDebit Card Number: "+debitCardNumber+"\nDebit Card Pin: "+debitCardPin);
        
    }
}
