/*package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.jvm.hotspot.interpreter.BytecodeWithCPIndex;

public class TestCase1 {
    WebDriver driver;

    @BeforeMethod
    public  void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        //step1.go to below site
        //Step 2. Click on “Registration Form”
        //Step 3. Enter “wrong_dob” into date of birth input box.
        //Step 4. Verify that warning message is displayed:
        //“The date of birth is not valid

    driver.get("https://practicecybertekschool.herokuapp.com");
        Thread.sleep(2000);
        //driver.findElement;
        //WebElement ClinkHeroku = driver.findElement(By.xpath("/html/body/div[2]/a"));
        WebElement ClinkHeroku = driver.findElement(By.linkText("https://www.heroku.com/home"));
        ClinkHeroku.click();
        //driver.findElement(By.xpath("/html/body/div[2]/a")).click();
        //signOnImage.sendKeys(Keys.RETURN);
        //Thread.sleep(2000);

    driver.navigate().to("https://signup.heroku.com/");
    WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"hero-slider\"]/ul/li[5]/div/div[2]/div/a"));
    SignUp.click();
    //there is no birthdate here
        //*[@id="hero-slider"]/ul/li[5]/div/div[2]/div/a   xpath for sighup

    driver.quit();


    }

}
*/