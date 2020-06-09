package com.multiplatform;

public class Main {

    public static void main(String[] args) {
//        int myValue = 10000;
//
//        int myMaxIntValue = Integer.MAX_VALUE;
//        int myMinIntValue = Integer.MIN_VALUE;
//        System.out.println("Integer Maximum INT Value = " + myMaxIntValue);
//        System.out.println("Integer Minimum INT Value = " + myMinIntValue);
//        System.out.println("Overflow max INT Value = " + (myMaxIntValue + 1));
//        System.out.println("Underflow min INT Value = " + (myMinIntValue - 1));
//
//        int myMaxByteValue = Byte.MAX_VALUE;
//        int myMinByteValue = Byte.MIN_VALUE;
//        System.out.println("Byte Maximum BYTE Value = " + myMaxByteValue);
//        System.out.println("Byte Minimum BYTE Value = " + myMinByteValue);
//        System.out.println("Overflow max BYTE Value = " + (myMaxByteValue + 1));
//        System.out.println("Underflow min BYTE Value = " + (myMinByteValue - 1));
//
//        int myMaxShortValue = Short.MAX_VALUE;
//        int myMinShortValue = Short.MIN_VALUE;
//        System.out.println("Short Maximum SHORT Value = " + myMaxShortValue);
//        System.out.println("Short Minimum SHORT Value = " + myMinShortValue);
//        System.out.println("Overflow max SHORT Value = " + (myMaxShortValue + 1));
//        System.out.println("Underflow min SHORT Value = " + (myMinShortValue - 1));
//
//        long myMaxLongValue = Long.MAX_VALUE;
//        long myMinLongValue = Long.MIN_VALUE;
//        System.out.println("Integer Maximum LONG Value = " + myMaxLongValue);
//        System.out.println("Integer Minimum LONG Value = " + myMinLongValue);
//        System.out.println("Overflow max LONG Value = " + (myMaxLongValue + 1));
//        System.out.println("Underflow min LONG Value = " + (myMinLongValue - 1));
//
//        long myBigLongValue = 2_147_483_647_234L;
//
//        //Type Casting
//        int myNewIntValue = (myMinIntValue / 2);
//        byte myNewByteValue = (byte) (myMinByteValue / 2);
//        short myNewShortValue = (short) (myMinShortValue / 2);

        //Exercise 01
        byte newByteValue = 22;
        short newShortValue = 2;
        int newIntValue = 65;
        long total = newByteValue + newShortValue + newIntValue;
        long totalLongValue = 50000L + 10L * total;
        System.out.println("Total = " + totalLongValue);
    }
}
