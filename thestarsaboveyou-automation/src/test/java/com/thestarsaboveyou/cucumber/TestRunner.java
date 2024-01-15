package com.thestarsaboveyou.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin ={ "pretty", "html:target/cucumber.html"},
        features = "src/test/resources")
public class TestRunner extends AbstractTestNGCucumberTests {

}
