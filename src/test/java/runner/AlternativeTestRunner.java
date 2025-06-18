package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Alternative approach - try this if above doesn't work
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "StepDefinition",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class AlternativeTestRunner {
}
