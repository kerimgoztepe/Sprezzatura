package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase7 {

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
        //Step 2. And click on “File Upload".
        WebElement fileUpload = driver.findElement(By.linkText("File Upload"));
        fileUpload.click();


        //Step 3. Upload any file with .txt extension from your computer.
        WebElement uploadElement = driver.findElement(By.id("file-upload"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\volkan\\Desktop\\testfor7.txt");

        //        Step 4. Click “Upload” button.
        WebElement uploadClick = driver.findElement(By.id("file-submit"));
        uploadClick.click();

        //        Step 5. Verify that subject is: “File Uploaded!”

        WebElement signupMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
        Assert.assertTrue(signupMessage.isDisplayed(),"File Uploaded");

        //Step 6. Verify that uploaded file name is displayed. Note: use element.sendKeys(“/file/path”) with
        //specifying path to the file for uploading. Run this method against “Choose File” button
        System.out.println(driver.findElement(By.id("uploaded-files")).getText());

    }
}
