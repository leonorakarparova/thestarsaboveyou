package com.thestarsaboveyou.pages;

import com.thestarsaboveyou.core.Base;
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
