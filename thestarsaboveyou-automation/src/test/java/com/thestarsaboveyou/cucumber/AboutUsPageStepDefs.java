package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.AboutUsPage;
import io.cucumber.java.en.Then;

public class AboutUsPageStepDefs {
    @Then("he verifies that About us content is present")
    public void he_verifies_that_about_us_content_is_present() {
        AboutUsPage.verifyAboutUsPageContent();
    }
}
