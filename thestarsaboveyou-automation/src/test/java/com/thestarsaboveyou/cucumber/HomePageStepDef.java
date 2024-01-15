package com.thestarsaboveyou.cucumber;

import com.thestarsaboveyou.testng.pages.HomePage;
import com.thestarsaboveyou.testng.utils.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;


public class HomePageStepDef {

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




}
