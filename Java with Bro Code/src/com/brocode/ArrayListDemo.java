package com.brocode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    class arraylist {
        ArrayList<String> l=new ArrayList<>();
        void inputData(){
            while (true)
            {
                System.out.println("Enter newdata");
                String newdata=new Scanner(System.in).nextLine();
                if(checkExist(newdata))
                    System.out.println("newdata Exit!!!");
                else
                    l.add(getIndex(newdata),newdata);
                System.out.println("Press any key to input more! Q to stop input");
                if(new Scanner(System.in).nextLine().equalsIgnoreCase("Q"))
                    break;
            }
        }

        private int getIndex(String newdata) {
            if(l.size()==0)
            return 0;
            else {
                int i=0;
                while (newdata.compareToIgnoreCase(l.get(i))>0){
                    i++;
                    if(i==l.size())
                        break;
                }
                return i;
            }
        }

        boolean checkExist(String data) {
            for (int i=0;i<l.size();i++)
                if(data.equalsIgnoreCase(l.get(i)))
                return true;
            return false;
        }

        arraylist(){
            inputData();
            for (int i=0;i<l.size();i++)
                System.out.println(l.get(i));
        }

        {

        }
    }
    public static void main(String[] args){

    }
}
