package com.endava.bookingDemoApp;

import driverManager.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBaseClass {

    protected WebDriver driver;

    @BeforeEach
    public void setUpDriver() {
        driver = DriverManager.getWebDriver();
    }

    @AfterEach
    public void tearDownDriver() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
