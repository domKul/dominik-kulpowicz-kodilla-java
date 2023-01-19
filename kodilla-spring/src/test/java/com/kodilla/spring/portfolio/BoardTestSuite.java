package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {
    @Autowired
    Board board;

    @Test
    void testTaskAdd(){
        //Given
        board.getToDoList().getTasks().add("Task1");
        board.getInProgressList().getTasks().add("Task2");
        board.getDoneList().getTasks().add("Task3");

        //WHen&Then

        assertEquals("Task1",board.getToDoList().getTasks().get(0));
        assertEquals("Task2",board.getInProgressList().getTasks().get(0));
        assertEquals("Task3",board.getDoneList().getTasks().get(0));


    }
}
