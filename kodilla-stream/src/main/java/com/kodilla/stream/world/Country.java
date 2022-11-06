package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
  private final BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peoples = peopleQuantity;
        return peoples;
    }

    public Country add(Country current) {
        return current;
    }
}
