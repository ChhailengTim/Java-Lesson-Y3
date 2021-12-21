package com.brocode;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import  java.util.Scanner;
import javax.sound.sampled.*;
public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner=new Scanner(System.in);

        File file=new File("playback.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        //clip.start();

        //String response=scanner.next();
        //response=response.toUpperCase(Locale.ROOT);

        String response="";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Rest, Q= Quit");
            System.out.println("Enter your choice: ");

            response=scanner.next();
            response=response.toUpperCase(Locale.ROOT);

            switch (response){
                case("P"): clip.start();
                break;
                case ("s"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default:
                    System.out.println("Not a valid response");
            }

        }

        //clip.start();
    }
}
