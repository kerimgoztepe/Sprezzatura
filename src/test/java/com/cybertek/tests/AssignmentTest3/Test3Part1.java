/*
package com.cybertek.tests.AssignmentTest3;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3Part1 extends TestBase {

    @Test
    public void test1() {

        extentLogger = report.createTest("test case 1: is options there");
        /*
         * Test case #1
         * 1.Go to “https://qa1.vytrack.com/"
         * 2.Login as a store manager
         * 3.Navigate to “Activities -> Calendar Events”
         * 4.Verify that page subtitle "Options" is displayed

        new LoginPage().loginAsStoreManager();
        extentLogger.info("logged in");
        new DashboardPage().navigateToModule("Activities", "Calendar Events");

        extentLogger.info("navigated to Calendar events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        String expextedTitle = "Options";
        String actualTitle = calendarEventsPage.options.getText();

        Assert.assertTrue(calendarEventsPage.options.isDisplayed());


        //Assert.assertTrue(calendarEventsPage.getPageSubTitle().contains("options"));
        //Assert.assertTrue(calendarEventsPage"is options there");
        //extentLogger.pass("options menu is visible");




    }

    @Test
    public void test2() {
        extentLogger = report.createTest("TC2: page number is equal to 1");
        /*
        Test case #2
        1.Go to “https://qa1.vytrack.com/"
        2.Login as a store manager
        3.Navigate to “Activities -> Calendar Events”
        4.Verify that page number is equals to "1"


        //1.Go to “https://qa1.vytrack.com/"

​        new LoginPage().loginAsStoreManager();
        //get report
        extentLogger.info("logged in");

        //navigate to Activities-calendar events page
        new DashboardPage().navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigated to Events page");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        String actualSelectedPage = calendarEventsPage.pageNumber.getAttribute("value");
        Assert.assertEquals(actualSelectedPage,"1","selectedpage is 1");
        //Assert.assertEquals(actualSelectedPage, "1", "is selected page 1");
        extentLogger.pass("selected page is 1");
​​
    }

}
*/
