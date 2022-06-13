package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RegPageMandatoryFieldspage {
	
	
	
	@Given("User is on Dietician website page")
	public void user_is_on_dietician_website_page()
	{
	System.out.println(" user is on dietician website");	
	}
	
	@When("User lands on Register page on Dietician website")
	public void user_lands_on_register_page_on_dietician_website()
	{
		System.out.println("user lands on register page");	

	}
	
	@Then("User should see all mandatory flields with star symbol on top of those fields")
	public void user_should_see_all_mandatory_flields_with_star_symbol_on_top_of_those_fields() 
	{
		System.out.println("user finds star symbol on all mandatory fields");	

	}


}
