package com.kodilla.spring.portfolio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {


@Bean
public Board getBoard(){
    return  new Board(taskToDoList(),inProgress(),doneTask());
}
    @Bean(name="toDo")
    public TaskList taskToDoList(){
        return  new TaskList();
    }
    @Bean(name="inProgress")
    public TaskList inProgress(){
        return  new TaskList();
    }

    @Bean(name = "taskDone")
    public TaskList doneTask(){
        return  new TaskList();
    }

}
