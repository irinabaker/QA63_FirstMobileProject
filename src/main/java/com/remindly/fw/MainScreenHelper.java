package com.remindly.fw;

import com.remindly.core.BaseHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper {

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
        return isTextPresent(By.id("recycle_title"));
    }

    public String isReminderDateTimePresent() {
        return isTextPresent(By.id("recycle_date_time"));
    }

    public String isTypeOfRepetitionPresent() {
        return isTextPresent(By.id("recycle_repeat_info"));
    }
}
