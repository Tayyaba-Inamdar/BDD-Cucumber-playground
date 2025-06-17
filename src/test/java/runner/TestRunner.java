package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"StepDefination"},
        plugin = {"pretty", "html:target/cucumber/report.html", "json:target/cucumber/report.json"},
        monochrome = true,
        publish = true)


public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
