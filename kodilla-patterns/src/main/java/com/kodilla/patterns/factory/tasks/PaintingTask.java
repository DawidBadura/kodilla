package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean executed;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.executed = false;

    }

    @Override
    public void executeTask() {
        System.out.println("painting task done");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
