package com.multiplatform;

public class Car {
    //2 member dalam class
    //1. field:
    public String model;
    private int doors;
    private int wheels;
    private String engine;
    //2. method

    //setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("agya") || validModel.equals("xenia")){
            this.model = model;//pake this supaya dibedakan argumen dengan field diatas
        }
        else {
        this.model = "unknown";
    }
    //getter
//    public String getModel(){
//        return this.model; //tetap pake this supaya konsisten
//    }

}
    public String getModel() {
        return this.model;
    }
    }
