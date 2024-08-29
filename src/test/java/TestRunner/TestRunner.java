package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//features/carbohydrate_calculator.feature",
    glue = "stepDefination",
    dryRun= false,
    plugin = {"pretty", "html:target/cucumber-reports/html"},
    monochrome = true
)
public class TestRunner {
}
