package com.brocode;

public class ToStringMethod {
    public static void main(String[] args){
        // toString() = special method that all object inherit,
        //              that returns a string that "textually represents" an object.
        //              can be used both implicitly and explicitly
        Cars cars=new Cars();

        //System.out.println(cars.toString());
        System.out.println(cars);
    }
}
