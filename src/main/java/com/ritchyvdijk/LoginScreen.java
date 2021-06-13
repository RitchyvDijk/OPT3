package com.ritchyvdijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

public class LoginScreen implements ActionListener {

    private HashMap<User, char[]> loginInfo;
    MyFrame loginFrame = new MyFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Create user");
    JTextField eMailField = new JTextField();
    JLabel eMailLabel = new JLabel("E-mail");
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordLabel = new JLabel("Password");
    JLabel msgLabel = new JLabel();


    public LoginScreen(HashMap<User, char[]> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        loginFrame.setTitle("Welcome");
        loginFrame.setSize(420, 420);
        loginFrame.setLayout(null);

        eMailLabel.setBounds(50, 100, 50, 25);
        eMailField.setBounds(125, 100, 200, 25);
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

        loginFrame.add(eMailLabel);
        loginFrame.add(eMailField);
        loginFrame.add(passwordLabel);
        loginFrame.add(passwordField);
        loginFrame.add(msgLabel);
        loginFrame.add(loginButton);
        loginFrame.add(resetButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            loginFrame.dispose();
            new userAddScreen();
        }

        if(e.getSource() == loginButton) {
            String eMail = eMailField.getText();
            String password = String.valueOf(passwordField.getPassword());

            for (User user: loginInfo.keySet()) {
                if (user.geteMail().equals(eMail)) {
                    if (loginInfo.containsKey(user)) {
                        if (Arrays.equals(loginInfo.get(user), password.toCharArray())) {
                            msgLabel.setForeground(Color.GREEN);
                            msgLabel.setText("Login successful!");
                            loginFrame.dispose();
                            IDandPasswords.setCurrentUser(user);
                            new fridgeScreen(user);
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
