package com.kodilla.patterns2.observer.homework;

public class Mentor implements HonewworkObserver{

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": New homework in Queue " + homeworkQueue.getName() + "\n" +
                " (total: " + homeworkQueue.getObservers().size() + " homework)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
