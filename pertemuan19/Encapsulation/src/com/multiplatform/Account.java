package com.multiplatform;

class Account {
    private String accountNumber;
    private String firstName;
    private double balance;

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public Account(String accountNumber, String name, double balance) {
        if(balance > 100){
            this.balance = 100;
        }
        this.accountNumber = accountNumber;
        this.firstName = name;
        this.balance = balance;
    }

    public void withdrawal(double amount){
        if(balance - amount < 0){
            System.out.println("Not enough balance");
        }else{
            balance -= amount;
            System.out.println("Withdrawal completed");
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getBalance(){
        return balance;
    }

}
