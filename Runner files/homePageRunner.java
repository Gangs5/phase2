package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features/homePage.feature",
glue = {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "junit:target/JunitReports/report.xml"})

public class homePageRunner {

}
