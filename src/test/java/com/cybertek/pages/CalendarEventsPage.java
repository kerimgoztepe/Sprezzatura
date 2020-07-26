package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(css = "div[href='#']")
    public WebElement options;

    @FindBy(css = "#grid-calendar-event-grid-1541138987 > div.oro-datagrid > div:nth-child(1) > div > div.pagination.pagination-centered > ul > li:nth-child(2) > input")
    public WebElement pageNumber;


}