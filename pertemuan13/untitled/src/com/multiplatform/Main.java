package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account johnsAcount = new Account("1111111", 200.00, "John", "john@mail,com", "12345678");
//        johnsAcount.setCostumerName("Bob");
//        johnsAcount.setNumber("123456789");
//        johnsAcount.setBalance(100.00);
//        johnsAcount.setEmailAddress("bob@mail.com");
//        johnsAcount.setPhoneNumber("(62)811324234");

        System.out.println("Customer name: " + johnsAcount.getCostumerName());
        System.out.println("Balance: " + johnsAcount.getBalance());
        johnsAcount.deposit(50.0);
        System.out.println("Balance: " + johnsAcount.getBalance());
        johnsAcount.withdrawal(155.0);

        //Object for default constructor
        Account bobsAccount = new Account();
        System.out.println("Customer name: " + bobsAccount.getCostumerName());
        System.out.println("Balance: " + bobsAccount.getBalance());

        Account mikesAccount = new Account("Mike", "mike@mail.com", "123123123");
        System.out.println("Customer name: " + mikesAccount.getCostumerName());
        System.out.println("Balance: " + mikesAccount.getBalance());

    }
}
