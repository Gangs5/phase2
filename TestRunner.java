package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"StepDefinition"},
monochrome = true,
plugin= {"pretty","html:target/reports/cucumber.html","json:target/reports/cucumber.json","junit:target/reports/cucumber.xml"})
public class TestRunner {

}
