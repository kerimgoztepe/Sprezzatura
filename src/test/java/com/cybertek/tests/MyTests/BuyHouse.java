package com.cybertek.tests.MyTests;

import com.cybertek.tests.TestBase;
import org.testng.annotations.Test;

public class BuyHouse extends TestBase {
    @Test
    public void test1() {
        driver.get("https://www.rightmove.co.uk/property-for-sale.html");
    }


}
