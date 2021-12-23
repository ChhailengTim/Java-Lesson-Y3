package com.brocode;

import javax.swing.*;
import java.awt.*;

public class MyFrameTest extends JFrame {

    MyPanelDemo panel;
    MyFrameTest(){

        panel=new MyPanelDemo();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
