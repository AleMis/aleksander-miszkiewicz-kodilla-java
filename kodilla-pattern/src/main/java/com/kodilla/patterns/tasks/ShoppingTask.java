package com.kodilla.patterns.tasks;

public class ShoppingTask implements Task{

    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean execution;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Task : " + taskName + " - in realization.");
        setExecution(true);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isExecution()) return true;
        return false;
    }

    public boolean isExecution() {
        return execution;
    }

    public void setExecution(boolean execution) {
        this.execution = execution;
    }
}
