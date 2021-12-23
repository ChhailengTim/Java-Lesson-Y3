package com.brocode;

import java.util.ArrayList;

public class GameDemo {
    public static void main(String[] args){
        /*

        Player player=new Player();
        Enemy enemy=new Enemy();
        Item item=new Item();
        Tree tree=new Tree();

        draw(player);
        draw(enemy);
        draw(item);
        draw(tree);

    }
    public static <Thing> void draw(Thing x){
        x.draw();

         */

        MyGenericsClass<Integer> myInt=new MyGenericsClass<>(1);
        MyGenericsClass<Double> myDouble=new MyGenericsClass<>(3.14);
        MyGenericsClass<Character> myChar=new MyGenericsClass<>('@');
        MyGenericsClass<String> myString=new MyGenericsClass<>("Hello");

        //ArrayList<String> myFriends=new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
