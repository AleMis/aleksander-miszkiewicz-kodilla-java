package com.kodilla.stream.formuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

   private final List<FormUser> listOfUsers = new ArrayList<>();


    public Forum() {

        listOfUsers.add(new FormUser(001, "kołek", 'm', 1990, 12,11, 100));
        listOfUsers.add(new FormUser(002, "trolek", 'm', 1986, 11,22, 5));
        listOfUsers.add(new FormUser(003, "bolek", 'm', 1998, 9,17, 10));
        listOfUsers.add(new FormUser(004, "lolek", 'm', 2000, 1,5, 0));
        listOfUsers.add(new FormUser(005, "virus", 'm', 2010, 2,3, 40));
        listOfUsers.add(new FormUser(006, "kotka", 'f', 2005, 5,31, 200));
        listOfUsers.add(new FormUser(007, "humus", 'f', 1995, 3,12, 150));
    }

    public List<FormUser> getListOfUsers() {

        return new ArrayList<>(listOfUsers);
    }
}
