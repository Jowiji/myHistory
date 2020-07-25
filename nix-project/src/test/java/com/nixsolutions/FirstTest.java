package com.nixsolutions;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {

        driver.get("https://www.nixsolutions.com/");

        String title = driver.getTitle();

        Assert.assertTrue(title.equals("NIX Solutions – Outsourcing Offshore Software Development Company"));
    }
    @Test
    public void firstTest1() {

        driver.get("https://www.nixsolutions.com/");

        String title = driver.getTitle();

        Assert.assertTrue(title.equals("NIX Solutions – Outsourcing Offshore Software Development Company"));
    }
}
