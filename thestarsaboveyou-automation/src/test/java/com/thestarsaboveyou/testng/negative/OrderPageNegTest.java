package com.thestarsaboveyou.testng.negative;

import com.thestarsaboveyou.testng.core.BaseTest;
import com.thestarsaboveyou.testng.pages.*;
import org.testng.annotations.Test;

public class OrderPageNegTest extends BaseTest {

    @Test
    public void testNotAcceptedTerms(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.selectType("20x30");
        PDPPage.enterDate("15.03.2020");
        PDPPage.enterTime("13:40");
        PDPPage.enterLocation("Burgas");
        PDPPage.enterText("The stars above us");
        PDPPage.selectDesign(0);
        PDPPage.selectFont(1);
        Cookies.acceptCookiesIfPresent();
        PDPPage.clickAddToBasketButton();
        BasketPage.verifyAddedToBasketMessage();
        BasketPage.clickOrderCompletionButton();
        OrderPage.verifyOrderHeader();
        OrderPage.enterFirstName("Stoyan");
        OrderPage.enterLastName("Ivanchev");
        OrderPage.enterAddress("Simeonovo");
        OrderPage.enterCity("Sofia");
        OrderPage.enterPhoneNumber("987456321");
        OrderPage.enterEmail("stoyan456@gmail.com");
        OrderPage.clickDeliveryPayment();
        OrderPage.clickPlaceOrderButtonWithoutWait();
        OrderPage.verifyTermsErrorMessage();
    }

    @Test
    public void testInvalidEmail(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.selectType("20x30");
        PDPPage.enterDate("26.02.2013");
        PDPPage.enterTime("21:00");
        PDPPage.enterLocation("Sliven");
        PDPPage.enterText("Night sky");
        PDPPage.selectDesign(0);
        PDPPage.selectFont(0);
        Cookies.acceptCookiesIfPresent();
        PDPPage.clickAddToBasketButton();
        BasketPage.verifyAddedToBasketMessage();
        BasketPage.clickOrderCompletionButton();
        OrderPage.verifyOrderHeader();
        OrderPage.enterFirstName("Teodora");
        OrderPage.enterLastName("Stoyanova");
        OrderPage.enterAddress("Malinova dolina");
        OrderPage.enterCity("Sofia");
        OrderPage.enterPhoneNumber("56468874");
        OrderPage.enterEmail("teodora.stoyanovagmail.com");
        OrderPage.clickDeliveryPayment();
        OrderPage.acceptTerms();
        OrderPage.clickPlaceOrderButtonWithoutWait();
        OrderPage.verifyInvalidEmailErrorMessage();
    }

    @Test
    public void testInvalidPhoneNumber(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.selectType("30x40");
        PDPPage.enterDate("16.02.2024");
        PDPPage.enterTime("23:00");
        PDPPage.enterLocation("Varna");
        PDPPage.enterText("Sky");
        PDPPage.selectDesign(1);
        PDPPage.selectFont(1);
        Cookies.acceptCookiesIfPresent();
        PDPPage.clickAddToBasketButton();
        BasketPage.verifyAddedToBasketMessage();
        BasketPage.clickOrderCompletionButton();
        OrderPage.verifyOrderHeader();
        OrderPage.enterFirstName("Ivelina");
        OrderPage.enterLastName("Pencheva");
        OrderPage.enterAddress("Simeonovo");
        OrderPage.enterCity("Sofia");
        OrderPage.enterPhoneNumber("ffffffffffff");
        OrderPage.enterEmail("ivelina5555pencheva@gmail.com");
        OrderPage.clickDeliveryPayment();
        OrderPage.acceptTerms();
        OrderPage.clickPlaceOrderButtonWithoutWait();
        OrderPage.verifyInvalidPhoneNumberErrorMessage();
    }
}
