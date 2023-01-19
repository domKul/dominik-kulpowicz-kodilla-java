package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
private static Logger logger ;

    @BeforeAll
    public static void loggs(){
        logger=Logger.LOGINSTANCE;
        logger.log("LOGS");
    }

    @Test
    void getLastLogTest(){
        //Given
        String getlogs = logger.getLastLog();

        //When&Then
        assertEquals("LOGS",getlogs);

    }
}
