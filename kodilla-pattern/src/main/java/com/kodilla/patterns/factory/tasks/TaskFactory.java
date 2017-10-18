package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    private final static String SHOPPING_TASK = "Shopping Task";
    private final static String PAINTING_TASK = "Painting Task";
    private final static String DRIVING_TASK = "Driving Task";

    public Task makeTask(final String task) {

        switch (task) {
            case SHOPPING_TASK:
                return new ShoppingTask("Buy", "Milk", 2.0);
            case PAINTING_TASK:
                return new PaintingTask("Paint", "Green", "Room");
            case DRIVING_TASK:
                return new DrivingTask("Drive", "Take kids fro school", "Car");
            default:
                return null;
        }
    }
}
