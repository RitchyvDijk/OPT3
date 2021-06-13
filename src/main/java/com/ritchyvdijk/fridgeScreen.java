package com.ritchyvdijk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fridgeScreen {
    MyFrame fridgeFrame = new MyFrame();
    JTable table;
    JLabel titleLabel = new JLabel("Your fridges");
    JLabel errorMsg = new JLabel("No fridges found");
    JButton addBtn = new JButton("Add fridge");
    JPanel fridgeContainer = new JPanel();

    public fridgeScreen(User user) {
        fridgeFrame.setSize(420, 420);
        fridgeFrame.setTitle("Welcome " + user.getfName() + " " + user.getlName());

        titleLabel.setBounds(0, 0, 200, 25);
        titleLabel.setFont(new Font(null, Font.BOLD, 25));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Fridge name", "# products", "# members", "Actions"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        fridgeFrame.getContentPane().add(scrollPane);
        fridgeFrame.getContentPane().add(titleLabel, BorderLayout.NORTH);

        if (!user.getFridges().isEmpty()) {

            for (Fridge fridge : user.getFridges()) {
                tableModel.addRow(new Object[]{fridge.getFridgeName(), fridge.getProducts().size(), fridge.getUsers().size(), fridge.getFridgeId()});
                table.getColumn("Actions").setCellRenderer(new ButtonRenderer());
                table.getColumn("Actions").setCellEditor(new ButtonEditor(new JCheckBox(), fridgeFrame));
            }

        } else {
            fridgeContainer.add(errorMsg);
            fridgeFrame.add(fridgeContainer, BorderLayout.CENTER);
        }

        fridgeFrame.add(addBtn, BorderLayout.SOUTH);
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fridgeFrame.dispose();
                new fridgeAddScreen(user);
            }
        });
    }
}
