package com.brocode;

public class GenericsDemo {
    public static void main(String[] args){
        // generics = enable types (classes and interfaces) to be parameters when defining:
        //            classes, interfaces and methods
        //            a benefit is to eliminate the need to create multiple versions
        //            of methods or classes for various data types.
        //            Use 1 version for all reference data types
        //

        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={5.5,4.4,3.3,2.2,1.1};
        Character[] charArray={'H','E','L','L','O'};
        String[] stringArray={"B","Y","E"};

        //displayArray(intArray);
        //displayArray(doubleArray);
        //displayArray(charArray);
        //displayArray(stringArray);
        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }
    public static <Thing> void displayArray(Thing[] array){

        for (Thing x:array){
            System.out.println(x+"");
        }
        System.out.println();
    }
    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }
}
