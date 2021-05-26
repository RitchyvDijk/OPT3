package com.ritchyvdijk;

import javax.swing.*;
import java.awt.*;

public class welcomeScreen {

    JFrame frame = new JFrame("Hello World!");
    JLabel welcomeLabel = new JLabel();
    JToolBar toolBar = new JToolBar();


    welcomeScreen(User user) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        welcomeLabel.setBounds(0,0,frame.getSize().width,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN,12));
        welcomeLabel.setText("Welcome " + user.getfName() + " " + user.getlName() + "!");

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);
        JButton button = new JButton("File");
        toolbar.add(button);
        toolbar.addSeparator();
        toolbar.add(new JButton("Edit"));
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));
        frame.add(toolbar);

    }

}
