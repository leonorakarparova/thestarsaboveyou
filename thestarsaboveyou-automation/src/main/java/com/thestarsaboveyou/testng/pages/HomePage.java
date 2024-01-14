package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import com.thestarsaboveyou.testng.utils.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Base {

    private static final By HEADER1 = By.xpath("//h1");
    private static final By ORDER_BUTTON = By.xpath("//a[contains(@class, 'btn-primary')]");

    /**
     * Opens the home page of thestarsaboveyou.com
     */
    public static void open(){
        Browser.driver.get("https://thestarsaboveyou.com/");
    }

    /**
     * Asserts that the header "THE STARS ABOVE YOU" is present
     */
    public static void verifyHeader(){
        String thestarsaboveyouHeader = getText(HEADER1);
        Assert.assertEquals(thestarsaboveyouHeader, "THE STARS ABOVE YOU", "Unable to find the header text.");
    }

    /**
     * Clicks on the order button
     */
    public static void clickToOrderButton(){
        click(ORDER_BUTTON);
    }
}
