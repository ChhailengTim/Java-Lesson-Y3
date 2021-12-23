package com.brocode;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector v=new Vector();
        v.add("Hello");
        v.add("Apple");
        v.remove(0);
        v.add("iPhone");
        v.add(1,"Kingdom");
        for(int i=0;i<v.size();i++){
            String s= (String) v.get(i);
            System.out.println(s);
        }
    }
}
