package com.kodilla.patterns.factory.tasks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //Whne
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();

        //Then
        assertEquals("Shoping task",shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //WHne
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        //THen
        assertEquals("Driving task", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        Task paintingTask = factory.createTask(TaskFactory.PAINTIONGTASK);
        //When
        paintingTask.executeTask();
        //Then
        assertEquals("Painting task", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }


}
