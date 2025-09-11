package com.remindly.tests;

import com.remindly.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase {

    @Test
    public void addReminderTitlePositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }

    @Test
    public void addReminderDatePositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future",1,"OCT");
        app.getReminder().selectDate(30);
        app.getReminder().tapToYear();
        app.getReminder().swipeToYear("past","2022");
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderDateTimePresent().contains("31/10/2022"));
    }

    @Test
    public void addReminderTimePositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am",541,1201,541,660);
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isReminderDateTimePresent().contains("6:00"));
    }

    @Test
    public void addTypeOfRepetitionTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().swipe(0.8,0.5);
        app.getReminder().tapOnTypeOfRepetitionField();
        app.getReminder().selectTypeOfRepetition("Month");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainScreen().isTypeOfRepetitionPresent().contains("Month"));
    }

}
