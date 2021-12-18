package com.brocode;

public class Bus {
    private String make;
    private String model;
    private int year;

    Bus(String make,String model,int year){
        //this.make=make;
        //this.model=model;
        this.setMake(make);
        this.setModel(model);
       // this.year=year;
        this.setYear(year);
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
}
