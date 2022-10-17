package com.kodilla.testing.collection;
import java.util.*;


public class OddNumbersExterminator {


    public List<Integer> exterminate(List<Integer> numbers) {
       List<Integer>evenNumbers = new ArrayList<>();
        for (int i=0;i<numbers.size();i++){
            int even=numbers.get(i)%2;
            if (even!=0){
                numbers.remove(i);
            }
        }
        return numbers;
}
}

