package com.brocode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFarm extends JFrame implements ActionListener{

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    MyFarm(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon=new ImageIcon("pizza.png");
        hamburgerButton= new JRadioButton("hamburger.png");
        hotdogIcon= new ImageIcon("hotdog.png");

        pizzaButton=new JRadioButton("Pizza");
        hamburgerButton=new JRadioButton("Hamburger");
        hotdogButton=new JRadioButton("Hotdog");

        ButtonGroup group=new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered Pizza");
        }
        else if(e.getSource()==hamburgerButton){
            System.out.println("You odered a hamburger");
        }
        else if(e.getSource()==hotdogButton){
            System.out.println("You ordered a HotDog");
        }
    }
}
