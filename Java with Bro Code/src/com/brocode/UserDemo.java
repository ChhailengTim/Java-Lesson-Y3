package com.brocode;

import java.io.Serializable;

public class UserDemo implements Serializable {

    String name;
    String password;
    public void sayHello(){
        System.out.println("Hello "+name);
    }
}
