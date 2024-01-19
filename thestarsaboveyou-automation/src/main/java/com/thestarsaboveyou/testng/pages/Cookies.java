package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cookies extends Base {

    private static final By COOKIES_ACCEPT = By.cssSelector("a#cn-accept-cookie");

    /**
     * Accepts the cookies
     */
    public static void acceptCookiesIfPresent(){
        List<WebElement> webElements = getWebelements(COOKIES_ACCEPT);
        if(!webElements.isEmpty()) {
            click(COOKIES_ACCEPT);
        }
    }
}
