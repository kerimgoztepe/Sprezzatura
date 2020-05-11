package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase9 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void driverClose() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
    @Test
    public void test1() {
        //Step 1. Go to “https://practicecybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        //Step 2. And click on “Status Codes”.
        driver.findElement(By.linkText("Status Codes")).click();


        //Step 3. Then click on “200”.
        driver.findElement(By.linkText("200")).click();

        //Step 4. Verify that following message is displayed: “This page returned a 200 status code
        //WebElement statusMessage = driver.findElement(By.cssSelector("\n" +  "    This page returned a 200 status code."));

       String statusMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/text()[1]")).getAttribute("value");
       String expectedMessage = "This page returned a 200 status code";
       Assert.assertEquals(statusMessage,expectedMessage,"verifying the message");


    }
}
