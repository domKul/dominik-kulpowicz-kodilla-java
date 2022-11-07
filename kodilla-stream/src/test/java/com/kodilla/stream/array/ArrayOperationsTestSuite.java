package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.OptionalDouble;

public class ArrayOperationsTestSuite implements ArrayOperations{

    @Test
    public void testGetAverage(){
        //Given
        int [] numbers = {111,2,37,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        //When
        OptionalDouble average = (ArrayOperations.getAverage(numbers));


        //Then
        //the average must be 17.7
        OptionalDouble expectedAverage = OptionalDouble.of(17.7);
       Assertions.assertEquals(expectedAverage,average);


    }
}
