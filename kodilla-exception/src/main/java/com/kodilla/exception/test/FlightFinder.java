package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {


    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("WAW", true);
        flightMap.put("GDN", true);
        flightMap.put("KRK", true);
        flightMap.put("WRO", false);
        flightMap.put("RZE", false);
        Boolean airport1 = flightMap.get(flight.getArrivalAirport());
        Boolean airport2 = flightMap.get(flight.getDepartureAirport());


            if (flightMap.get(flight.getDepartureAirport()) == null||
                    flightMap.get(flight.getArrivalAirport()) == null) {
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




