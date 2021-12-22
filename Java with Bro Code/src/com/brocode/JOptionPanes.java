package com.brocode;

import javax.swing.*;

public class JOptionPanes {
    public static void main(String[] args){

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs them of something.

        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is more useless info :D","title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Did you know Beer?","title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Your computer has a VIRUS!!!","title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Call tech support NOW or ELSE!","title",JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"Bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(JOptionPane.showConfirmDialog(null,"Bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION));
        //int answer = JOptionPane.showConfirmDialog(null,"Bro, do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        //String name=JOptionPane.showInputDialog("What is your name?");

        JOptionPane.showOptionDialog(null,"You are awesome!","secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,0);

    }
}
