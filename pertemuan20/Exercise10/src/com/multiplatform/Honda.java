package com.multiplatform;

public class Honda extends Car {
    public Honda(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda HR-V is start");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda HR-V is accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Honda HR-V brakes applied, if its stopped");
    }
}
