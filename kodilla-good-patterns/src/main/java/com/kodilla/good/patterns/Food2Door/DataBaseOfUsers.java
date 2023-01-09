package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class DataBaseOfUsers implements  UserInformation{

   private Map<Integer,User> listOfUsers = new HashMap<>();
    @Override
    public User userInformation(String usersName, String lastName) {
        listOfUsers.put(1 , new User("Adam", "aaa", LocalDate.of(1999,2,17)));
        listOfUsers.put(2 , new User("Marci", "bbb", LocalDate.of(2000,6,11)));
        listOfUsers.put(3 , new User("Agnieszka", "ccc", LocalDate.of(1991,12,12)));
        listOfUsers.put(4 , new User("Marta", "ddd", LocalDate.of(1993,7,23)));
        for (Map.Entry<Integer, User> entry : listOfUsers.entrySet()){
            if (entry.getValue().firstName.equals(usersName)&&entry.getValue().lastName.equals(lastName)){
              return entry.getValue();
            }
        }
        return null;
    }
}
