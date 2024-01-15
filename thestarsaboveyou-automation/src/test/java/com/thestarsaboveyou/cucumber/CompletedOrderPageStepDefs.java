package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.CompletedOrderPage;
import io.cucumber.java.en.Then;

public class CompletedOrderPageStepDefs {

    @Then("he verifies that the Complete order message is present")
    public void he_verifies_that_the_complete_order_message_is_present() {
        CompletedOrderPage.verifyCompletedOrder();
    }
}
