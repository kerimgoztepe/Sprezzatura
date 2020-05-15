package com.cybertek.tests.MyTests;

import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectMethod extends TestBase {


        @Test
        public static void captureScreenMethod() throws Exception{
            //System.setProperty("webdriver.chrome.driver","D://Selenium Environment//Drivers//chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            //driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
            //driver.navigate().refresh();

            //Once you got the select object initialised then you can access all the methods of select class.
            //Identify the select HTML element:
            Thread.sleep(10000);

            //WebElement mySelectElement = driver.findElement(By.name("multipleselect[]"));
            List<WebElement> elements = driver.findElements(By.name("multipleselect[]"));
            System.out.println(elements.size());

            //Select dropdown= new Select(mySelectElement);
            //WebElement option = dropdown.getFirstSelectedOption();
            //System.out.println(option.getText()); //output "Selenium"
        }
        @Test
        public void TestCase2() {


                driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                WebElement select1 = driver.findElement(By.xpath("//option[@value='Volvo']"));
                WebElement select2 = driver.findElement(By.xpath("//option[@value='Saab']"));

                Actions action = new Actions(driver);
                action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();

            }

        }


