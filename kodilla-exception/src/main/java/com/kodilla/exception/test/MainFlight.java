package com.kodilla.exception.test;


public class MainFlight {

    public static void main(String[]args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("WAW", "GDN");


        try {
           flightFinder.findFlight(flight1);
        }catch (RouteNotFoundException e){

            System.out.println("Incorrect Airport " +e.getMessage());
        }
    }
}
