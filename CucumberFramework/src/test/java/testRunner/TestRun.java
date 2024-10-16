package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {".//Features/Login.feature"}, // Updated path to your feature files
    glue = {"stepDefinitions"},                             // Step definition package
    plugin = {"pretty", "html:target/cucumber-reports"},     // Plugin for reports
    monochrome = true                                       // Optional, to make console output more readable
)
public class TestRun {
}



