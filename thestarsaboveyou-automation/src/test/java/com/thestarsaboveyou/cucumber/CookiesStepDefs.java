package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.Cookies;
import io.cucumber.java.en.When;

public class CookiesStepDefs {
    @When("he clicks on accept cookies")
    public void he_clicks_on_accept_cookies() {
        Cookies.acceptCookies();
    }
}
