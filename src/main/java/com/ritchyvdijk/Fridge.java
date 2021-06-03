package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.UUID;

public class Fridge {
    private String fridgeId;
    private String fridgeName;
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();


    public Fridge(String fridgeName) {
        this.fridgeId = UUID.randomUUID().toString();
        this.fridgeName = fridgeName;
    }

    public boolean memberOfFridge() {
        for(User user: users) {
            if(user.equals(IDandPasswords.getCurrentUser())) {
                return true;
            }
        }
        return false;
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

    public static ArrayList<Product> getProducts() {
        return products;
    }

    public static void setProducts(ArrayList<Product> products) {
        Fridge.products = products;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Fridge.users = users;
    }
}
