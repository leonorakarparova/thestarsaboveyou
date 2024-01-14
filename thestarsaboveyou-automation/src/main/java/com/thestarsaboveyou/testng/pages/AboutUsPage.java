package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AboutUsPage extends Base {
    private static final By ABOUT_US_PAGE_CONTENT = By.xpath("//div[contains(@class, 'col-md-8')]");

    /**
     * Asserts that the About us content is present
     */
    public static void verifyAboutUsPageContent(){
        WebElement contentPage = getWebelement(ABOUT_US_PAGE_CONTENT);
        Assert.assertNotNull(contentPage, "Unable to find page content." );
    }
}
