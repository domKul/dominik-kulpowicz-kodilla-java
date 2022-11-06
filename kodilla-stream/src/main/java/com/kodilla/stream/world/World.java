package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsList = new ArrayList<>();

    public void addContinentToList(Continent continent) {
         continentsList.add(continent);
    }

     public BigDecimal getPeopleQuantity(){
        BigDecimal pplNumber=   continentsList.stream()
                 .flatMap(ppl -> ppl.getCountryPpl().stream())
                  .map(Country::getPeopleQuantity)
                 .reduce(BigDecimal.ZERO, (sum, c) -> sum = sum.add(c));// [3]
         System.out.println("number of people: "+pplNumber);
         return pplNumber  ;

     }



}
