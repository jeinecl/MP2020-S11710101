package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// Lambani, Jeine Claudia; Test 01
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
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
}
