package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKSLISTS")
public class TaskLists {
    private int id;
    private String listName;
    private String description;

    public TaskLists() {
    }

    public TaskLists(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID")
    public int getId() {
        return id;
    }
      @Column(name="LISTNAME")
      @NotNull
    public String getListName() {
        return listName;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
