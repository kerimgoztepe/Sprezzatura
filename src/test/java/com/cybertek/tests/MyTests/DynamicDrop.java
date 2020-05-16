package com.cybertek.tests.MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class DynamicDrop {
/*
    @Test
    public void dropdownsss() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cheapoair.com/flights/book-now-pay-later-flights ");
        //Task 1 ----> find the frombutton and send fk

        WebElement fromButton = driver.findElement(By.id("ember532"));
        fromButton.clear();
        fromButton.sendKeys("fk");
        Thread.sleep(2000);
        // Task 2 ----> print the when type fk

        driver.findElement(By.xpath("//*[contains(text(),'I Accept')]")).click();
        List<WebElement> airports = driver.findElements();
        System.out.println(airports.size());

        for (WebElement airport : airports) {
            System.out.println(airport.getText());
        }
    }

 */

    @Test
    //this test is working
    public void dropdown() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cheapoair.com/flights/book-now-pay-later-flights");

        WebElement from = driver.findElement(By.id("ember532"));
        from.clear();
        from.sendKeys("fk");

        List<WebElement> elements = driver.findElements(By.cssSelector(".suggestion-box__content"));

        System.out.println(elements.size());
        //print each option
        for (WebElement option : elements) {
            System.out.println(option.getText());
        }
    }

    @Test

    public void dropdown1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cheapoair.com/flights/book-now-pay-later-flights");
        //WebElement from = driver.findElement(By.id("ember532"));
        //from.clear();
        //from.sendKeys("fk");

        /*WebElement element = driver.findElement(By.id("ember532"));
        Select oSelect = new Select(element);

         */

        Select oSelect = new Select(driver.findElement(By.id("ember532")));
        List<WebElement> elementCount = oSelect.getOptions();
        int iSize = elementCount.size();

        for (int i = 0; i < iSize; i++) {
            String sValue = elementCount.get(i).getText();
            System.out.println(sValue);
        }
    }

    @Test
    public void testDrop() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.makemytrip.com/");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input' and @id='hp-widget__sfrom']"))).click();
        List<WebElement> myList = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='ui-menu-item'][starts-with(@id,'ui-id-')]//span[@class='autoCompleteItem__label']")));
        for (WebElement element : myList) {
            if (element.getText().contains("Mumbai")) ;

            element.click();
        }

    }
    @Test

    public void testDrop2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.makemytrip.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement from =  wait.until(ExpectedConditions.elementToBeClickable(By.id("hp-widget__sfrom")));
        from.click();
        from.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[class*='ui-widget-content hp-widget__sfrom']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@aria-label,'Top Cities : Mumbai, India ')]"))).click();

    }

}

