package com.ritchyvdijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginScreen implements ActionListener {

    private HashMap<User,String> loginInfo;

    JFrame frame  = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField eMailField = new JTextField();
    JLabel eMailLabel = new JLabel("User ID");
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password");
    JLabel msgLabel = new JLabel();


    LoginScreen(HashMap<User,String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);

        eMailLabel.setBounds(50,100,75,25);
        eMailField.setBounds(125,100,200,25);
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        passwordLabel.setBounds(50,150,75,25);
        passwordField.setBounds(125,150,200,25);
        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        msgLabel.setBounds(125,250,250,35);
        msgLabel.setFont(new Font(null, Font.ITALIC, 16));

        frame.add(eMailLabel);
        frame.add(eMailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(msgLabel);
        frame.add(loginButton);
        frame.add(resetButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            eMailField.setText("");
            passwordField.setText("");
            msgLabel.setText("");
        }

        if(e.getSource() == loginButton) {
            String eMail = eMailField.getText();
            String password = String.valueOf(passwordField.getPassword());

            for (User user: loginInfo.keySet()) {
                if (user.geteMail().equals(eMail)) {
                    if (loginInfo.containsKey(user)) {
                        if (loginInfo.get(user).equals(password)) {
                            msgLabel.setForeground(Color.GREEN);
                            msgLabel.setText("Login successful!");
                            frame.dispose();
                            welcomeScreen welcomeScreen = new welcomeScreen(user);
                        } else {
                            msgLabel.setForeground(Color.RED);
                            msgLabel.setText("Login unsuccessful!");
                        }
                    }
                } else {
                    msgLabel.setForeground(Color.RED);
                    msgLabel.setText("Login unsuccessful!");
                }
            }
        }
    }
}
