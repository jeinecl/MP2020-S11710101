package com.multiplatform;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    Car(){

    }

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public Car(String name, int cylinders) {
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Car is started");
    }

    public void accelerate(){
        System.out.println("Car is accelerated");
    }

    public void brake(){
        System.out.println("Car brakes applied if its stopped");
    }

}
