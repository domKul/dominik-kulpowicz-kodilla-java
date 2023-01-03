package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class DataBaseUserInfo implements  UserInformation{
    Map<Integer, User> userList = new HashMap<>();

    @Override
    public User getUserInfo() {
        userList.put(1, new User(123, "Adam13"));
        userList.put(2, new User(234, "marcim112"));
        userList.put(3, new User(345, "szym111"));
        for (Map.Entry<Integer, User> entry : userList.entrySet()) {
            System.out.println(entry.getValue());
        }
        return null;
    }
}
