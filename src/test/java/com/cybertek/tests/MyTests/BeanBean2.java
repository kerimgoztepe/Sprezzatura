/*package com.cybertek.tests.MyTests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BeanBean2 {

    @Test
    public void calculate1() {
​
        Driver.get();
        int turns = 700;
        WebDriver driver;
        driver.findElement(By.id("imgDifficulty2")).click();
        driver.findElement(By.id("imgDifficulty2")).click();
​
        for (int j = 0; j < turns; j++) {

            int x = Integer.parseInt(driver.findElement(By.id("pFirstNumber")).getText());
            int y = Integer.parseInt(driver.findElement(By.id("pSecondNumber")).getText());
            int answer = x * y;
            String answerS = String.valueOf(answer);
            WebElement currentElement = driver.switchTo().activeElement();
            currentElement.sendKeys(answerS + Keys.ENTER + Keys.ENTER);
        }
    }
}

 */