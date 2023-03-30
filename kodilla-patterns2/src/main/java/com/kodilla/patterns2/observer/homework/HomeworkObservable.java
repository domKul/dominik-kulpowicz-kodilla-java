package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {

    void registerObserver(HonewworkObserver observer);
    void notifyObservers();
    void removeObserver(HonewworkObserver observer);
}
