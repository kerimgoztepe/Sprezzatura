package com.cybertek.tests.Assignment.Assign1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase1a {
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
    public void testCase1() {
        //Step 1. Go to "https://practicecybertekschool.herokuapp.com"
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2. Click on "Registration Form"
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
        //Step 3. Enter "wrong_dob" into date of birth input box
        WebElement theDateOfBirth = driver.findElement(By.name("birthday"));
        theDateOfBirth.sendKeys("wrong_dob");
        //Step 4. Verify that warning message is displayed: "The date of birth is not valid"
        System.out.println("theDateOfBirth.isDisplayed() = " + theDateOfBirth.isDisplayed());
        Assert.assertTrue(theDateOfBirth.isDisplayed(), "Verify that warning message is displayed: it is not valid");
    }
    @Test
    public void testCase2() {
        //Step 1. Go to “https://practice-cybertekschool.herokuapp.com/”
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        //Step 3. Verify that following options for
        //programming languages are displayed: c++, java, JavaScript
        WebElement buttonCplus = driver.findElement(By.id("inlineCheckbox1"));
        buttonCplus.click();
        System.out.println("buttonCplus.isSelected() = " + buttonCplus.isSelected());

        WebElement buttonJava = driver.findElement(By.id("inlineCheckbox2"));
        buttonJava.click();
        System.out.println("buttonJava.isSelected() = " + buttonJava.isSelected());

        WebElement buttonJavaScript = driver.findElement(By.id("inlineCheckbox3"));
        buttonJavaScript.click();
        System.out.println("buttonJavaScript.isSelected() = " + buttonJavaScript.isSelected());

        //driver.quit();

    }
    @Test
    public void testCase3() {
        //Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        //Step 3. Enter only one alphabetic character into first name input box.
        //WebElement firstName = driver.findElement(By.name("firstname"));  //you can use name locator also
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        firstName.sendKeys("A");
        //firstName.sendKeys("Vincenzo Albero");
        // Step 4. Verify that warning message is displayed:
        // “first name must be more than 2 and less than 64 characters long
        Assert.assertTrue(firstName.isDisplayed(),"first name must be more than 2 and less than 64 characters long");
    }
    @Test
    public void testCase4() {
        //Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        //Step 3. Enter only one alphabetic character into last name input box.
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("A");
        //Step 4. Verify that warning message is displayed:
        //“The last name must be more than 2 and less than 64 characters long
        Assert.assertTrue(lastName.isDisplayed(),"The last name must be more than 2 and less than 64 characters long");
        /*WebElement warning = driver.findElement(By.tagName("small"));
        String msg = warning.getText();
        Assert.assertEquals(msg,"The last name must be more than 2 and less than 64 characters long");

         */

    }
    @Test
    public void testCase4afromOmer() {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("a");
        WebElement warning = driver.findElement(By.tagName("small"));
        String msg = warning.getText();
        Assert.assertEquals(msg,"The last name must be more than 2 and less than 64 characters long");

    }

    @Test
    public void testCase5() {
        //Step 1. Go to “https://practicecybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

        //Step 3. Enter any valid first name.
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        firstName.sendKeys("Vincenzo");

        //Step 4. Enter any valid last name.
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Albero");

        //Step 5. Enter any valid user name.
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("AlberoVinc");
        //enter an email
        WebElement eMail = driver.findElement(By.name("email"));
        eMail.sendKeys("alberobello@gmail.com");

        //Step 6. Enter any valid password.
        WebElement passWD = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input"));
        passWD.sendKeys("ASERT12!!!###");

        //Step 7. Enter any valid phone number.
        WebElement phoneN = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input"));
        phoneN.sendKeys("571-000-0000");

        //Step 8. Select gender.
        WebElement gendeR = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[1]/label/input"));
        gendeR.click();


        //Step 9. Enter any valid date of birth.
        WebElement birthDay = driver.findElement(By.name("birthday"));
        birthDay.sendKeys("11/11/1976");

        //Step 10. Select any department.

        /*WebElement selectDepartment = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select"));
        //2.create select object by passing that element as a constractor
        Select deptDropdown = new Select(selectDepartment);

        String expectedDept = "Select your Department/Office";
        String actualSelection = deptDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,actualSelection,"verify first selection");

         */

        WebElement dropdownElement = driver.findElement(By.xpath("(//select)[1]"));
        Select departmentDropdown = new Select(dropdownElement);
        List<WebElement> options = departmentDropdown.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        departmentDropdown.selectByVisibleText("Department of Engineering");



        //WebElement selectDepartment = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        //selectDepartment.click();

        //Step 11. Enter any job title.

        //Step 11. Enter any job title.
        WebElement dropdownElement1 = driver.findElement(By.xpath("(//select)[2]"));
        Select jobDropdown = new Select(dropdownElement1);
        List<WebElement> options1 = jobDropdown.getOptions();
        for (WebElement option : options1) {
            System.out.println(option.getText());
        }
        jobDropdown.selectByVisibleText("Scrum Master");

        //Step 12. Select java as a programming language.
        WebElement buttonJava1 = driver.findElement(By.id("inlineCheckbox2"));
        buttonJava1.click();
        System.out.println("buttonJava.isSelected() = " + buttonJava1.isSelected());

        //Step 13. Click Sign up.
        WebElement signUpForm = driver.findElement(By.id("wooden_spoon"));
        signUpForm.click();

        //Step 14. Verify that following success message is displayed: “You've successfully completed registration!

        //Assert.assertTrue(signUpForm.isDisplayed(),"You've successfully completed registration!");

        String expectedOption = "You've successfully completed registration!";
        String actualSelection = signUpForm.getText();
        Assert.assertEquals(actualSelection,expectedOption,"You've successfully completed registration!");

    }

}