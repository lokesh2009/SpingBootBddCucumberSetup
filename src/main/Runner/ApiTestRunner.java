package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/api",
        glue = "com.api",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class ApiTestRunner extends AbstractTestNGCucumberTests {
}
