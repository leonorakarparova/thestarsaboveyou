package com.thestarsaboveyou.testng.pages;

import com.thestarsaboveyou.testng.core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContactsPage extends Base {

    private static final By CONTACTS_ARTICAL_AREA = By.cssSelector("article#post-88");

    /**
     * Asserts that the Contacts article area is present
     */
    public static void verifyContactsArticleArea(){
        WebElement contactsArticalArea = getWebelement(CONTACTS_ARTICAL_AREA);
        Assert.assertNotNull(contactsArticalArea, "Unable to find article area.");
    }
}
