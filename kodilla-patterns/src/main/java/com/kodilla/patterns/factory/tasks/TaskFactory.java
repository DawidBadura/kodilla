package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task executeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("shoptask", "fish",22.2);
            case PAINTING_TASK:
                return new PaintingTask("painttask", "brown", "wall");
            case DRIVING_TASK:
                return new DrivingTask("drivingtask", "vien", "car");
            default:
                return null;
        }

    }
}
