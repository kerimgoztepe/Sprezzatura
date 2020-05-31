/*package com.cybertek.tests.MyTests;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BeanBeanTest extends TestBase {

    @Test
    public void calculate1() throws InterruptedException {
        //Driver.get();
        WebDriver driver = new ChromeDriver();
        int turns21 = 5;
        for (int j = 0; j < turns21; j++) {
​            for (int i = 0; i < 21; i++) {
​                int x = Integer.parseInt(driver.findElement(By.id("pFirstNumber")).getText());
                int y = Integer.parseInt(driver.findElement(By.id("pSecondNumber")).getText());
                int answer = x * y;
                String answerS = String.valueOf(answer);
                WebElement currentElement = driver.switchTo().activeElement();
                currentElement.sendKeys(answerS + Keys.ENTER);
​            }
            WebElement currentElement = driver.switchTo().activeElement();
            currentElement.sendKeys(Keys.ENTER);
        }
    }
}​

 */


