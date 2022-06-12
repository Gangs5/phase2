package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

 
	 
  @RunWith(Cucumber.class)

	@CucumberOptions(features = {"src/test/resources/Feature"},
			glue= {"stepdefinitions"},
			 monochrome = true,
		  // plugin = {"pretty", "json:target/JsonReport/jsonrpt.json"}
	      //  format={"json:target/Destination/cucumber.json"}
	//plugin = {"pretty", "html:target/cucumberRpt.html"}
	plugin = {"pretty","junit:target/JUnitreport.xml"}
			)
	public class Runner extends AbstractTestNGCucumberTests {
		/*@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios(){
			return super.scenarios();}*/
		
	    }



