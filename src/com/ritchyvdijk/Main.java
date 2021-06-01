package com.ritchyvdijk;

public class Main {

    public static void main(String[] args) {
        IDandPasswords idandPasswords =  IDandPasswords.getInstance();

        LoginScreen loginScreen = new LoginScreen(idandPasswords.getLoginInfo());
    }
}
