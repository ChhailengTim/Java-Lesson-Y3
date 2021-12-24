package com.brocode;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {

        //serialVersionUID = serialVersionUID is a unique ID that functions like a version #
        //                   verifies that the sender and receiver of a serialized object,
        //                   have loaded classes for that object that match
        //                   Ensures object will be compatible between machines
        //                   Number must match. otherwise, this will cause a InvalidClassException
        //                   A SerialVersionUID will be calculated based on class properties, member
        //                   A serializable class can declare its own serialVersionUID explicitly

        //Deserialization = The reverse process of converting a byte stream into an object.
        //                  (Think of this as if you're loading a saved file)

        User user=new User();
        user.name="Bro";
        user.password="I<3Pizza";
        //ser.sayHello();
        FileOutputStream fileOut= null;
        try {
            fileOut = new FileOutputStream("UserInfo.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");
    }
}
