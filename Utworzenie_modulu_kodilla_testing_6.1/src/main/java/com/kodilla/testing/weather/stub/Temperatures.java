package com.kodilla.testing.weather.stub;

import java.util.Date;
import java.util.Map;

public interface Temperatures {

    Map<String, Double>getTemperatures();
    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees
}
