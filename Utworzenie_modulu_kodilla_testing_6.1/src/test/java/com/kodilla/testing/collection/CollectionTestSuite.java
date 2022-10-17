
package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.util.*;


@DisplayName("Collection Test Suit")

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test case: Started");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: End");
    }

    @DisplayName(" Creating an object with List" +
            "and if List are empty the method should work correctly ")
    @Test

    public void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();

        //When
        oddNumbersExterminator.exterminate(numbers);
        System.out.println("List size: " + numbers.size());

        //Then
        Assertions.assertTrue(numbers.isEmpty());
    }


    @DisplayName("When creating Object and List with numbers(odd and even) added to List" +
            "the List should print only even numbesr")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List ints = Arrays.asList(1, 22, 27, 4, 5);
        List<Integer>numbers = new ArrayList<>(ints);

        //When
       oddNumbersExterminator.exterminate(numbers);

        //Then
        System.out.println("even numbers: " + numbers);
        Assertions.assertFalse(numbers.isEmpty());








    }





}
