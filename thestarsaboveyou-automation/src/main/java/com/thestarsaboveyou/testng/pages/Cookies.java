package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;

public class Cookies extends Base {

    private static final By COOKIES_ACCEPT = By.cssSelector("a#cn-accept-cookie");

    /**
     * Accepts the cookies
     */
    public static void acceptCookies(){
        click(COOKIES_ACCEPT);
    }
}
