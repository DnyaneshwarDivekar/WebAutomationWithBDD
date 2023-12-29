package com.dddemo.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.dddemo.tests",
//    plugin = {"pretty", "html:target/cucumber-reports.html"},
    
    plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},

    
    monochrome = true // This line disables ANSI colors
)
public class TestRunner {
}
