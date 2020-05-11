package AirBnbTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.airbnb.com.au/?_set_bev_on_new_domain=1587809949_LfQPRuTXhc7qiy5o");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void firstAssign() throws InterruptedException {
        Actions act = new Actions(driver);
        WebElement elo =driver.findElement(By.xpath("//input[@id='bigsearch-query-attached-query']"));
        act.keyDown(elo, Keys.SHIFT).sendKeys(elo,"new z").keyUp(elo, Keys.SHIFT).perform();
        Thread.sleep(2000);


        for(int i =0; i<5; i++){
            elo.sendKeys(Keys.ARROW_DOWN);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            String script = elo.getText();
            String a = (String) jse.executeScript("return arguments[0].value;", elo);
            System.out.println(a);
            if(a.contains("Zarqa")){
                elo.sendKeys(Keys.ENTER);
                break;
            }
        }
        String[]date = {"September","9","10"};
        while(!driver.findElement(By.cssSelector("._1foj6yps")).getText().contains(date[0])){
            driver.findElement(By.cssSelector("._13tn83am")).click();
        }

        List<WebElement> days = driver.findElements(By.xpath("//td[@aria-label]"));

        int size = days.size();
        for (int i = 0; i < size; i++) {
            String a = days.get(i).getText();
            System.out.println(a);
            if (a.equals(date[1])) {
                days.get(i).click();
                break;
            }
        }
        List<WebElement> fun97 = driver.findElements(By.className("_12fun97"));
        for(WebElement a: fun97){
            if(a.getText().equals(date[2])){
                a.click();
                break;
            }
        }
    }

    }

