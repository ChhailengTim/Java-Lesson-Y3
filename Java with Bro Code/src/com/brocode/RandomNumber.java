package com.brocode;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random random=new Random();

        //int x=random.nextInt(6)+1;
        //double y=random.nextDouble();
        boolean z=random.nextBoolean();

        System.out.println(z);
    }
}
