package com.cybertek.tests.day15_staletest;

import com.cybertek.tests.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class BuyHouse extends TestBase {
    @Test
    public void buyHouse1() {
        // step 1. go to web site
        driver.get("https://www.rightmove.co.uk/property-for-sale.html");
        // step 2. locate element
        WebElement houseSearch = driver.findElement(By.id("searchLocation"));
        houseSearch.sendKeys("Leicester");
        houseSearch.click();
        //step 3. list of houses related with Leicester
        List<WebElement> dropdownOptions = driver.findElements(By.id("typeAheadResult"));

        //step 4. pront list of dynamic dropdown
        for (WebElement houseoption : dropdownOptions) {
            System.out.println("Your search results are =" + houseoption.getText());
            System.out.println(dropdownOptions.toArray()); // this is not working or i did not see
        }
        // step 3 locate search and make a search
        WebElement searchKey = driver.findElement(By.id("search"));
        searchKey.click();
    }
    @Test
        public void buyHouse2(){
        Faker fakeMan = new Faker();
        driver.get("https://www.rightmove.co.uk/property-for-sale.html");
        //step1. click sign in
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"sign-in\"]/span"));signIn.click();
        //step2. try to enter site
        WebElement userName = driver.findElement(By.name("email"));
        userName.sendKeys("John Isaac Berger");

        WebElement passWd = driver.findElement(By.name("password"));passWd.sendKeys("123456HJKqwe");




        }


    }

