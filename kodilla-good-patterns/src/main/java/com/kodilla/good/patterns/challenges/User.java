package com.kodilla.good.patterns.challenges;

public class User {
    String userName;
    int userID;

    public User(int userID,String userName) {
        this.userName = userName;
        this.userID = userID;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "userName= " + userName +
                " userID= " + userID;
    }
}
