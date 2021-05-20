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

    public String addProduct(Product product) {
        if(products.contains(product)) {
            return "Product zit al in de koelkast";
        }
        return "";
    }
}
