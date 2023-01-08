package com.kodilla.good.patterns.Food2Door;

public class UserLocalisation {

    String streetName;
    String cityName;
    int postalCode;
    int homeNumber;

    public UserLocalisation(String streetName, String cityName, int postalCode, int homeNumber) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.postalCode = postalCode;
        this.homeNumber = homeNumber;
    }

    public String toString(){
        return "City: " + cityName + "Postal code: "+ postalCode +
                "Street name: " + streetName + "Home number: " + homeNumber;
    }
}
