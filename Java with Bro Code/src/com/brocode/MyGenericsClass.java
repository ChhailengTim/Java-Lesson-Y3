package com.brocode;

public class MyGenericsClass <Thing>{

    Thing x;

    MyGenericsClass(Thing x){
        this.x=x;
    }
    public Thing getValue(){
        return x;
    }
}
