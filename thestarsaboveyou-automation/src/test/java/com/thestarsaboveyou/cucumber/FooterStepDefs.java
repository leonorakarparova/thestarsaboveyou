package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.Footer;
import io.cucumber.java.en.When;

public class FooterStepDefs {
    @When("he clicks on Contacts button")
    public void he_clicks_on_contacts_button() {
        Footer.clickContacts();
    }

    @When("he clicks on Delivery button")
    public void he_clicks_on_delivery_button() {
       Footer.clickDelivery();
    }

    @When("he clicks on General terms button")
    public void he_clicks_on_general_terms_button() {
        Footer.clickGeneralTerms();
    }

}
