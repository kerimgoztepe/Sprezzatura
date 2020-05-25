package com.cybertek.tests.day15_staletest;

import com.cybertek.tests.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FillForm extends TestBase {
    @Test
    public void fillAform() {


    Faker faker = new Faker();
                //String name = faker.name().fullName(); // Mr. Joey
                String firstName = faker.name().firstName(); // Ross
                String lastName = faker.name().lastName(); // Geller
                String emaiL = faker.internet().emailAddress();
                String userName = faker.name().username();
                String passWD = faker.internet().password();


                driver.get("http://practice.cybertekschool.com/registration_form");

                WebElement firstNameInput = driver.findElement(By.name("firstname"));

                firstNameInput.sendKeys(firstName);

                WebElement lastNameInput = driver.findElement(By.name("lastname"));

                lastNameInput.sendKeys(lastName);

                 WebElement phoneNumber = driver.findElement(By.name("phone"));

                phoneNumber.sendKeys(faker.phoneNumber().cellPhone());



            }
    }


