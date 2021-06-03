package com.ritchyvdijk;

import java.util.HashMap;

public class IDandPasswords {
    private static IDandPasswords singleton;
    protected HashMap<User,String> loginInfo = new HashMap<>();
    protected static User currentUser;

    private IDandPasswords() {
        loginInfo.put(new User("Ritchy", "van Dijk", "Test", "+3101234567"), "#1Geheim");
        loginInfo.put(new User("Jordy", "van Dijk", "201442690@student.hhs.nl", "+3111234567"), "Test");
    }

    public static IDandPasswords getInstance() {
        if(singleton == null) {
            singleton = new IDandPasswords();
        }

        return singleton;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    protected HashMap<User, String> getLoginInfo() {
        return loginInfo;
    }

//    protected IDandPasswords createNewLogin() {
//
//    }
}
