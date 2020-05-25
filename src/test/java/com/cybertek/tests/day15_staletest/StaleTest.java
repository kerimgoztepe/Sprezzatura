package com.cybertek.tests.day15_staletest;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class StaleTest extends TestBase {

    @Test
    public void test1a() {
        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Selenium"+ Keys.ENTER);

        WebElement results = driver.findElement(By.id("results-stats"));
        Assert.assertTrue(results.isDisplayed());
        //goto back google again

        driver.navigate().back();
        input = driver.findElement(By.name("q"));
        input.sendKeys("Java"+Keys.ENTER);
        results = driver.findElement(By.id("results-stats"));
        Assert.assertTrue(results.isDisplayed());


    }
    @Test
     public void test2() throws InterruptedException {
        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Java" + Keys.ENTER);
        Thread.sleep(1000);
        WebElement matchingResult = driver.findElement(By.xpath(".//div[@class='aajZCb']/ul"));
        List<WebElement> listResult = matchingResult.findElements(By.xpath("//li/div/div[@class='sbtc']"));
        System.out.println(listResult.size());
        //if you want to print matching results
        for (WebElement results : listResult) {
            String value = results.getText();
            System.out.println(value);
        }
    }
    @Test
    public void test4() throws InterruptedException {
        driver.get("https://www.google.com");

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Selenium"+Keys.ENTER);

        WebElement results = driver.findElement(By.id("result-stats"));
        Assert.assertTrue(results.isDisplayed());

        //go to google again
        driver.navigate().back();
        Thread.sleep(1000);
        // input = driver.findElement(By.name("q"));
        input.sendKeys("Java"+Keys.ENTER);
        results = driver.findElement(By.id("result-stats"));

        Assert.assertTrue(results.isDisplayed());

    }




}
