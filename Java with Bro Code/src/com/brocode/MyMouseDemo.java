package com.brocode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseDemo extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;


    MyMouseDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(new FlowLayout());
        //this.setLayout(null);

        label=new JLabel();
        label.addMouseListener(this);

        smile=new ImageIcon("1.png");
        nervous=new ImageIcon("2.png");
        pain=new ImageIcon("3.png");
        dizzy=new ImageIcon("4.png");

        label.setIcon(smile);
        label.setIcon(nervous);
        label.setIcon(pain);
        label.setIcon(dizzy);

        this.add(label);
        label=new JLabel();
        label.setBounds(0,0,100,100);
        //label.setBackground(Color.red);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(pain);
        //system.out.println("You clicked the mouse");
        //System.out.println("You press the mouse");
        //label.setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        label.setIcon(smile);
        //System.out.println("You released the mouse");
        //label.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(nervous);
        //System.out.println("You entered the component");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        System.out.println("You exited the component");
    }
}
