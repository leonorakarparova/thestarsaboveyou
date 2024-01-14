package com.thestarsaboveyou.pages;

import com.thestarsaboveyou.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DeliveryPage extends Base {
    private static final By DELIVERY_ARTICLE_AREA = By.cssSelector("article#post-83");

    /**
     * Asserts that the Delivery article area is present
     */
    public static void verifyDeliveryArticleArea(){
        WebElement deliveryArticleArea = getWebelement(DELIVERY_ARTICLE_AREA);
        Assert.assertNotNull(deliveryArticleArea, "Unable to find article area.");
    }
}
