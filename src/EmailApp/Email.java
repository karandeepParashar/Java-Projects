/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailApp;

import java.util.Scanner;

/**
 *
 * @author Karandeep Parashar
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength=10;
    private String companySuffix = "aeycompany.com";
    
//Constructor with lastname and firstname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED for:"+this.firstName+" "+this.lastName);
        
        // Call a method for asking department - return department
        this.department = setDepartment();
        //System.out.println("Department: "+this.department);
        
        // Call a method to return random password
        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println("Your password is :"+ this.password);
        
        // Combine elements to generate email
        this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Your Email is: "+email);
    }
// ask for a department
    private String setDepartment(){
        System.out.print("New Worker "+this.firstName+". DEPARTMENT CODES:\n1 for Sales \n2 for Development \n3 for Accounting\n0 for None\nEnter department Code: ");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        switch(deptChoice)
        {
            case 0:
               this.department = "none"; 
               return this.department;
            case 1:
                this.department = "sales";
                return this.department;
            case 2:
                this.department = "development";
                return this.department;
            case 3:
                this.department = "accounting";
                return this.department;
        }
        return "None";
    }   
// generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%1234567890";
        String password = "";
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random()* passwordSet.length());
            password += passwordSet.charAt(rand);
        }
        return password;
    }
// set mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }
// set alternate email
    public void setAlternateEmail(String altEmail){
    this.alternateEmail = altEmail;
    }         
// change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){ return this.mailboxCapacity;}
    
    public String getAlternateEmail(){return alternateEmail;}
    
    public String getPassword(){return this.password;}
    
    public String showInfo(){
        return "DISPLAY_NAME: "+firstName+" "+lastName+
                "\nCOMPANY EMAIL: "+email+
                "\nEMAIL CAPACITY: "+mailboxCapacity+"mb";
    }
}
