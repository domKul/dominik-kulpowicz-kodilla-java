package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

   private final List<Country> countryList = new ArrayList<>();

   public void addCountry(Country country) {
       countryList.add(country);
   }
    public List<Country> getCountryPpl() {
        return countryList;
    }


    @Override
    public String toString() {
        return "Continent{" +
                "continentName=" + countryList +
                '}';
    }
}
