package com.multiplatform;

public class Person {
    //fields
    private String firstName;
    private String lastName;
    private int age;

    //methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String setFirstName(String firstName){
        return this.firstName = firstName;
    }
    public String setLastName(String  lastName){
        return this.lastName = lastName;
    }
    public int setAge(int age){
        return this.age = age;
    }
    public boolean isTeen(){
        if(age > 12 && age  < 20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        if(lastName.isEmpty()){
            return this.firstName;
        }
        if(firstName.isEmpty()){
            return this.lastName;
        }
        return firstName + " " + lastName;
    }
}
