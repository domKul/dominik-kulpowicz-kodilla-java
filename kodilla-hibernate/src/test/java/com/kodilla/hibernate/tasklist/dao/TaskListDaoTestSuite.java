package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static String LISTDESCRIPTION = "DESCRIPTION, DESCRIPTION";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("TASKLIST",LISTDESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //Then
        List<TaskList> readTask = taskListDao.findByListName(listName);

        //Then
        assertEquals(1,readTask.size());
        int id = readTask.get(0).getId();
        taskListDao.deleteById(id);

    }
}
