package com.brocode;

import javax.swing.*;

public class MyFrameNew extends JFrame {

    MyPanelNew panelNew;
    MyFrameNew(){
        panelNew=new MyPanelNew();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panelNew);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
}
