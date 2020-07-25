package com.nixsolutions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSettings {
    public FirefoxDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/home/alex/Documents/geckodriver");
        driver = new FirefoxDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
