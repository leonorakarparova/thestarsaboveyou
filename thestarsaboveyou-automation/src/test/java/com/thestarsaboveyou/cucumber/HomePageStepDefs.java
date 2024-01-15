package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.HomePage;
import com.thestarsaboveyou.testng.utils.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDefs {

    @Before
    public void open(){
        Browser.open();
    }

    @After
    public void quit(){
        Browser.quit();
    }

    @Given("the user is on Home page")
    public void the_user_is_on_home_page() {
        HomePage.open();
    }

    @Then("he verifies that the Header area is present")
    public void he_verifies_that_the_header_area_is_present() {
        HomePage.verifyHeader();
    }

    @When("he clicks on Order button")
    public void he_clicks_on_order_button() {
        HomePage.clickToOrderButton();
    }
}
