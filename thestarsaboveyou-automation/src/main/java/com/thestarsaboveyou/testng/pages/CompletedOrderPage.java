package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CompletedOrderPage extends Base {

    private static final By COMPLETED_ORDER_MESSAGE = By.xpath("//h1[contains(@class, 'title-in-content')]");

    /**
     * Verifies that the completed order message appears
     */
    public static void verifyCompletedOrder(){
        WebElement completeOrderMessage = getWebelement(COMPLETED_ORDER_MESSAGE);
        Assert.assertNotNull(completeOrderMessage);
    }
}
