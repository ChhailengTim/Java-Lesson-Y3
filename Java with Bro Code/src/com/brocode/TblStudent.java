package com.brocode;

import java.util.Hashtable;

public class TblStudent {
    class TblStudent{
        Hashtable<String,Student>tStu=new Hashtable<String, Student>();
        Hashtable<String,String>tSchool=new Hashtable<String,String>();
        TblStudent(){
            doInput();
            showAll();
        }
        void doInput(){
            white(true){
                System.out.println("Input Student Information: ");
                Student objStu=new Student();
                System.out.println("Name:");
            }

        }
        void showAll(){

        }
        public static void main(String[] args){
            new TblStudent();
        }
    }
}
