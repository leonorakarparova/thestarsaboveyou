package com.thestarsaboveyou.testng.negative;

import com.thestarsaboveyou.testng.core.BaseTest;
import com.thestarsaboveyou.testng.pages.BasketPage;
import com.thestarsaboveyou.testng.pages.Cookies;
import com.thestarsaboveyou.testng.pages.HomePage;
import com.thestarsaboveyou.testng.pages.PDPPage;
import org.testng.annotations.Test;

public class PDPPageNegTest extends BaseTest {

    @Test
    public void testAddToBasketWithEmptyLocationField(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.selectType("30x40");
        PDPPage.enterDate("12.03.2019");
        PDPPage.enterTime("18:10");
        PDPPage.enterLocation(" ");
        PDPPage.enterText("Life is journey");
        PDPPage.selectDesign(1);
        PDPPage.selectFont(1);
        Cookies.acceptCookiesIfPresent();
        PDPPage.clickAddToBasketButton();
        BasketPage.verifyEmptyLocationErrorMessage();
    }

    @Test
    public void testAddToBasketWithoutSelectedType(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.enterDate("12.03.2019");
        PDPPage.enterTime("18:10");
        PDPPage.enterLocation("Sofia");
        PDPPage.enterText("Life is journey");
        PDPPage.selectDesign(1);
        PDPPage.selectFont(1);
        Cookies.acceptCookiesIfPresent();
        PDPPage.clickAddToBasketButton();
        PDPPage.verifyAlertBox();
    }
}
