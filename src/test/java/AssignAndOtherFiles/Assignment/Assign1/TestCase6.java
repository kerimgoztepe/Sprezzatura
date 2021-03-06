package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase6 {

    //Test case #6
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

            //String email = driver.findElement(By.id("mail")).getText();
            String email = driver.findElement(By.id("mail")).getAttribute("value");

            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/form/div[2]/button/svg/path")).click();
            System.out.println(email);

            //String copiedEmail = driver.findElement(By.xpath("//*[@id=\"email\"]")).getAttribute("azion.kenson@iillii.org").toString();
            //System.out.println(copiedEmail);

            //Step 3. Then go to “https://practicecybertekschool.herokuapp.com”
            driver.get("https://practice-cybertekschool.herokuapp.com");

            //Step 4. And click on “Sign Up For Mailing List".
            driver.findElement(By.partialLinkText("Sign Up")).click();

            //Step 5. Enter any valid name.
            WebElement yourName = driver.findElement(By.name("full_name"));
            yourName.sendKeys(faker.name().fullName());

            //Step 6. Enter email from the Step 2.
            WebElement yourEmail = driver.findElement(By.name("email"));
            //yourEmail.sendKeys(email);
            yourEmail.sendKeys("thisismail@google.com"); //i could not use email above...why???

            //Step 7. Click Sign Up
            WebElement signUp = driver.findElement(By.name("wooden_spoon"));
            signUp.click();

            //Step 8. Verify that following message is displayed:

            //“Thank you for signing up. Click the button below to return to the home page.”
            WebElement signupMessage = driver.findElement(By.name("signup_message"));
            Assert.assertTrue(signupMessage.isDisplayed(),"Thank you for signing up. Click the button below to return to the home page.");

            //Step 9. Navigate back to the “https://temp-mail.org/”
            driver.get("https://temp-mail.org/");


            //Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
            WebElement receivedMail = driver.findElement(By.xpath("(//span)[6]"));
            System.out.println("receivedMail.isDisplayed() = " + receivedMail.isDisplayed());
            Assert.assertTrue(receivedMail.isDisplayed());
            receivedMail.click();

            //Step 11. Click on that email to open it.
            String actualSender = driver.findElement(By.id("odesilatel")).getText();
            String expectedSender = "do-not-reply@practice.cybertekschool.com";
            Assert.assertEquals(actualSender,expectedSender,"verifying the sender");
            String expectedSubject = "Thanks for subscribing to practice.cybertekschool.com!";
            String actualSubject = driver.findElement(By.id("predmet")).getText();
            Assert.assertEquals(actualSubject, expectedSubject,"verifying the subject");
            //Step 12. Verify that email is from: “do-notreply@practice.cybertekschool.com”

            //Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”

        }
    }
