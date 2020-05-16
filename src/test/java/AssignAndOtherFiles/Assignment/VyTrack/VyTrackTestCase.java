package AssignAndOtherFiles.Assignment.VyTrack;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class VyTrackTestCase {


        WebDriver driver;
        @BeforeMethod
        public void setUpMethod() throws InterruptedException {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }
        @AfterMethod
        public void AfterMethod(){
            // driver.quit();
        }
        @Test
        public  void fleetest() throws InterruptedException {
            driver.get("https://vytrack.com/");
            Thread.sleep(3000);
            WebElement loginBox = driver.findElement(By.id("menu-item-514"));
            loginBox.click();
            WebElement userName =driver.findElement(By.id("prependedInput"));
            userName.sendKeys("user15");
            WebElement passWord =driver.findElement(By.id("prependedInput2"));
            passWord.sendKeys("UserUser123");
            WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
            login.click();

            WebElement fleet =driver.findElement(By.linkText("Fleet"));
            Actions actions = new Actions(driver);
            actions.moveToElement(fleet).perform();
            Thread.sleep(3000);
            WebElement VehicleFuelLogs =driver.findElement(By.linkText("Vehicles Fuel Logs"));
            Actions actions1 = new Actions(driver);
            actions1.moveToElement(VehicleFuelLogs).click().perform();
            Thread.sleep(8000);
            WebElement createVehicleFuelLogs =driver.findElement(By.xpath("  //a[@title='Create Vehicle Fuel Logs'] "));
            Thread.sleep(6000);
            createVehicleFuelLogs.click();
            //using java faker to fill the form
            WebElement OdometerValue = driver.findElement(By.name("custom_entity_type[OdometerValue]"));
            Faker faker = new Faker();
            String OdometerV =String.valueOf(faker.number().numberBetween(532,1300));
            OdometerValue.sendKeys(OdometerV);
            //fill the Liter box
            WebElement  LiterBox =driver.findElement(By.name("custom_entity_type[Liter]"));
            String LiterNum =String.valueOf(faker.number().numberBetween(100,300));
            LiterBox.sendKeys(LiterNum );
            WebElement  PricePerLiter  =driver.findElement(By.name("custom_entity_type[PricePerLiter]"));
            String Price = String.valueOf(22);
            PricePerLiter.sendKeys("22");
            WebElement TotalPrice =driver.findElement(By.name("custom_entity_type[TotalPrice]"));
            int totalPrice =Integer.parseInt(LiterNum)*22;
            String total =String.valueOf(totalPrice) ;
            TotalPrice.sendKeys(total);
            WebElement Date =driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
            Date.click();
            WebElement Today =driver.findElement(By.xpath("//button[@data-handler='today']"));
            Today.click();
            WebElement Purchaser =driver.findElement(By.name("custom_entity_type[Purchaser]"));
            String Pur = faker.name().username();
            Purchaser.sendKeys(Pur);
            WebElement invoiceReference =driver.findElement(By.name("custom_entity_type[InvoiceReference]"));
            String reference =faker.company().name();
            invoiceReference.sendKeys(reference);
            WebElement vendor = driver.findElement(By.name("custom_entity_type[Vendor]"));
            String Vendor = faker.company().name();
            vendor.sendKeys(Vendor);
            WebElement AddButton =driver.findElement(By.className("fa-plus"));
            AddButton.click();
            WebElement SellectCarreservation =driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
            SellectCarreservation.click();
            WebElement sellectButton = driver.findElement(By.xpath("//button[@data-action-name='select']"));
            sellectButton.click();
            WebElement saveAndClose =driver.findElement(By.xpath("//button[@class='btn btn-success action-button']"));
            saveAndClose.click();
        }
    }


