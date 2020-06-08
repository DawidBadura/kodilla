package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                ShoppingTask shoppingTask = new ShoppingTask("shoptask", "fish",22.2);
                shoppingTask.executeTask();
                return shoppingTask;
            case PAINTING_TASK:
                PaintingTask paintingTask = new PaintingTask("painttask", "brown", "wall");
                paintingTask.executeTask();
                return paintingTask;
            case DRIVING_TASK:
                DrivingTask drivingTask = new DrivingTask("drivingtask", "vien", "car");
                drivingTask.executeTask();
                return drivingTask;
            default:
                return null;
        }

    }
}
