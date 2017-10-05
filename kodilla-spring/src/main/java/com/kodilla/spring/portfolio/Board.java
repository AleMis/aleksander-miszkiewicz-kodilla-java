package com.kodilla.spring.portfolio;

public class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void readToDoList() {
        System.out.println("Tasks to do : ");
        toDoList.tasks.stream().forEach(System.out::println);
    }

    public void readInProgressList() {
        System.out.println("Tasks in progress : ");
        inProgressList.tasks.stream().forEach(System.out::println);
    }

    public void readDoneList() {
        System.out.println("Done tasks : ");
        doneList.tasks.stream().forEach(System.out::println);
    }
}
