package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.PDPPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDPPageStepDefs {

    @Then("he verifies that the Product title is present")
    public void he_verifies_that_the_product_title_is_present() {
        PDPPage.verifyProductTitle();
    }

    @When("selects the Type of product")
    public void selects_the_type_of_product() {
        PDPPage.selectType("20x30");
    }
    @When("enters the Date")
    public void enters_the_date() {
        PDPPage.enterDate("13.02.2018");
    }
    @When("enters the Time")
    public void enters_the_time() {
        PDPPage.enterTime("16:50");
    }
    @When("enters the Location")
    public void enters_the_location() {
        PDPPage.enterLocation("Varna");
    }
    @When("enters the Text")
    public void enters_the_text() {
        PDPPage.enterText("Stars");
    }

    @When("selects the Design")
    public void selects_the_design() {
        PDPPage.selectDesign(0);
    }
    @When("selects the Font")
    public void selects_the_font() {
        PDPPage.selectFont(1);
    }
    @When("clicks on Add to basket button")
    public void clicks_on_add_to_basket_button() {
        PDPPage.clickAddToBasketButton();
    }
    @When("leaves the Location fields empty")
    public void leaves_the_location_fields_empty() {
        PDPPage.enterLocation(" ");
    }
    @Then("verifies that the Alert box is present")
    public void verifies_that_the_alert_box_is_present() {
        PDPPage.verifyAlertBox();
    }

}
