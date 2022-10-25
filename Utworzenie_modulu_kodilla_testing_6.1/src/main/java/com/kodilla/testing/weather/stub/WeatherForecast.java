package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double>calculateForecast(){
        Map<String, Double>resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue()+1);
        }
        return resultMap;
    }

    public double averageTemperature(){
        double sum =0;
        for(double temp : calculateForecast().values()){
            sum = sum + temp / calculateForecast().size();
        }
        return sum;
    }
    public double mediananTemperatures(){
        Collection<Double> values = temperatures.getTemperatures().values();
        ArrayList<Double> listOfValues = new ArrayList<>(values);
        Collections.sort(listOfValues);
        double median;
        if (listOfValues.size() % 2 == 0)
            median = ((double) listOfValues.get(listOfValues.size() / 2) +
                    (double) listOfValues.get(listOfValues.size() / 2 - 1))/2;
        else
            median = (double) listOfValues.get(listOfValues.size() / 2);

        return median;

    }


}

