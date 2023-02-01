package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskLists;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListsDao extends CrudRepository<TaskLists,Integer> {
    List<TaskLists> findByListName(String listName);
}
