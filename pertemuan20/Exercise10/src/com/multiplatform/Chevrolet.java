package com.multiplatform;

public class Chevrolet extends Car {
    public Chevrolet(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Chevrolet Colorado is start");
    }

    @Override
    public void accelerate() {
        System.out.println("Chevrolet Colorado is accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Chevrolet Colorado brakes applied, if its stopped");
    }
}
