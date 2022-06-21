package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

	@CucumberOptions(features = {"src/test/resources/Features"},
			glue= {"stepdefinitions"},
			 monochrome = true,
				 plugin = {"pretty","html:target/reports/cucumber.html","json:target/reports/cucumber.json","junit:target/reports/cucumber.xml"})
	

public class Runner {

	public static void main(String[] args) {
		

	}

}
