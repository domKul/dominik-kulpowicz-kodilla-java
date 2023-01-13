package com.kodilla.good.patterns.AirlineCompany;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightFinding fly1 = new FlightFinder();


        List<Flight> flights = fly1.fromByToFlightFind("Warszawa", "Poznan", "Katowice");
        flights.forEach(System.out::println);


    }
}
