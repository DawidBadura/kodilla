package com.kodilla.patterns2.observer.homework;

public interface Folded {
    void registerMentor(Master master);
    void notifyMaster();
    void removeMaster(Master master);
}

