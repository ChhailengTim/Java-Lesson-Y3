package com.brocode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKey extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyKey(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon=new ImageIcon("rocket.png");

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyType = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10,label.getY());
            break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10,label.getY());
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        /* switch (e.getKeyCode()) {
            case 65:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 87:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 83:
                label.setLocation(label.getX()+ 10, label.getY() );
                break;
            case 68:
                label.setLocation(label.getX() , label.getY()+ 10);
                break;

         */

        }
    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released

        System.out.println("You released key char: "+e.getKeyChar());
        System.out.println("You released key char: "+e.getKeyCode());
    }
}
