package com.brocode;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args){
        // String = a reference data type that can store one or more character
        //          reference data types have access to useful methods

        String name= "Bro";

        //boolean result = name.equals("Bro");
        //int result=name.length();
        //char result=name.charAt(0);
        //int result=name.indexOf("B");
        //boolean result=name.isEmpty();
        //String result=name.toUpperCase(Locale.ROOT);
        //String result=name.toLowerCase(Locale.ROOT);
        //String result=name.trim();
        String result=name.replace('o','a');

        System.out.println(result);
    }
}
