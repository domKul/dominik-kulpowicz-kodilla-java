package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkObserverTestSuit {


    @Test
    public void testUpdate(){
        //Given
        HomeworkQueue homeworkQueue1 = new HomeworkQueue("queue1");
        HomeworkQueue homeworkQueue2 = new HomeworkQueue("queue2");
        HomeworkQueue homeworkQueue3 = new HomeworkQueue("queue3");
        Mentor mentor1 = new Mentor("John");
        Mentor mentor2 = new Mentor("Adam");
        homeworkQueue1.registerObserver(mentor1);
        homeworkQueue1.registerObserver(mentor2);
        homeworkQueue2.registerObserver(mentor1);
        homeworkQueue2.registerObserver(mentor2);
        homeworkQueue3.registerObserver(mentor1);
        //When
        homeworkQueue1.addTask("TEST TASK1 ADDING TO QUEUE1");
        homeworkQueue1.addTask("TEST TASK2 ADDING TO QUEUE1");
        homeworkQueue1.addTask("TEST TASK3 ADDING TO QUEUE1");
        homeworkQueue2.addTask("TEST TASK1 ADDING TO QUEUE2");
        homeworkQueue2.addTask("TEST TASK2 ADDING TO QUEUE2");
        homeworkQueue2.addTask("TEST TASK3 ADDING TO QUEUE2");
        homeworkQueue3.addTask("TEST TASK1 ADDING TO QUEUE3");
        homeworkQueue3.addTask("TEST TASK2 ADDING TO QUEUE3");
        //Then
        assertEquals(8,mentor1.getUpdateCount());
        assertEquals(6,mentor2.getUpdateCount());
    }
}
