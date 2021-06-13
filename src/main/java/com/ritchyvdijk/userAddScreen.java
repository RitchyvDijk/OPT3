package com.ritchyvdijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userAddScreen {
    MyFrame userAddFrame = new MyFrame();
    JPanel formPanel = new JPanel(null);
    JButton backBtn = new JButton("Back");
    JButton createBtn = new JButton("Add user");
    JTextField fNameField = new JTextField(8);
    JLabel fNameLabel = new JLabel("First name:*");
    String fName;
    JTextField lNameField = new JTextField(8);
    JLabel lNameLabel = new JLabel("Last name:*");
    String lName;
    JTextField eMailField = new JTextField(8);
    JLabel eMailLabel = new JLabel("E-mail:*");
    String eMail;
    JTextField phoneField = new JTextField(8);
    JLabel phoneLabel = new JLabel("Phonenumber:");
    String phonenumber;
    JPasswordField passwordField = new JPasswordField(8);
    JLabel passwordLabel = new JLabel("Password:*");
    char[] password;
    IDandPasswords idandPasswords =  IDandPasswords.getInstance();

    public userAddScreen() {
        userAddFrame.setTitle("New user");
        userAddFrame.setSize(400,400);

        userAddFrame.add(backBtn, BorderLayout.NORTH);

        fNameLabel.setBounds(50, 50, 100, 25);
        fNameField.setBounds(150, 50, 200, 25);

        lNameLabel.setBounds(50,100,100,25);
        lNameField.setBounds(150,100,200,25);

        eMailLabel.setBounds(50,150,100,25);
        eMailField.setBounds(150,150,200,25);

        passwordLabel.setBounds(50,200,100,25);
        passwordField.setBounds(150,200,200,25);

        phoneLabel.setBounds(50,250,100,25);
        phoneField.setBounds(150,250,200,25);

        formPanel.add(fNameLabel);
        formPanel.add(fNameField);
        formPanel.add(lNameLabel);
        formPanel.add(lNameField);
        formPanel.add(eMailLabel);
        formPanel.add(eMailField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        userAddFrame.add(formPanel,BorderLayout.CENTER);
        userAddFrame.add(createBtn, BorderLayout.SOUTH);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                userAddFrame.dispose();
                new LoginScreen(idandPasswords.getLoginInfo());
            }
        });

        createBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fName = fNameField.getText();
                lName = lNameField.getText();
                eMail = eMailField.getText();
                password = passwordField.getPassword();
                phonenumber = phoneField.getText();

                idandPasswords.loginInfo.put(new User(fName,lName,eMail,phonenumber), password);
                userAddFrame.dispose();
                new LoginScreen(idandPasswords.getLoginInfo());
            }
        });
    }
}
