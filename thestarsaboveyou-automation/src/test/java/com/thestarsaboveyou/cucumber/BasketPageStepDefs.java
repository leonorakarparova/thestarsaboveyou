package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.BasketPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketPageStepDefs {

    @When("verifies that the Add to basket message is present")
    public void verifies_that_the_add_to_basket_message_is_present() {
        BasketPage.verifyAddedToBasketMessage();
    }
    @When("clicks on Order completion button")
    public void clicks_on_order_completion_button() {
        BasketPage.clickOrderCompletionButton();
    }
    @Then("verifies that the Empty location error message is present")
    public void verifies_that_the_empty_location_error_message_is_present() {
        BasketPage.verifyEmptyLocationErrorMessage();
    }

}
