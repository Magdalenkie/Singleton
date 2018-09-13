package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {
    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //given
        //when
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //given
        //when
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //given
        //when
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //then
        Assert.assertTrue(result);
    }
}

