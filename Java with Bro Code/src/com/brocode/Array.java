package com.brocode;

public class Array {
    public static void main(String[] args){
        // array = used to store multiple values in a single variable

        //String[] cars={"Camaro","Lambogeni","Tesla"};

        //cars[0]="Mustang";
        //System.out.println(cars[2]);

        String[] cars=new String[3];

        cars[0]="Lambogeni";
        cars[1]="BMW";
        cars[2]="Tesla";

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
