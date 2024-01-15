package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.DeliveryPage;
import io.cucumber.java.en.Then;

public class DeliveryStepDefs {
    @Then("he verifies that the Delivery area is present")
    public void he_verifies_that_the_delivery_area_is_present() {
        DeliveryPage.verifyDeliveryArticleArea();
    }
}
