package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void lestLog() {
        //Given & When
        String log = "firstLog";
        Logger.getInstance().log(log);
        //Than
        //do nothing
    }

    @Test
    public void testGetLastLog() {
        //Given & When
        String logToTest = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("firstLog", logToTest);
    }

}
