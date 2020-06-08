package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMaxIntValue = Integer.MAX_VALUE;
	    int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Integer Minimum Value = " + myMinIntValue);

        System.out.println("Overflow max Value = " + (myMaxIntValue + 1));
        System.out.println("Underflow min Value = " + (myMinIntValue - 1));

    }
}
