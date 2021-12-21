package com.brocode;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        //JFrame frame=new JFrame(); //creates a frame
        
        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image=new ImageIcon("apple-logo.jpg"); //create an imageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123,50,250)); //change color of background

    }
}
