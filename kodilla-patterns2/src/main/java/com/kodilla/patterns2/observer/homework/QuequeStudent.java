package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QuequeStudent implements Folded {
    private final String name;
    private final List<String> tasks;
    private final List<Observer> observers;

    public QuequeStudent(String name) {
        this.name = name;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }
    public void putTask(String task){
        tasks.add(task);
        notifyMaster();
    }

    @Override
    public void registerMentor(Master master) {
        observers.add(master);
    }

    @Override
    public void notifyMaster() {
        for(Observer observer:observers){
            observer.update(this);
        }
    }

    @Override
    public void removeMaster(Master master) {
        observers.remove(master);

    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
