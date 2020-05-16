package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

        public Actions actions;
        public WebDriverWait wait;
        public WebDriver driver;


        @BeforeMethod
        public void setUpMethod(){
            driver = Driver.get();
            //driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            actions = new Actions(driver);
            wait = new WebDriverWait(driver,10);
        }

        @AfterMethod
        public void afterMethod() throws InterruptedException {
            Thread.sleep(2000);
            Driver.closeDriver();
        }

    }

