package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account johnsAcount = new Account("111111," 200.00, "John", "john@mail.com", );
        johnsAcount.setCostumerName("Bob");
        johnsAcount.setNumber("123456789");
        johnsAcount.setBalance(100.00);
        johnsAcount.setEmailAddress("bob@mail.com");
        johnsAcount.setPhoneNumber("(62)811324234");

        System.out.println("Customer name: " + johnsAcount.getCostumerName());
        System.out.println("Balance: " + johnsAcount.getBalance());
        johnsAcount.deposit(50.0);
        System.out.println("Balance: " + johnsAcount.getBalance());
        johnsAcount.withdrawal(155.0);
    }
}
