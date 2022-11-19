package com.kodilla.exception.test;

public class MainFlight {

    public static void main(String[]args){
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("WRO", "WAW");

        try {
           flightFinder.findFilght(flight1);
        }catch (Exception e){
            System.out.println("Incorrect airport");
        }
    }
}
