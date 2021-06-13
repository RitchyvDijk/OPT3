package com.ritchyvdijk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class fridgeContentScreen {

    MyFrame contentFrame = new MyFrame();
    User currentUser = IDandPasswords.getCurrentUser();
    Fridge currentFridge;
    JButton backBtn = new JButton("Back");
    JButton addBtn = new JButton("Add product");

    public fridgeContentScreen(String fridgeId) throws ParseException {

        for (Fridge fridge : currentUser.getFridges()) {
            if (fridgeId.equals(fridge.getFridgeId())) {
                currentFridge = fridge;
            }
        }
        contentFrame.setTitle("Fridge content");
        contentFrame.setSize(500, 500);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentFrame.dispose();
                new fridgeScreen(currentUser);
            }
        });

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentFrame.dispose();
                new productAddScreen(currentFridge);
            }
        });
        contentFrame.getContentPane().add(backBtn, BorderLayout.NORTH);
        contentFrame.getContentPane().add(addBtn, BorderLayout.SOUTH);

        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Barcode", "Brand", "Name", "Use by"}, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        contentFrame.getContentPane().add(scrollPane);

        for (Product product : currentFridge.getProducts()) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            tableModel.addRow(new Object[]{product.getProductBarcode(), product.getProductBrand(), product.getProductName(), dateFormat.format(product.getUseBy())});
        }
    }
}
