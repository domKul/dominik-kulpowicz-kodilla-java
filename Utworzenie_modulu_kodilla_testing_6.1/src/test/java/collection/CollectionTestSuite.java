
package collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
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
        System.out.println("List size: " + numbers.size());
        //When
       oddNumbersExterminator.exterminate(numbers);
        //Then
        Assertions.assertTrue(numbers.isEmpty());
    }


    @DisplayName("When creating Object and List with numbers(odd and even) added to List" +
            "the List should print only even numbesr")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);

        //When
        oddNumbersExterminator.exterminate(numbers);

        //Then
        if (numbers.size()>0){
            System.out.println("List size: " + numbers);

        }








    }





}
