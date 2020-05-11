package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tempMail {

        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void driverClose() throws InterruptedException {
            Thread.sleep(3000);
            //driver.quit();
        }
        @Test
        public void test1(){

        Faker faker = new Faker();

        //Step 1. Go to "https://www.tempmailaddress.com/"
        //driver.get("https://www.tempmailaddress.com"); site calismiyor
        driver.get("https://temp-mail.org/");
        //Step 2. Copy and save email as a string.
        // driver.findElement(By.xpath("//*[@id=\"email\"]");
        //WebElement locatorElement = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();

        String email = driver.findElement(By.id("//*[@id=\"mail\"]")).getText();
        WebElement emailClick = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/form/div[2]/button/svg"));
        emailClick.click();
        //driver.findElement(By.cssSelector("body > div.section-top-qr > div > div > div.col-xs-12.col-sm-12.col-md-12.col-lg-12.col-xl-6 > div.temp-emailbox > form > div.input-box-col.hidden-xs-sm > button > svg > path"));
        System.out.println(email);
    }
}