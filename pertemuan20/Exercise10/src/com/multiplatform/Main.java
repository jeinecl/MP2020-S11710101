package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //3 fav vehicle
        Car hondaCRV = new Honda("Honda CR-V", 4);
        hondaCRV.startEngine();
        hondaCRV.accelerate();
        hondaCRV.brake();

        Car suzukiCarry = new Suzuki("Suzuki Carry", 5);
        suzukiCarry.startEngine();
        suzukiCarry.accelerate();
        suzukiCarry.brake();

        Car chevroletColorado = new Chevrolet("Chevrolet Colorado", 6);
        chevroletColorado.startEngine();
        chevroletColorado.accelerate();
        chevroletColorado.brake();
    }
}
