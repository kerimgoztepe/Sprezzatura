package com.cybertek.tests.day14_properties_driverTest;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test

    public void Test1(){

        String browser = ConfigurationReader.get("browser");
        System.out.println("browser ="+browser);

        //for every test we have to write browser. by this code we can update our browser
        WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.get("browser"));
        System.out.println(ConfigurationReader.get("driver_username"));



    }
}
