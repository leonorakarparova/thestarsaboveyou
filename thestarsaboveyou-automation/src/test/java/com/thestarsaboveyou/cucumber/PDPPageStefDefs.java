package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.PDPPage;
import io.cucumber.java.en.Then;

public class PDPPageStefDefs {

    @Then("he verrifies that the Product title is present")
    public void he_verrifies_that_the_product_title_is_present() {
        PDPPage.verifyProductTitle();
    }

}
