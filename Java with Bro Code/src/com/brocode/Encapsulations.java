package com.brocode;

import com.brocode.package1.B;

public class Encapsulations {
    public static void main(String[] args){
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters & setters)
        //                 You should make attributes private if you don't have a reason to make them public/protected

        Bus bus=new Bus("Chevrolet","Camaro",2021);
        bus.setYear(2022);
        System.out.println(bus.getMake());
        System.out.println(bus.getModel());
        System.out.println(bus.getYear());


    }
}
