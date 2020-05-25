package com.cybertek.tests.day15_staletest;

import com.cybertek.tests.TestBase;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestExecutionTime extends TestBase {
    // this test is prepared for measuring execution time of code
    @Test
    public void ExeTest1() {
        driver.get("https://le.ac.uk/");
        WebElement searchSite = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/div[2]/button"));
        searchSite.sendKeys("ciao");


        StopWatch watch = new StopWatch();
        watch.start();
        for(int i=0; i< 1000000; i++){
            Object obj = new Object();
        }
        watch.stop();
        System.out.println("Total execution time to create 1000K objects in Java using StopWatch in millis: "
                + watch.getTime());
    }
    @Test
    public void exeTest2() {
        long start1 = System.nanoTime();
// maybe add here a call to a return to remove call up time, too.
// Avoid optimization
        long start2 = System.nanoTime();

        long stop = System.nanoTime();
        long diff = stop - 2*start2 + start1;

        System.out.println(diff + " ns");
    }
    @Test
    public void exeTest3() {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        driver.get("https://le.ac.uk/");
        WebElement searchSite = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div[2]/div[2]/button"));
        searchSite.sendKeys("ciao");

        stopwatch.stop();
        long timeTaken = stopwatch.getTime();
        System.out.println("Total execution time is ="+timeTaken);
    }
}


