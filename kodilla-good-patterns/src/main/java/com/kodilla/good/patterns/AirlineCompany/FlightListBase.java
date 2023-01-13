package com.kodilla.good.patterns.AirlineCompany;

import java.util.ArrayList;
import java.util.List;

public class FlightListBase {

   static List<Flight> flightList = new ArrayList<>();
    static{
        flightList.add(new Flight("Warszawa","Poznan"));
        flightList.add(new Flight("Poznan","Katowice"));
        flightList.add(new Flight("Poznan","Modlin"));
        flightList.add(new Flight("Krakow","Katowice"));
        flightList.add(new Flight("Katowice","Gdansk"));
        flightList.add(new Flight("Gdansk","Poznan"));
        flightList.add(new Flight("Warszawa","Lublin"));
        flightList.add(new Flight("Katowice","Poznan"));
        flightList.add(new Flight("Lublin","Poznan"));
        flightList.add(new Flight("Warszawa","Katowice"));
    }

    public static List<Flight> getFlightList() {
        return flightList;
    }
}
