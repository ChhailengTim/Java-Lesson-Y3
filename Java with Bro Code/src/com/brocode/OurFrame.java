package com.brocode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    OurFrame(){
        ImageIcon icon=new ImageIcon("btnsmile.png");
        ImageIcon icon2=new ImageIcon("btnsmile.png");
        label=new JLabel();
        label.setIcon(icon2);
        button.setBounds(150,250,150,150);
        button.addActionListener(e -> System.out.println("Poo"));

        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createLineBorder(Color.green));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Poo");
        }
    }
}
