package com.thestarsaboveyou.testng.positive;

import com.thestarsaboveyou.testng.core.BaseTest;
import com.thestarsaboveyou.testng.pages.*;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {

    @Test
    public void testClickContactsButton(){
        HomePage.open();
        Cookies.acceptCookiesIfPresent();
        Footer.clickContacts();
        ContactsPage.verifyContactsArticleArea();
    }

    @Test
    public void testClickDeliveryButton(){
        HomePage.open();
        Cookies.acceptCookiesIfPresent();
        Footer.clickDelivery();
        DeliveryPage.verifyDeliveryArticleArea();
    }

    @Test
    public void testClickGeneralTermsButton(){
        HomePage.open();
        Cookies.acceptCookiesIfPresent();
        Footer.clickGeneralTerms();
        GeneralTerms.verifyGeneralTermsArticleArea();
    }
}
