package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        plugin = {"pretty",
                "html:target/cucumber-reports/reports.html",
                "json:target/cucumber-reports/Cucumber.json" },
        monochrome = true,
        publish = true
)
public class CucumberTest extends AbstractTestNGCucumberTests {
}
