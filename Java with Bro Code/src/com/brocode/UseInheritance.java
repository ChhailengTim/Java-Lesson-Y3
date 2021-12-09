package com.brocode;

public class UseInheritance {
    public static void main(String[] args){
        // inheritance = the process where one class acquires,
        //               the attributes and methods of another.

        CarNew carNew=new CarNew();

        //carNew.go();

        Bicycle bike=new Bicycle();

        //bike.stop();

        //System.out.println(carNew.speed);
        //System.out.println(bike.speed);

        System.out.println(carNew.doors);
        System.out.println(bike.pedals);
    }
}
