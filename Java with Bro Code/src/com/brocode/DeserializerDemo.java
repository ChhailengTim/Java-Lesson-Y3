package com.brocode;
import java.io.*;
public class DeserializerDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //                  Steps to Deserializer
        //                  -----------------------------------------------------------------
        //                  1. Declare your object (don't instantiate)
        //                  2. Your class should implement Serializable interface
        //                  3. add import java.io.Serializable;
        //                  4. FileInputStream fileIn = new FileInputStream(file path);
        //                  5.ObjectInputStream in = new ObjectInputStream(fileIn);
        //                  6. objectName = (Class) in.readObject();
        //                  7. in.close(); fileIn.close();
        //                  -----------------------------------------------------------------
        //

        UserDemo userDemo=null;

        FileInputStream fileIn=new FileInputStream("D:\\CHHAILENG\\Java-Lesson-Y3\\Java with Bro Code\\UserInfo.ser");
        ObjectInputStream in=new ObjectInputStream(fileIn);
        userDemo=(UserDemo) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(userDemo.name);
        System.out.println(userDemo.password);
        userDemo.sayHello();

    }
}
