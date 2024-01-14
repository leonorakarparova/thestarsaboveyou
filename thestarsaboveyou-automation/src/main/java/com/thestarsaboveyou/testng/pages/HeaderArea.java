package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;

public class HeaderArea extends Base {

    private static final By HEADER_AREA_ORDER_BUTTON = By.xpath("//li[@id=\"menu-item-71\"]");
    private static final By ABOUT_US_BUTTON = By.xpath("//li[@id=\"menu-item-65\"]");

    /**
     * Clicks on header area order button
     */
    public static void clickHeaderAreaOrderButton(){
        click(HEADER_AREA_ORDER_BUTTON);
    }

    /**
     * Clicks on About us button
     */
    public static void clickAboutUsButton(){
        click(ABOUT_US_BUTTON);
    }

}
