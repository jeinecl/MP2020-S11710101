package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account johnAccount = new Account("123456789", "John", 100d);
//        johnAccount.accountNumber = "123456789";
//        johnAccount.name = "John";
//        johnAccount.balance = 100d;

        johnAccount.withdrawal(50);
        System.out.println("Balance = " + johnAccount.getBalance());

        johnAccount.withdrawal(51);
        System.out.println("Balance = " + johnAccount.getBalance());
    }
}
