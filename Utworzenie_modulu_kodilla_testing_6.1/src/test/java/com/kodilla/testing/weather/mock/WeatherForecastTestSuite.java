package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("Begin of tests");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are done");
    }
    @BeforeEach
    public void beforEachTest(){
        testCounter++;
        System.out.println("Preparing for execute test #" + testCounter);
    }
    @BeforeEach
    public void beforeEachTest(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }
    @Mock
    private Temperatures temperaturesMock;


    @Test
    void testCalculateForecastWithMock(){
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5,quantityOfSensors );

    }
    @Test
    void testAverageTemperatures(){
        //Given
       /* Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        */
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double sum =  weatherForecast.averageTemperature();

         //Then
        Assertions.assertEquals(26.56, sum);

    }
    @Test
    void testMedianaTemperatures(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
         double temperaturemedian = weatherForecast.mediananTemperatures();

        //Then
        Assertions.assertEquals(25.5, temperaturemedian);
    }
}
