package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;

public class Footer extends Base {

    private static final By CONTACTS = By.cssSelector("li#menu-item-90");
    private static final By DELIVERY = By.cssSelector("li#menu-item-86");
    private static final By GENERAL_TERMS = By.cssSelector("li#menu-item-143");

    /**
     * Clicks on Contacts button
     */
    public static void clickContacts(){
        click(CONTACTS);
    }
    /**
     * Clicks on the Delivery button
     */
    public static void clickDelivery(){
        click(DELIVERY);
    }

    /**
     * Clicks on the General terms button
     */
    public static void clickGeneralTerms(){
        click(GENERAL_TERMS);
    }


}
