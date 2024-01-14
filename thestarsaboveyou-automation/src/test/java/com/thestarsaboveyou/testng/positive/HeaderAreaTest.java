package com.thestarsaboveyou.testng.positive;

import com.thestarsaboveyou.testng.core.BaseTest;
import com.thestarsaboveyou.testng.pages.AboutUsPage;
import com.thestarsaboveyou.testng.pages.HeaderArea;
import com.thestarsaboveyou.testng.pages.HomePage;
import com.thestarsaboveyou.testng.pages.PDPPage;
import org.testng.annotations.Test;

public class HeaderAreaTest extends BaseTest {

    @Test
    public void testClickHeaderAreaOrderButton(){
        HomePage.open();
        HeaderArea.clickHeaderAreaOrderButton();
        PDPPage.verifyProductTitle();
    }

    @Test
    public void testClickAboutUsButton(){
        HomePage.open();
        HeaderArea.clickAboutUsButton();
        AboutUsPage.verifyAboutUsPageContent();
    }

}
