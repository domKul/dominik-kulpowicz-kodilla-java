package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;
    private boolean isExecuted ;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Task is executed.");
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
       return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }

}
