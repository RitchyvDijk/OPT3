package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class User {
    private String userId;
    private String fName;
    private String lName;
    private String eMail;
    private String phonenumber;
    private ArrayList<Fridge> fridges = new ArrayList<>();

    public User(String fName, String lName, String eMail) {
        this.userId = UUID.randomUUID().toString();
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        fridges.add(new Fridge(fName + "'s Fridge"));

    }

    public User(String fName, String lName, String eMail, String phonenumber) {
        this.userId = UUID.randomUUID().toString();
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.phonenumber = phonenumber;
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

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public ArrayList<Fridge> getFridges() {
        return fridges;
    }

    public boolean addFridges(Fridge fridge) {
        return this.fridges.add(fridge);
    }
}
