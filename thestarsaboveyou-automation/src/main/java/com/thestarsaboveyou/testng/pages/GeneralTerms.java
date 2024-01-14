package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GeneralTerms extends Base {
    private static final By GENERAL_TERMS_ARTICLE_AREA = By.cssSelector("article#post-3");

    /**
     * Asserts that the General terms article area is present
     */
    public static void verifyGeneralTermsArticleArea(){
        WebElement generalTermsArticleArea = getWebelement(GENERAL_TERMS_ARTICLE_AREA);
        Assert.assertNotNull(generalTermsArticleArea, "Unable to find article area.");
    }
}
