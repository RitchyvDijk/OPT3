package com.ritchyvdijk;

public class Main {

    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();

        LoginScreen loginScreen = new LoginScreen(idandPasswords.getLoginInfo());
    }
}
