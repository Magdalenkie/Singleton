package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest(){
        //given
        String log = "First log";
        String log2 = "Second log";
        //when
        Logger.getInstance().log(log);
        Logger.getInstance().log(log2);
        //then
        Assert.assertEquals(log2, Logger.getInstance().getLastLog());
    }
}

