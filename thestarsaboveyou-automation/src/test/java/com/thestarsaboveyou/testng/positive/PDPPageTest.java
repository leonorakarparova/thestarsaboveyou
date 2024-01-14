package com.thestarsaboveyou.testng.positive;

import com.thestarsaboveyou.testng.core.BaseTest;
import com.thestarsaboveyou.testng.pages.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PDPPageTest extends BaseTest {

    @DataProvider(name = "valuesProvider")
    public static Object[][] testData() {
        Object[][] testData = {
                {"online-home", "12.05.2001", "12:45", "Varna", "Stars above us", 2, 1},
                {"20x30", "10.03.2016", "13:10", "Sofia", "Always remember", 0, 0},
                {"20x30-with-frame", "16.08.2004", "15:50", "Ruse", "Sky", 1, 1},
                {"30x40", "30.03.2018", "16:50", "Plovdiv", "Forever", 1, 1},
                {"30x40-with-frame", "14.04.2008", "15:00" , "Burgas", "Happy birthday", 0, 0},
                {"50x70", "19.07.2020", "20:00", "Plovdiv", "Happy anniversary,", 2, 0}
        };
        return testData;
    }

    @Test(dataProvider = "valuesProvider")
    public void testAddToBasket(String type, String date, String time, String location, String text, int indexDesign, int indexFont){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
        PDPPage.selectType(type);
        PDPPage.enterDate(date);
        PDPPage.enterLocation(location);
        PDPPage.enterTime(time);
        PDPPage.enterText(text);
        PDPPage.selectDesign(indexDesign);
        PDPPage.selectFont(indexFont);
        Cookies.acceptCookies();
        PDPPage.clickAddToBasketButton();
        BasketPage.verifyAddedToBasketMessage();
        BasketPage.clickOrderCompletionButton();
        OrderPage.verifyOrderHeader();
    }
}
