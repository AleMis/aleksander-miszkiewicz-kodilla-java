package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "To Do List")
    @Scope("prototype")
    public TaskList getToDoList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Clean the room");
        return new TaskList(list);
    }

    @Bean(name = "In progress list")
    @Scope("prototype")
    public TaskList getInProgressList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Wash the dishes");
        return new TaskList(list);
    }

    @Bean(name = "Done List")
    @Scope("prototype")
    public TaskList getDoneList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Go for run");
        return new TaskList(list);
    }





}
