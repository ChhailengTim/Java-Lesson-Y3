package com.brocode;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args){
        // logical operators = used to connect two or more expression
        //
        //          && = (AND) both conditions must be true
        //          || = (OR) either condition must be true
        //          !  = (NOT) reverses boolean value of a condition

        int temp=45;
        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20&&temp<=30){
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cool outside");
        }

        //Scanner scanner=new Scanner(System.in);

        //System.out.println("You are playing a game! Press q or Q to quit");
        //String response=scanner.next();

        //if(response.equals("q")||response.equals("Q")){
        //    System.out.println("You quit the game");
        //}
        //else {
        //    System.out.println("You are still playing the game *Pew Pew*");
        //}


        Scanner scanner=new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response=scanner.next();

        if(!response.equals("q")&&!response.equals("Q")){
            System.out.println("You are still playing the game *Pew Pew*");
        }
        else {

            System.out.println("You quit the game");
        }
    }
}
