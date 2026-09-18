package com.eq.framework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.eq.framework.steps", "com.eq.framework.hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public final class CucumberTestRunner extends AbstractTestNGCucumberTests {
}