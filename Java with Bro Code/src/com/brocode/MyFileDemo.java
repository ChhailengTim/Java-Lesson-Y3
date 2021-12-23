package com.brocode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFileDemo extends JFrame implements ActionListener {

    JButton button;

    MyFileDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){

            JFileChooser fileChooser=new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:\\Users\\DELL\\Desktop"));

            //System.out.println(fileChooser.showOpenDialog(null)); //select file to open
            //int response = fileChooser.showOpenDialog(null);
            int response = fileChooser.showSaveDialog(null); // select file to save
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
