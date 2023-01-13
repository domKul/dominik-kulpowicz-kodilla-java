package com.kodilla.good.patterns.AirlineCompany;

import java.util.List;

public interface FlightFinding {

    List<Flight> fromFlightFind(String from);
    List<Flight> toFlightFind(String to);
    List<Flight> fromByToFlightFind(String from, String to,String by);
}
