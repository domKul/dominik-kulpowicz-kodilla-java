package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProbablyIWillThrowExceptionTestSuit {


    @Test
    void TestProbablyIWillThrowException() throws Exception {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
       assertAll( ()->assertThrows(Exception.class,()-> secondChallenge.probablyIWillThrowException(2,1.5)),
               ()-> assertThrows(Exception.class,()-> secondChallenge.probablyIWillThrowException(1,1.5)),
               ()->assertThrows(Exception.class,()-> secondChallenge.probablyIWillThrowException(0.5,1.5)),
               ()->assertThrows(Exception.class,()-> secondChallenge.probablyIWillThrowException(10,1.5))

       );



    }
}
