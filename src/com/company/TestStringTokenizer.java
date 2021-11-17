package com.company;
import java.util.*;

public class TestStringTokenizer {
    public static void main(String arg[])
    {
        String s=("Kingdom of Cambodia Kingdom of Wonder!!!");
        StringTokenizer t=new StringTokenizer(s);
        System.out.println("Number of Words:"+t.countTokens());
        while(t.hasMoreTokens())
            System.out.println(t.nextToken());
    }
}
