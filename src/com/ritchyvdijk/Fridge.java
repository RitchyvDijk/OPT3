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

//    public boolean memberOfFridge() {
//        for(User user: users) {
//            if(user.geteMail().equals(Login.getInstance().getUserEmail())) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean addProduct(Product product) {
//        if(Login.getInstance().isAuthenticated()) {
        return products.add(product);

//        }
    }
}
