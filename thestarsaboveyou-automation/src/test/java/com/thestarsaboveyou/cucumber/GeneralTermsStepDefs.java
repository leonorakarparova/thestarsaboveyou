package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.GeneralTerms;
import io.cucumber.java.en.Then;

public class GeneralTermsStepDefs {
    @Then("he verifies that the General terms area is present")
    public void he_verifies_that_the_general_terms_area_is_present() {
        GeneralTerms.verifyGeneralTermsArticleArea();
    }

}
