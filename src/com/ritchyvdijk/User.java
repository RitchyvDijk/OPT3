package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class User {
    public static ArrayList<User> users = new ArrayList<>();
    private String userId;
    private String fName;
    private String lName;
    private String eMail;
    private String phonenumber;
    private String password;
    private static ArrayList<Fridge> fridges = new ArrayList<>();

    public User(String fName, String lName, String eMail, String phonenumber, String password) {
        this.userId = UUID.randomUUID().toString();
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.phonenumber = phonenumber;
        this.password = password;
        fridges.add(new Fridge(fName + "'s Fridge"));
    }

    public boolean validatePhonenumber() {
        return this.phonenumber.startsWith("+31") &&
                this.phonenumber.length() == 11;
    }

    public boolean validateEMail() {
        String[] domains = new String[]{".nl", ".com", ".co.uk"};

        return this.eMail.contains("@") &&
                Arrays.stream(domains).anyMatch(entry -> this.phonenumber.endsWith(entry));
    }

    public String geteMail() {
        return eMail;
    }

    public boolean isCorrectPassword(String password) {
        return password.equals(this.password);
    }
}
