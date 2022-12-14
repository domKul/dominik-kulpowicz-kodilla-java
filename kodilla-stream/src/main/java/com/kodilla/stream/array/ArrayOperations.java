package com.kodilla.stream.array;


import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(s->numbers[s])
                .forEach(System.out::println);

      OptionalDouble avr=   IntStream.range(0, numbers.length)
                .map(s->numbers[s])
                .average();
         return avr;
    }

}
