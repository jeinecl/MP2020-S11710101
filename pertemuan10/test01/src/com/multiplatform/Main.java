package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// Lambani, Jeine Claudia; Test 01
        //1.
        System.out.println("1. Barking Dog:");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        //2.
        System.out.println("2. Cat Playing:");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    //1. Barking dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking){
            if((hourOfDay >= 0 && hourOfDay < 8)||(hourOfDay > 22 && hourOfDay <24)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return  false;
        }
    }
    //2. Playing cat
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        }
        else
        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else {
            return false;
        }
    }
}
