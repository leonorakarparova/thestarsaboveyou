package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.HeaderArea;
import io.cucumber.java.en.When;

public class HeaderAreaStepDefs {
    @When("he clicks on Header area Order button")
    public void he_clicks_on_header_area_order_button() {
        HeaderArea.clickHeaderAreaOrderButton();
    }

    @When("he clicks on About us button")
    public void he_clicks_on_about_us_button() {
        HeaderArea.clickAboutUsButton();
    }

}
