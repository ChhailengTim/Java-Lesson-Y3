package com.codewithmosh;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Age: ");
        String name=scanner.nextLine().trim();
        System.out.println("You are "+name);
    }
}
