package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDatoTestSuite {


    @Autowired
    private TaskListDao taskListDao;

    private static final String LIST_NAME = "Test: List Name";
    private static final String DESCRIPTION = "Test: List Description";

    @Test
    public void  testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> readList = taskListDao.findByListName(LIST_NAME);
        int quantity = readList.size();
        Assert.assertEquals(1, quantity);

        //CleanUp
        int id = taskList.getId();
        taskListDao.delete(id);
    }
}
