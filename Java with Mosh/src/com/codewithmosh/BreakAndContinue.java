package com.codewithmosh;

import java.util.Locale;
import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input="";
        while(true){
            System.out.print("Input: ");
            input=scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
