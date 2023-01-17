package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskTimeoutException;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDo")
TaskList taskList;

    @Bean(name="toDo")
    public TaskList taskToDoList(){
        return  new Board().toDoList;
    }
    @Bean(name="inProgress")
    public TaskList inProgress(){
        return  new Board().inProgressList;
    }

    @Bean(name = "taskDone")
    public TaskList doneTask(){
        return  new Board().doneList;

    }

}
