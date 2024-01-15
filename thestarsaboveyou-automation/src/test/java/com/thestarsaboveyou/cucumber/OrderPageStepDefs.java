package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.OrderPage;
import io.cucumber.java.en.When;

public class OrderPageStepDefs {

    @When("verifies that the Order header is present")
    public void verifies_that_the_order_header_is_present() {
        OrderPage.verifyOrderHeader();
    }

    @When("enters the First name")
    public void enters_the_first_name() {
        OrderPage.enterFirstName("Ivan");
    }
    @When("enters the Last name")
    public void enters_the_last_name() {
        OrderPage.enterLastName("Ivanov");
    }

    @When("enters the Address")
    public void enters_the_address() {
        OrderPage.enterAddress("Vitosha");
    }

    @When("enters the City")
    public void enters_the_city() {
        OrderPage.enterCity("Sofia");
    }

    @When("enters the Phone number")
    public void enters_the_phone_number() {
        OrderPage.enterPhoneNumber("123456789");
    }

    @When("enters the Email")
    public void enters_the_email() {
        OrderPage.enterEmail("ivan.ivanov54321@gmail.com");
    }

    @When("clicks on Delivery payment")
    public void clicks_on_delivery_payment() {
       OrderPage.clickDeliveryPayment();
    }

    @When("clicks on accept terms")
    public void clicks_on_accept_terms() {
        OrderPage.acceptTerms();
    }
    @When("clicks on Place order button")
    public void clicks_on_place_order_button() {
        OrderPage.clickPlaceOrderButtonWithoutWait();
    }

    @When("enters the invalid Email")
    public void enters_the_invalid_email() {
        OrderPage.enterEmail("teodora.stoyanovagmail.com");
    }

    @When("enters an invalid Phone number")
    public void enters_an_invalid_phone_number() {
        OrderPage.enterPhoneNumber("ffffffffffff");
    }

    @When("clicks on Place order button with explicit wait")
    public void clicks_on_place_order_button_with_explicit_wait() {
        OrderPage.clickPlaceOrderButtonWithWait();
    }
}
