package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.tasks.Task;
import com.kodilla.patterns.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask("Shopping Task");
        shoppingTask.executeTask();

        //Then
        Assert.assertEquals("Buy", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask("Driving Task");

        //Then
        Assert.assertEquals("Drive", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask("Painting Task");
        paintingTask.executeTask();
        //Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }
}
