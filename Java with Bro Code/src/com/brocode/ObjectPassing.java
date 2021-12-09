package com.brocode;

public class ObjectPassing {
    public static void main(String[] args){

        Garage garage=new Garage();

        Motor motor1=new Motor("BMW");
        Motor motor2=new Motor("Tesla");

        garage.park(motor1);
        garage.park(motor2);

    }
}
