package com.brocode;

public class CopyObjects {
    public static void main(String[] args){

        Cat cat1=new Cat("Chevrolet","Camaro",2021);
        //Cat cat2=new Cat("Ford","Mustang",2022);

        //cat2.copy(cat1);
        Cat cat2=new Cat(cat1);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println();
        System.out.println(cat1.getMake());
        System.out.println(cat1.getModel());
        System.out.println(cat1.getYear());
        System.out.println();
        System.out.println(cat2.getMake());
        System.out.println(cat2.getModel());
        System.out.println(cat2.getYear());
    }
}
