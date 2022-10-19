
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
            "the even numbers should be added to list with only even numbers from numbers list")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(23, 22, 140, 88, 13);

        //When
        List<Integer> evenNumbers = new ArrayList<>(oddNumbersExterminator.exterminate(numbers));
        System.out.println("List numbers: "+ numbers +"\n"+"even numbers from list: " + evenNumbers);



        //Then
        List<Integer>numbersToHave = Arrays.asList(22, 140, 88);
        Assertions.assertTrue(evenNumbers.size()==numbersToHave.size() && evenNumbers.equals(numbersToHave));
        for (int i = 0; i<evenNumbers.size();i++){
            if (evenNumbers.get(i)%2!=0){
                int even = evenNumbers.get(i)%2;
                Assertions.assertTrue(even==0);
            }
        }
        System.out.println("It work");








    }





}
