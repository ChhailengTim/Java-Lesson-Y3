package com.codewithmosh;

public class LogicalOperators {
    public static void main(String[] args){
        boolean hasHighIncome=true;
        boolean hasGoodCredit=true;
        boolean hasCriminalRecord=false;
        boolean isEligible=(hasHighIncome||hasGoodCredit)&&hasCriminalRecord;
    }
}
