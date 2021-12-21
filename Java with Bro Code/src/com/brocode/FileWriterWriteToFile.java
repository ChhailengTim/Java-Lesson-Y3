package com.brocode;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterWriteToFile {
    public static void main(String[] args){
        try {
            FileWriter writer=new FileWriter("poem.txt");
            writer.write("Rose are red \nViolets are blue \nBooty booty booty \nRock in everywhere!");
            writer.append("\n(A poem by LENG)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
