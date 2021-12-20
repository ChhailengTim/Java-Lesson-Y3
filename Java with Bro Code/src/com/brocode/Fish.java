package com.brocode;

public class Fish implements Pray,Predator{
    @Override
    public void flee() {
        System.out.println("This fish is fleeing from a larger fish");
    }

    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }
}
