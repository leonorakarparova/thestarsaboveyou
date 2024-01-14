package com.thestarsaboveyou.testng.positive;

import com.thestarsaboveyou.testng.core.BaseTest;
import com.thestarsaboveyou.testng.pages.HomePage;
import com.thestarsaboveyou.testng.pages.PDPPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void testHeader1(){
        HomePage.open();
        HomePage.verifyHeader();
    }

    @Test
    public void testClickOrderButton(){
        HomePage.open();
        HomePage.clickToOrderButton();
        PDPPage.verifyProductTitle();
    }


}
