package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecuted ;


    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }



    @Override
    public void executeTask() {
        System.out.println("Task is executed.");
        isExecuted = true;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}
