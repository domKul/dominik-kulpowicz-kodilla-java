package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "Shoppingtask";
    public static final String PAINTIONGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public Task createTask(String taskClass){
       return switch (taskClass){
            case SHOPPINGTASK -> new ShoppingTask("Shoping task","Item1", 100);
            case PAINTIONGTASK -> new PaintingTask("Painting task", "Blue","Wall");
            case DRIVINGTASK -> new DrivingTask("Driving task", "Big city","Car");
            default -> null;
        };
    }
}
