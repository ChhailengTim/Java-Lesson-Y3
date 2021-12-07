package com.brocode;

public class Constructor {
    public static void main(String[] args){
        // constructor = special method that is called when an object is instantiated (created)

        Human human1=new Human("Rich",65,70);
        Human human2=new Human("Rich",65,70);

        human2.eat();
        //System.out.println(this.name);
        human1.drink();
    }
}