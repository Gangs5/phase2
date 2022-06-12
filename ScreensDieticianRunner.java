package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/ScreensDietician.feature",
glue = {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "json:taget/JSONReports/report.json"})

public class ScreensDieticianRunner {

}
