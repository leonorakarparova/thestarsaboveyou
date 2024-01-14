package com.thestarsaboveyou.positive;

import com.thestarsaboveyou.core.BaseTest;
import com.thestarsaboveyou.pages.*;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {

    @Test
    public void testClickContactsButton(){
        HomePage.open();
        Cookies.acceptCookies();
        Footer.clickContacts();
        ContactsPage.verifyContactsArticleArea();
    }

    @Test
    public void testClickDeliveryButton(){
        HomePage.open();
        Cookies.acceptCookies();
        Footer.clickDelivery();
        DeliveryPage.verifyDeliveryArticleArea();
    }

    @Test
    public void testClickGeneralTermsButton(){
        HomePage.open();
        Cookies.acceptCookies();
        Footer.clickGeneralTerms();
        GeneralTerms.verifyGeneralTermsArticleArea();
    }
}
