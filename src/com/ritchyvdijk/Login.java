package com.ritchyvdijk;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    private static Login singleton;
    private ArrayList<User> users = new ArrayList<>();
    private User loggedInUser;

    private Login() {
        users.add(new User("Ritchy", "van Dijk", "20148690@student.hhs.nl", "+3101234567", "#1Geheim"));
        loggedInUser = null;
    }

    public static Login getInstance() {
        if(singleton == null) {
            singleton = new Login();
        }
        return singleton;
    }

    private User getUser(String eMail) {
        for(User user: users) {
            if(user.geteMail().equals(eMail)) {
                return user;
            }
        }
        return null;
    }

    private boolean userIsAuthenticated() {
        return loggedInUser != null;
    }

    private boolean isAuthenticated() {
        if(userIsAuthenticated()) {
            return true;
        } else {
            Scanner scanner = new Scanner(System.in);

            for(int i = 0; i<3; i++) {
                System.out.println ("=================");
                System.out.print("Met welke gebruikersnaam wilt u inloggen? ");
                String userName = scanner.nextLine();
                System.out.print ("Graag het bijbehorende password: ");
                String password = scanner.nextLine();
                System.out.println ("=================");

                User user = getUser(userName);

                if(user != null && user.isCorrectPassword(password)) {
                    this.loggedInUser = user;
                    return true;
                }

                System.out.println ("De combinatie van gebruikersnaam en password is niet OK.");
            }
            System.out.println ("=================");
            System.out.println ();
            return false;
        }
    }

    public String getUserEmail() {
        if(loggedInUser == null) {
            return "";
        }
        return loggedInUser.geteMail();
    }
}
