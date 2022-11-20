package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class FlightFinder {


    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("WAW", true);
        flightMap.put("GDN", true);
        flightMap.put("KRK", true);
        flightMap.put("WRO", false);
        flightMap.put("RZE", false);
        boolean airport1 = flightMap.get(flight.getArrivalAirport());
        boolean airport2 = flightMap.get(flight.getDepartureAirport());

        if (!flightMap.keySet().equals(airport1)&&flightMap.keySet().equals(airport2)){
            throw new RouteNotFoundException();
        }
        if (airport1 == true && airport2 == true) {
            System.out.println("Fly to: " + flight.getArrivalAirport() + "\n" +
                    "Fly from: " + flight.getDepartureAirport());
            } else {
               System.out.println("You can't fly");
            }
    }
}




