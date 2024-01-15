package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import com.thestarsaboveyou.testng.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class OrderPage extends Base {

    private static final By ORDER_HEADER = By.xpath("//div/h1[contains(@class, 'hestia-title')]");
    private static final By FIRST_NAME = By.id("billing_first_name");
    private static final By LAST_NAME = By.id("billing_last_name");
    private static final By ADDRESS = By.id("billing_address_1");
    private static final By CITY = By.id("billing_city");
    private static final By PHONE_NUMBER = By.id("billing_phone");
    private static final By EMAIL = By.id("billing_email");
    private static final By DELIVERY_PAYMENT = By.id("payment_method_cod");
    private static final By TERMS = By.id("terms");
    private static final By PLACE_ORDER_BUTTON = By.id("place_order");
    private static final By TERMS_ERROR_MESSAGE = By.xpath("//div/ul[@class='woocommerce-error']/li");
    private static final By INVALID_EMAIL_ERROR_MESSAGE = By.xpath("//div/ul[@class='woocommerce-error']/li");
    private static final By INVALID_PHONE_NUMBER_MESSAGE = By.xpath("//div/ul[@class='woocommerce-error']/li");


    /**
     * Asserts that the order header is present
     */
    public static void verifyOrderHeader(){
        String orderHeader = getText(ORDER_HEADER);
        Assert.assertEquals(orderHeader, "Поръчка", "Unable to find the order header.");
    }


    /**
     * Types a First name into the name element
     * @param firstName the first name that you want to type
     */
    public static void enterFirstName(String firstName){
        type(FIRST_NAME,firstName);
    }

    /**
     * Types a Last name into the name element
     * @param lastName the last name that you want to type
     */
    public static void enterLastName(String lastName){
        type(LAST_NAME, lastName);
    }

    /**
     * Types an address into the address element
     * @param address the address that you want to type
     */
    public static void enterAddress(String address){
        type(ADDRESS, address);
    }

    /**
     * Types a city into the city element
     * @param city the city that you want to type
     */
    public static void enterCity(String city){
        type(CITY, city);
    }

    /**
     * Types a phone number into the phone element
     * @param phoneNumber the phone number that you want to type
     */
    public static void enterPhoneNumber(String phoneNumber){
        type(PHONE_NUMBER, phoneNumber);
    }

    /**
     * Types an email into the email element
     * @param email the email that you want to type
     */
    public static void enterEmail(String email){
        type(EMAIL, email);
    }

    /**
     * Selects the delivery payment method
     */
    public static void clickDeliveryPayment(){
        WebElement deliveryPayment = getWebelement(DELIVERY_PAYMENT);
        if(!deliveryPayment.isSelected()){
            deliveryPayment.click();
        }
        Assert.assertTrue(deliveryPayment.isSelected());
    }

    /**
     * Accepts the therms and conditions
     */
    public static void acceptTerms(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement terms = getWebelement(TERMS);
        if(!terms.isSelected()){
            terms.click();
        }
        Assert.assertTrue(terms.isSelected());
    }

    /**
     * Clicks the order button to finish the order with explicit wait
     */
    public static void clickPlaceOrderButtonWithWait(){
        Wait<WebDriver> wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.stalenessOf(getWebelement(PLACE_ORDER_BUTTON)));
        WebElement placeOrderButton = getWebelement(PLACE_ORDER_BUTTON);
        placeOrderButton.click();
    }

    /**
     * Clicks the order button to finish the order without wait
     */
    public static void clickPlaceOrderButtonWithoutWait(){
        click(PLACE_ORDER_BUTTON);
    }

    /**
     * Verifies that the accepting terms error message is present
     */
    public static void verifyTermsErrorMessage() {
        String actualTermsErrorMessage = getText(TERMS_ERROR_MESSAGE);
        Assert.assertEquals(actualTermsErrorMessage, "Прочетете и приемете общите условия, за да продължите с поръчката.", "Expected error message didn't appear.");
    }

    /**
     * Verifies that the invalid email error message is present
     */
    public static void verifyInvalidEmailErrorMessage(){
        String actualInvalidEmailErrorMessage = getText(INVALID_EMAIL_ERROR_MESSAGE);
        Assert.assertEquals(actualInvalidEmailErrorMessage,"Невалиден имейл адрес за таксуване", "Expected error message didn't appear.");
    }

    /**
     * Verifies that the invalid phone number error message is present
     */
    public static void verifyInvalidPhoneNumberErrorMessage(){
        String actualInvalidPhoneNumberErrorMessage = getText(INVALID_PHONE_NUMBER_MESSAGE);
        Assert.assertEquals(actualInvalidPhoneNumberErrorMessage, "Phone за фактуриране не е валиден телефонен номер.", "Expected error message didn't appear.");
    }

}
