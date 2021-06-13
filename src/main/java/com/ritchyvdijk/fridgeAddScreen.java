package com.ritchyvdijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fridgeAddScreen {

    MyFrame fridgeAddFrame = new MyFrame();
    JButton backBtn = new JButton("Back");
    JButton addBtn = new JButton("Add");
    JLabel nameLabel = new JLabel("Fridge name");
    JTextField nameField = new JTextField(8);
    JPanel formPanel = new JPanel(new GridBagLayout());

    public fridgeAddScreen(User user) {
        fridgeAddFrame.setTitle("Add fridge");
        fridgeAddFrame.setSize(300, 200);

        GridBagConstraints c = new GridBagConstraints();
        c.gridy = 0;
        c.gridx = 0;

        nameLabel.setFont(new Font(null, Font.PLAIN, 20));
        nameField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(nameLabel, c);
        c.gridx++;
        formPanel.add(nameField, c);

        fridgeAddFrame.add(formPanel, BorderLayout.CENTER);
        fridgeAddFrame.add(backBtn, BorderLayout.NORTH);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fridgeAddFrame.dispose();
                new fridgeScreen(user);

            }
        });

        fridgeAddFrame.add(addBtn, BorderLayout.SOUTH);
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (user.addFridges(new Fridge(nameField.getText()))) {
                    fridgeAddFrame.dispose();
                    new fridgeScreen(user);
                }

            }
        });

    }
}
