package com.codewithmosh;

public class Casting {
    public static void main(String[] args){
        //Implicit casting
        //byte>short>int>long>float>double
        String x="1";
        double y=Double.parseDouble(x)+2;
        System.out.println(y);
    }
}
