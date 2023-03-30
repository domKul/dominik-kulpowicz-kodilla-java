package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable{

    private final List<HonewworkObserver> observers;
    private final List<String> tasks;
    private final String name;

    public HomeworkQueue(String name) {
        this.name = name;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(HonewworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HonewworkObserver observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HonewworkObserver observer) {
        observers.remove(observer);
    }

    public List<HonewworkObserver> getObservers() {
        return observers;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
