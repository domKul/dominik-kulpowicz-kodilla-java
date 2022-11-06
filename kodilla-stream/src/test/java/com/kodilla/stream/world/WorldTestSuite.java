package com.kodilla.stream.world;
import java.math.BigDecimal;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        //Creating list of countries
        Country Poland = new Country(new BigDecimal("36987345"));
        Country Germany = new Country(new BigDecimal("96356782"));
        Country France = new Country(new BigDecimal("678945673"));
        Country Mexico = new Country(new BigDecimal("1567234567"));
        Country Zanzibar = new Country(new BigDecimal("153728"));
        Country Kenya = new Country(new BigDecimal("282471990"));
        Country Egypt = new Country(new BigDecimal("34784489"));



        //When
        //Adding countries to Continents
        Continent Europe = new Continent();
        Europe.addCountry(Poland);
        Europe.addCountry(Germany);
        Europe.addCountry(France);

        Continent Africa = new Continent();
        Africa.addCountry(Kenya);
        Africa.addCountry(Egypt);
        Africa.addCountry(Zanzibar);

        Continent America = new Continent();
        America.addCountry(Mexico);

        World allWorld =new World();
        allWorld.addContinentToList(Europe);
        allWorld.addContinentToList(Africa);
        allWorld.addContinentToList(America);

        //Then
        BigDecimal expectedNumberOfPeople = new BigDecimal("2696934574");
        assertEquals(expectedNumberOfPeople,allWorld.getPeopleQuantity());

    }
}
