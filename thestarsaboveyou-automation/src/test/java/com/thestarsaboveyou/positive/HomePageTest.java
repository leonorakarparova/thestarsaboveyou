package com.thestarsaboveyou.positive;

import com.thestarsaboveyou.core.Base;
import com.thestarsaboveyou.core.BaseTest;
import com.thestarsaboveyou.pages.HomePage;
import com.thestarsaboveyou.pages.PDPPage;
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
