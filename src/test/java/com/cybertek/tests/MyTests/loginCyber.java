package com.cybertek.tests.MyTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginCyber {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://52.13.64.199/login");

        // locate web elements
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='E-mail or username']"));
        WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginSystem = driver.findElement(By.xpath("//span[normalize-space()='Login']"));

        //username and password
        userName.sendKeys("marcoAdmin");
        passWord.sendKeys("Antonio+123");
        loginSystem.click();

        //get current url from browser and save as an actual
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://52.13.64.199/login";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("you are in right web site");
        }else{
            System.out.println("test failed");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }


    }
}