package com.Ui;

import base.BaseUITest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest extends BaseUITest {

    @Test
    public void loginTest() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.id("loginButton")).click();

        String welcomeMessage = driver.findElement(By.id("welcomeMessage")).getText();
        Assert.assertEquals(welcomeMessage, "Welcome, Admin!");
    }
}
