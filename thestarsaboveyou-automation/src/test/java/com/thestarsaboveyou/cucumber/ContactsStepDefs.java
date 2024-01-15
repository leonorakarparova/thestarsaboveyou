package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.ContactsPage;
import io.cucumber.java.en.Then;

public class ContactsStepDefs {
    @Then("he verifies that the Contacts area is present")
    public void he_verifies_that_the_contacts_area_is_present() {
        ContactsPage.verifyContactsArticleArea();
    }

}
