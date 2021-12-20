package com.brocode;

import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args){

        // polymorphism = many shapes/forms
        // dynamic = after compilation (during runtime)

        // ex. A corvette is a: corvette, and a car, and a vehicle, and an object

        Scanner scanner=new Scanner(System.in);
        Pig pig;

        System.out.println("What beast do you want?");
        System.out.println("(1=dog) or (2=cat): ");
        int choice=scanner.nextInt();

        if(choice==1){
            pig=new Wing();
            pig.speak();
        }
        else if(choice==2){
            pig=new Duck();
            pig.speak();
        }
        else {
            pig=new Pig();
            System.out.println("That choice was invalid");
            pig.speak();
        }
    }
}
