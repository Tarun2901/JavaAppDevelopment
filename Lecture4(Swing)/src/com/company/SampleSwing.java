package com.company;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.*;
import java.awt.*;

public class SampleSwing {

    public static void main(String[] args) {
	// write your code here
        JFrame f = new JFrame(); //create an instance of JFrame
        JButton b = new JButton("click here"); //create an instance of JButton
        b.setBackground(Color.cyan);
        b.setBounds(130,100,100,40);
        f.add(b); //add button b to JFrame
        f.setSize(400,500); //Frame width = 400, Frame height = 500
        f.setLayout(null); //using no layout managers
        f.setVisible(true); //making the frame visible
    }
}
