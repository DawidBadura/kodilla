package com.kodilla.spring.portfolio;

public class Board {
     TaskList toDoList;
     TaskList inProgressList;
     TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
    /*public void addToDoList(TaskList toDoList){
        this.toDoList=toDoList;
    }
    public void addInProgressList(TaskList inProgressList){
        this.inProgressList=inProgressList;
    }
    public void addDoneList(TaskList doneList){
        this.doneList=doneList;
    }*/

}
