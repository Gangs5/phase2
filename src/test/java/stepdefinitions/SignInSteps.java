package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {

	@Given("user is on dietition website to validate sign in page")
	public void user_is_on_dietition_website_to_validate_sign_in_page() {

	}

	@When("user click on icon symbol on sign in page")
	public void user_click_on_icon_symbol_on_sign_in_page() {
		System.out.println("Inside step-user click on icon symbol on sign in page");
	}

	@Then("user should see the title of the page signIn")
	public void user_should_see_the_title_of_the_page_sign_in() {
		System.out.println("Inside Step-user should see the title of the page signIn");
		
	}

	@Given("user is on dietition website to test mandatory fields on sign in page")
	public void user_is_on_dietition_website_to_test_mandatory_fields_on_sign_in_page() {
	}

	@When("user is  on sign in page to test mandatory fields")
	public void user_is_on_sign_in_page_to_test_mandatory_fields() {
	}

	@Then("User should see all mandatory fields with star symbol on top of those fields in sign in page")
	public void user_should_see_all_mandatory_fields_with_star_symbol_on_top_of_those_fields_in_sign_in_page() {
	}
}
	