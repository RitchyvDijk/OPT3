package com.ritchyvdijk;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<User,String> loginInfo = new HashMap<>();

    public IDandPasswords() {
        loginInfo.put(new User("Ritchy", "van Dijk", "Test", "+3101234567"), "#1Geheim");
        loginInfo.put(new User("Jordy", "van Dijk", "201442690@student.hhs.nl", "+3111234567"), "Test");
    }

    protected HashMap<User, String> getLoginInfo() {
        return loginInfo;
    }
}
