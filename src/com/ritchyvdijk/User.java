package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.UUID;

public class User {
    public static ArrayList<User> users = new ArrayList<>();
    private String userId;
    private String fName;
    private String lName;
    private String eMail;
    private static ArrayList<Fridge> fridges = new ArrayList<>();

    public User(String fName, String lName, String eMail) {
        this.userId = UUID.randomUUID().toString();
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        fridges.add(new Fridge(fName + "'s Fridge"));
    }
}
