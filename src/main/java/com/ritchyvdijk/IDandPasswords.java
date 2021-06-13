package com.ritchyvdijk;

import java.util.HashMap;

public class IDandPasswords {
    private static IDandPasswords singleton;
    protected HashMap<User, char[]> loginInfo = new HashMap<User, char[]>();
    protected static User currentUser;

    public static IDandPasswords getInstance() {
        if(singleton == null) {
            singleton = new IDandPasswords();
        }

        return singleton;
    }

    public static void setCurrentUser(User currentUser) {
        IDandPasswords.currentUser = currentUser;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    protected HashMap<User, char[]> getLoginInfo() {
        return loginInfo;
    }

}
