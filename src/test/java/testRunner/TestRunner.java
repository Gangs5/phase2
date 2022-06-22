package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

	@CucumberOptions(features = {"src/test/resources/Features"},
			glue= {"stepdefinitions"},
			 monochrome = true,
					 plugin = {"pretty","html:target/cucumber.html","json:target/JSONReports/cucumber.json","junit:target/cucumber.xml"})
	

public class TestRunner {

	public static void main(String[] args) {
		

	}

}
