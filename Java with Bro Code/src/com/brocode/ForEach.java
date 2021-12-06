package com.brocode;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        // for-each = traversing technique to iterate through the elements in an array/collection
        //             less steps, more readable
        //              less flexible

        //String[] animal={"Cat","Dog","Rat","Bird"};
        ArrayList<String>animal=new ArrayList<String>();
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Rat");
        animal.add("Bird");


        for(String i:animal){
            System.out.println(i);
        }
    }
}
