package com.kodilla.good.patterns.AirlineCompany;

import java.util.List;

public class FlightFinder implements FlightFinding {


    @Override
    public List<Flight> fromFlightFind(String from) {
        System.out.println("Flight from - " + from );
        return FlightListBase.getFlightList().stream()
                .filter(x -> x.getDepartureFrom().equals(from)).toList();


    }
    @Override
    public List<Flight> toFlightFind(String to) {
        System.out.println("Flight to - " + to);
       return FlightListBase.flightList.stream()
               .filter(x -> x.getFlyTo().equals(to)).toList();

    }

    @Override
    public List<Flight> fromByToFlightFind(String from, String to, String by) {
        return FlightListBase.flightList.stream()
                .filter(x->x.getDepartureFrom().equals(by)&&x.getFlyTo().equals(to)||
                        x.getDepartureFrom().equals(from)&&x.getFlyTo().equals(by)).toList();
    }
}
