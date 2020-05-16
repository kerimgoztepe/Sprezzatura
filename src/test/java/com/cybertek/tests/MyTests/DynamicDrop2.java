package com.cybertek.tests.MyTests;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class DynamicDrop2 {

    @Test

    public void dropdown() throws InterruptedException {

        /*
        //1.locate your dropdown just like any other weblement with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        //2.create Select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //getOptions --> returns all the available options from the dropdown list
        List<WebElement> options = stateDropdown.getOptions();

        //print size of the options
        System.out.println("options.size() = " + options.size());

        //print options one by one
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to web site
        driver.get("https://www.cheapoair.com/flights/book-now-pay-later-flights");

        //locate element

        WebElement from = driver.findElement(By.id("ember532"));
        from.clear();
        from.sendKeys("fk");
        //select from webElement from

        Select flights = new Select(from);
        List<WebElement> options = flights.getOptions();


        //List<WebElement> elements = driver.findElements(By.cssSelector(".suggestion-box__content"));

        //System.out.println(options.size());
        //print each option
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}


