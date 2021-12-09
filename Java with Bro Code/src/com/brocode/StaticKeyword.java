package com.brocode;

public class StaticKeyword {
    public static void main(String[] args){
        // static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        Friend friend1=new Friend("Phearoth");
        Friend friend2=new Friend("Mato");
        Friend friend3=new Friend("Heng");

        Friend.displayFriends();

        //System.out.println(Friend.numberOfFriend);
    }
}
