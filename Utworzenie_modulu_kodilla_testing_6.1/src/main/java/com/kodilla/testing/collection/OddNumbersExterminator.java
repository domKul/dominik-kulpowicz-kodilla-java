package com.kodilla.testing.collection;
import java.util.*;


public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i=0;i<numbers.size();i++){
            if (numbers.get(i)%2==0){
                evenNumbers.add(numbers.get(i));
                evenNumbers.add(5);
                evenNumbers.add(7);
                evenNumbers.add(10);




            }
        }
        return evenNumbers;
     }
}

