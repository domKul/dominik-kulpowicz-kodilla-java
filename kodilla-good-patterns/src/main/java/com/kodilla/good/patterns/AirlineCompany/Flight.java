package com.kodilla.good.patterns.AirlineCompany;

import java.util.Objects;

public class Flight implements FlyInformations{

    String departureFrom;
    String flyTo;

    public Flight(String departureFrom, String flyTo) {
        this.departureFrom = departureFrom;
        this.flyTo=flyTo;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    @Override
    public String toString() {
        return "Departure From= " + departureFrom + " Arrival To= " + flyTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight fly = (Flight) o;
        return Objects.equals(departureFrom, fly.departureFrom) && Objects.equals(flyTo, fly.flyTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureFrom, flyTo);
    }


    @Override
    public Flight flyInfo(String from, String to) {
        return new Flight(from,to);
    }
}
