package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import com.thestarsaboveyou.testng.utils.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PDPPage extends Base {

    private static final By PRODUCT_TITLE = By.cssSelector(".product_title");
    private static final By TYPE = By.id("pa_size-and-frame");
    private static final By DATE = By.name("_map_date");
    private static final By TIME = By.name("_map_time");
    private static final By LOCATION = By.name("_map_place");
    private static final By TEXT = By.name("_map_text");
    private static final By DESIGN = By.name("_map_background");
    private static final By FONT = By.name("_map_font");
    private static final By ADD_TO_BASKET_BUTTON = By.xpath("//button[contains(@class, 'single_add_to_cart_button')]");


    /**
     * Verifies that the product title appears
     */
    public static void verifyProductTitle(){
        String actualProductTitle = getText(PRODUCT_TITLE);
        Assert.assertEquals(actualProductTitle, "Звездна Карта", "Unable to find the product title.");
    }

    /**
     * Selects a value from Type drop-down menu
     * @param typeValue the type of value that you want to choose
     */
    public static void selectType(String typeValue){
        Select type = new Select(getWebelement(TYPE));
        Assert.assertFalse(type.isMultiple());
        type.selectByValue(typeValue);
    }

    /**
     * Types a date into the date element
     * @param date the date that you want to type into date element
     */
    public static void enterDate(String date){
        type(DATE, date);
    }

    /**
     * Types a time into the time element
     * @param time the time that you want to type into time element
     */
    public static void enterTime(String time){
        type(TIME, time);
    }
    /**
     * Types a location into the location element
     * @param location the location that you want to type into location element
     */
    public static void enterLocation(String location){
        type(LOCATION, location);
    }

    /**
     * Types a text into the text element
     * @param text the date that you want to type into text element
     */
    public static void enterText(String text){
        type(TEXT, text);
    }

    /**
     * Selects a value by index for Design drop-down menu
     * @param indexDesign the index value that you want to choose for Design
     */
    public static void selectDesign(int indexDesign){
        Select design = new Select(getWebelement(DESIGN));
        Assert.assertFalse(design.isMultiple());
        design.selectByIndex(indexDesign);
    }

    /**
     * Selects a value by index for Font drop-down menu
     * @param indexFont the index value that you want to choose for Font
     */
    public static void selectFont(int indexFont){
        Select font = new Select(getWebelement(FONT));
        Assert.assertFalse(font.isMultiple());
        font.selectByIndex(indexFont);
    }

    /**
     * Clicks to "Add to basket" button
     */
    public static void clickAddToBasketButton(){
        click(ADD_TO_BASKET_BUTTON);
    }

    /**
     * Verifies that the alert box is present
     */
    public static void verifyAlertBox(){
        Alert alert = Browser.driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Първо изберете опции на продукта преди да го добавите в количката.", "Expected alert message didn't appear.");
    }
}
