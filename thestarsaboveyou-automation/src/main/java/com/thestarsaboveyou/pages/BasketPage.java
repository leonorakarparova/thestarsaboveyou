package com.thestarsaboveyou.pages;

import com.thestarsaboveyou.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasketPage extends Base {

    private static final By ADDED_TO_BASKET_MESSAGE = By.cssSelector(".woocommerce-message");
    private static final By ORDER_COMPLETION_BUTTON = By.xpath("//a[contains(@class, 'checkout-button')]");
    private static final By EMPTY_LOCATION_ERROR_MESSAGE = By.xpath("//div/ul[@class='woocommerce-error']/li");


    /**
     * Verifies that successful message from Basket page appears
     */
    public static void verifyAddedToBasketMessage() {
        WebElement addedToBasketMessage = getWebelement(ADDED_TO_BASKET_MESSAGE);
        Assert.assertNotNull(addedToBasketMessage, "Successful message did not appear.");
    }
    /**
     * Clicks to Order completion button
     */
    public static void clickOrderCompletionButton(){
        click(ORDER_COMPLETION_BUTTON);
    }

    /**
     * Verifies that error message for empty location field appears
     */
    public static void verifyEmptyLocationErrorMessage(){
        WebElement emptyLocationErrorMessage = getWebelement(EMPTY_LOCATION_ERROR_MESSAGE);
        Assert.assertNotNull(emptyLocationErrorMessage, "Terms error message did not appear.");
    }
}
