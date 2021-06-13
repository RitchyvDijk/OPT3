package com.ritchyvdijk;

public class Main {

    public static void main(String[] args) {
        IDandPasswords idandPasswords =  IDandPasswords.getInstance();

        new LoginScreen(idandPasswords.getLoginInfo());
    }
}
