package com.thestarsaboveyou.positive;

import com.thestarsaboveyou.core.BaseTest;
import com.thestarsaboveyou.pages.*;
import org.testng.annotations.Test;

public class OrderPageTest extends BaseTest {

    @Test
    public void testCompleteOrder(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.selectType("20x30");
        PDPPage.enterDate("13.02.2018");
        PDPPage.enterTime("16:50");
        PDPPage.enterLocation("Varna");
        PDPPage.enterText("Stars");
        PDPPage.selectDesign(0);
        PDPPage.selectFont(1);
        Cookies.acceptCookies();
        PDPPage.clickAddToBasketButton();
        BasketPage.verifyAddedToBasketMessage();
        BasketPage.clickOrderCompletionButton();
        OrderPage.verifyOrderHeader();
        OrderPage.enterFirstName("Ivan");
        OrderPage.enterLastName("Ivanov");
        OrderPage.enterAddress("Vitosha");
        OrderPage.enterCity("Sofia");
        OrderPage.enterPhoneNumber("123456789");
        OrderPage.enterEmail("ivan.ivanov54321@gmail.com");
        OrderPage.clickDeliveryPayment();
        OrderPage.acceptTerms();
        OrderPage.clickPlaceOrderButtonWithoutWait();
        CompletedOrderPage.verifyCompletedOrder();
    }
}
