package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        //1.
        //toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        System.out.println("valid value (number 1) : " + toMilesPerHour(10.25));
        //2.
        printConversion(1.5);
        printConversion(10.25);
    }
    //1.
    public static long toMilesPerHour(Double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
        //System.out.println("valid value: " + toMilesPerHour(1.5));
    }
    //2.
    public static void printConversion (double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("invalid value");
        }
        long milesPerHours = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h  = " + milesPerHours + " mi/h");
    }
}
