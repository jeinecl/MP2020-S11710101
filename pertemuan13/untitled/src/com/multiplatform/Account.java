package com.multiplatform;

public class Account {
    private String number;
    private double balance;
    private String costumerName;
    private String emailAddress;
    private String phoneNumber;

    //Constructor
    public Account(){
        //System.out.println("Constructor without parameter is running");
        this("99999999", 0.0, "Default name", "Default email", "Default phone number" );
    }

    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.costumerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Account(String costumerName, String emailAddress, String phoneNumber) {
//        this.costumerName = costumerName;
//        this.emailAddress = emailAddress;
//        this.phoneNumber = phoneNumber;
        this("999999", 0.0, costumerName, emailAddress, phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void deposit(double amount){
        this.balance += amount; //this.balance = this.balance + amount;
        System.out.println("Deposit of " + amount + " made. Now balance is " + this.balance);
    }

    public void withdrawal (double amount){
        if(this.balance - amount < 0){
            System.out.println("Insufficient funds. Withdrawal not processes");
        }else{
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance is " + this.balance);
        }
    }

//    public void setNumber(String number) {
//        this.number = number;
//    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public String getCostumerName() {
        return costumerName;
    }

//    public void setCostumerName(String costumerName) {
//        this.costumerName = costumerName;
//    }

    public String getEmailAddress() {
        return emailAddress;
    }

//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}
