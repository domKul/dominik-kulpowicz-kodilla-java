package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{

    String taskName;
    String where;
    String using;
    private boolean isExecuted ;


    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Task i sexecuted");
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
