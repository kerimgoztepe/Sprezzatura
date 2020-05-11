package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase8 {
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

        //Step 2. And click on “Autocomplete”.
        WebElement autoComplete = driver.findElement(By.linkText("Autocomplete"));
        autoComplete.click();

        //Step 3. Enter “United States of America” into country input box.
        WebElement country = driver.findElement(By.xpath("//*[@id=\"myCountry\"]"));
        country.sendKeys("United States of America");


        //WebElement submitClick = driver.findElement(By.xpath("//*[@id=\"content\"]/div/form/input"));
        //WebElement submitClick = driver.findElement(By.cssSelector("#content > div > form > input"));
        //submitClick.click();
        driver.findElement(By.cssSelector("#content > div > form > input")).click();


        //Step 4. Verify that following message is displayed: “You selected: United States of America
        String selectedCountry = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        String expectedCountryMessage = "You selected: United States of America";
        Assert.assertEquals(selectedCountry,expectedCountryMessage,"verifying the message");




    }
}
