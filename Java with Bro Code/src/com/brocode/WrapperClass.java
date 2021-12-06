package com.brocode;

public class WrapperClass {
    public static void main(String[] args){
        // wrapper class = provide a way to use primitive data type as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.Arraylist)

        //primitive  //wrapper
        //---------  //-------
        //boolean    Boolean
        //char       Character
        //int        Integer
        //double     Double

        //autoboxing = the automatic conversion that the Java compiler makes between the primitive type and their corresponding object wrapper class
        //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a=true;
        Character b='@';
        Integer c=123;
        Double d=3.14;
        String e="Bro";

        if(a==true){
            System.out.println("This is true");
        }

    }
}
