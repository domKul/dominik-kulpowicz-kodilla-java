package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class DataBaseUserInfo implements  UserInformation{
   Map<Integer, User> userList = new HashMap<>();

    @Override
    public User getUserInfo(Integer userID) {
        userList.put(1, new User(123, "Adam"));
        userList.put(2, new User(234, "Marcin"));
        userList.put(3, new User(345, "Szymon"));
        for (Map.Entry<Integer, User> entry : userList.entrySet()) {
            if (entry.getValue().getUserID() == userID) {
                System.out.println(entry.getValue());
                return entry.getValue();
            }
        }
        return null;
    }
}
