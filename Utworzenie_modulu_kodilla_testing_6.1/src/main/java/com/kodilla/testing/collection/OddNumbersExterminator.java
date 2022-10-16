package com.kodilla.testing.collection;
import java.util.*;


public class OddNumbersExterminator {


    public List<Integer> exterminate(List<Integer> numbers) {
        numbers.removeIf(i -> i % 2 != 0);
        return numbers;
    }
}

