package com.ritchyvdijk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class productAddScreen {
    Fridge currentFridge;
    MyFrame productAddFrame = new MyFrame();
    JButton backBtn = new JButton("Back");
    JButton addBtn = new JButton("Add");
    JPanel formPanel = new JPanel();
    JTextField typeField = new JTextField(8);
    JLabel typeLabel = new JLabel("Type:");
    JTextField barcodeField = new JTextField(8);
    JLabel barcodeLabel = new JLabel("Barcode:");
    JTextField brandField = new JTextField(8);
    JLabel brandLabel = new JLabel("Brand:");
    JTextField nameField = new JTextField(8);
    JLabel nameLabel = new JLabel("Name:");
    JTextField dateField = new JTextField(8);
    JLabel dateLabel = new JLabel("Date:");
    JTextField flavorField = new JTextField(8);
    JLabel flavorLabel = new JLabel("Flavor:");
    JTextField volumeField = new JTextField(8);
    JLabel volumeLabel = new JLabel("Volume in L:");
    JTextField typeMeatField = new JTextField(8);
    JLabel typeMeatLabel = new JLabel("Type Meat:");
    JTextField weightField = new JTextField(8);
    JLabel weightLabel = new JLabel("Weight:");
    JTextField animalField = new JTextField(8);
    JLabel animalLabel = new JLabel("Animal:");

    private String type;
    private Long productBarcode;
    private String productBrand;
    private String productName;
    private String productUseBy;
    private String flavor;
    private int volumeInL;
    private String typeMeat;
    private double weight;
    private String animal;


    public productAddScreen(Fridge fridge) {
        currentFridge = fridge;

        productAddFrame.setTitle("Add product - " + currentFridge.getFridgeName());
        productAddFrame.setSize(500, 500);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                productAddFrame.dispose();
                try {
                    new fridgeContentScreen(currentFridge.getFridgeId());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        productAddFrame.add(backBtn, BorderLayout.NORTH);

        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        typeLabel.setFont(new Font(null, Font.PLAIN, 20));
        typeField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(typeLabel, c);
        c.gridx++;
        formPanel.add(typeField, c);
        c.gridy++;

        c.gridx = 0;
        barcodeLabel.setFont(new Font(null, Font.PLAIN, 20));
        barcodeField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(barcodeLabel, c);
        c.gridx++;
        formPanel.add(barcodeField, c);
        c.gridy++;

        c.gridx = 0;
        nameLabel.setFont(new Font(null, Font.PLAIN, 20));
        nameField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(nameLabel, c);
        c.gridx++;
        formPanel.add(nameField, c);
        c.gridy++;

        c.gridx = 0;
        brandLabel.setFont(new Font(null, Font.PLAIN, 20));
        brandField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(brandLabel, c);
        c.gridx++;
        formPanel.add(brandField, c);
        c.gridy++;

        c.gridx = 0;
        dateLabel.setFont(new Font(null, Font.PLAIN, 20));
        dateField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(dateLabel, c);
        c.gridx++;
        formPanel.add(dateField, c);
        c.gridy++;

        c.gridx = 0;
        flavorLabel.setFont(new Font(null, Font.PLAIN, 20));
        flavorField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(flavorLabel, c);
        c.gridx++;
        formPanel.add(flavorField, c);
        c.gridy++;

        c.gridx = 0;
        volumeLabel.setFont(new Font(null, Font.PLAIN, 20));
        volumeField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(volumeLabel, c);
        c.gridx++;
        formPanel.add(volumeField, c);
        c.gridy++;

        c.gridx = 0;
        typeMeatLabel.setFont(new Font(null, Font.PLAIN, 20));
        typeMeatField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(typeMeatLabel, c);
        c.gridx++;
        formPanel.add(typeMeatField, c);
        c.gridy++;

        c.gridx = 0;
        weightLabel.setFont(new Font(null, Font.PLAIN, 20));
        weightField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(weightLabel, c);
        c.gridx++;
        formPanel.add(weightField, c);
        c.gridy++;

        c.gridx = 0;
        animalLabel.setFont(new Font(null, Font.PLAIN, 20));
        animalField.setFont(new Font(null, Font.PLAIN, 20));
        formPanel.add(animalLabel, c);
        c.gridx++;
        formPanel.add(animalField, c);
        c.gridy++;

        productAddFrame.add(formPanel, BorderLayout.CENTER);

        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                type = typeField.getText();

                switch (type) {
                    case "drinks":
                        try {
                            productBarcode = Long.valueOf(barcodeField.getText());
                            productBrand = brandField.getText();
                            productName = nameField.getText();
                            productUseBy = dateField.getText();
                            flavor = nameField.getText();
                            volumeInL = Integer.parseInt(volumeField.getText());

                            if (currentFridge.addProduct(new Drinks(productBarcode, productBrand, productName, productUseBy, flavor, (double) volumeInL))) {
                                addBtn.setForeground(Color.GREEN);
                                addBtn.setText("Product added");

                            } else {
                                addBtn.setForeground(Color.RED);
                                addBtn.setText("Something went wrong");
                            }
                            TimeUnit.SECONDS.sleep(2);
                            addBtn.setForeground(Color.BLACK);
                            addBtn.setText("Add");
                        } catch (ParseException | InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "meat":
                        try {
                            productBarcode = Long.valueOf(barcodeField.getText());
                            productBrand = brandField.getText();
                            productName = nameField.getText();
                            productUseBy = dateField.getText();
                            typeMeat = typeMeatField.getText();
                            weight = Double.parseDouble(weightField.getText());
                            animal = animalField.getText();

                            if (currentFridge.addProduct(new Meat(productBarcode, productBrand, productName, productUseBy, typeMeat, weight, animal))) {
                                addBtn.setForeground(Color.GREEN);
                                addBtn.setText("Product added");
                            } else {
                                addBtn.setForeground(Color.RED);
                                addBtn.setText("Something went wrong");
                            }
                            TimeUnit.SECONDS.sleep(2);
                            addBtn.setForeground(Color.BLACK);
                            addBtn.setText("Add");
                        } catch (ParseException | InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
        });
        productAddFrame.add(addBtn, BorderLayout.SOUTH);
    }
}
