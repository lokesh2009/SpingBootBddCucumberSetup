package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/ui",
        glue = "com.ui",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class UiTestRunner extends AbstractTestNGCucumberTests {
}
