package com.thestarsaboveyou.testng.core;

import com.thestarsaboveyou.testng.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Base {

    /**
     * Gets web element based on provided locator
     * @param locator the locator to the element
     * @return the web element
     */
    protected static WebElement getWebelement(By locator){
        return Browser.driver.findElement(locator);
    }

    /**
     * Clicks on an element based on a provided locator
     * @param locator the locator to the element you want to click on
     */
    protected static void click(By locator){
        getWebelement(locator).click();
    }

    /**
     * Types a text into an element located by some locator
     * @param locator the locator to the element you want to type in
     * @param text the text you want to type in that element
     */
    protected static void type(By locator, String text){
        getWebelement(locator).sendKeys(text);
    }

    /**
     * Gets the text of an element based on a provided locator
     * @param locator the locator to the element that contains text you want to get
     * @return the text that is contained within the element, based on the locator
     */
    protected static String getText(By locator){
       return getWebelement(locator).getText();
    }

}
