package com.brocode;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args){
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image=new ImageIcon("codelogo.png");
        Border border=BorderFactory.createLineBorder(Color.green,3);

        JLabel label=new JLabel(); //create a label
        label.setText("Leng, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00)); //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); //Display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        label.setBounds(130,130,250,250); //set x,y position within frame as well as dimensions

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,1280);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
