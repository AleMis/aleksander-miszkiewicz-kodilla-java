package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    boolean execution;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
