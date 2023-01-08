package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;


public class User {

    String firstName;
    String lastName;

    LocalDate dateofBirth;


    public User(String firstName, String lastName,LocalDate dateofBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofBirth = dateofBirth;

    }

    public String toString(){
        return "First Name: " + firstName + " Last Name: " + lastName +
                " Birth date: "+ dateofBirth ;
    }


}
