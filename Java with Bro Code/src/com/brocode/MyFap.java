package com.brocode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFap extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFap(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //int[] animals={1,2,3};

        String[] animals={"Dog","Cat","Bird"};
        comboBox=new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Horse");
        //comboBox.insertItemAt("Pig",0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("Cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex());
        }
    }
}
