package com.multiplatform;

public class Suzuki extends Car {
    public Suzuki(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Suzuki Carry is start");
    }

    @Override
    public void accelerate() {
        System.out.println("Suzuki Carry is accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Suzuki Carry brakes applied, if its stopped");
    }
}
