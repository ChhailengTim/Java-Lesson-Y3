package com.codewithmosh;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args){
        NumberFormat percent=NumberFormat.getCompactNumberInstance();
        String result=percent.format(0.1);
        System.out.println(result);
    }
}
