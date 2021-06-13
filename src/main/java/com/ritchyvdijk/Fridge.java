package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.UUID;

public class Fridge {
    private String fridgeId;
    private String fridgeName;
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();


    public Fridge(String fridgeName) {
        this.fridgeId = UUID.randomUUID().toString();
        this.fridgeName = fridgeName;

    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public String getFridgeId() {
        return fridgeId;
    }

    public void setFridgeId(String fridgeId) {
        this.fridgeId = fridgeId;
    }

    public String getFridgeName() {
        return fridgeName;
    }

    public void setFridgeName(String fridgeName) {
        this.fridgeName = fridgeName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

//    public void addProduct(Product product) {
//        this.products.add(product);
//    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUsers(User user) {
        this.users.add(user);
    }
}
