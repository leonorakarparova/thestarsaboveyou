package com.thestarsaboveyou.positive;

import com.thestarsaboveyou.core.BaseTest;
import com.thestarsaboveyou.pages.AboutUsPage;
import com.thestarsaboveyou.pages.HeaderArea;
import com.thestarsaboveyou.pages.HomePage;
import com.thestarsaboveyou.pages.PDPPage;
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
