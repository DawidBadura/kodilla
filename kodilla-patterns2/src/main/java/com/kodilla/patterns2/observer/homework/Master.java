package com.kodilla.patterns2.observer.homework;

public class Master implements Observer {
    private final String name;
    private int count;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void update(QuequeStudent quequeStudent) {
        System.out.println(name + ": New message from Student " + quequeStudent.getName() + "\n" +
                " (total: " + quequeStudent.getTasks().size() + " messages)" );
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
