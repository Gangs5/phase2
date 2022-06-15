package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signinUsername {
	
	@Given("user is on dietition website to test sign In form heading")
	public void user_is_on_dietiction_website_to_test_sign_in_form_heading() {
	}

	@When("user is on sign in page to test sign In form heading")
	public void user_is_on_sign_in_page_to_test_sign_in_form_heading() {
	}

	@Then("User should see a form with heading Sign In form to sign In using Username")
	public void user_should_see_a_form_with_heading_sign_in_form_to_sign_in_using_username() {
	}

	@Given("user is on dietition website to test sign In button")
	public void user_is_on_dietiction_website_to_test_sign_in_button() {
	}

	@When("user is on sign in page to test sign In button")
	public void user_is_on_sign_in_page_to_test_sign_in_button() {
	}

	@Then("User should see a button with text SIGN IN in the Sign In form")
	public void user_should_see_a_button_with_text_sign_in_in_the_sign_in_form() {
	}

	@Given("user is on sign in page to test with all fields empty")
	public void user_is_on_sign_in_page_to_test_with_all_fields_empty() {
	}

	@When("User clicks Sign In Button in the Sign In form with all fields empty")
	public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty() {
	}

	@Then("User should get error message Please fill out the fields")
	public void user_should_get_error_message_please_fill_out_the_fields() {
	}

	
	@Given("user is on sign In page to test invalid FirstName")
	public void user_is_on_sign_in_page_to_test_invalid_first_name() {
	}

	@When("User clicks Sign In button entering numeric values for Username and valid values for password")
	public void user_clicks_sign_in_button_entering_numeric_values_for_username_and_valid_values_for_password() {
	}

	@Then("User should get a message Invalid entry for first field")
	public void user_should_get_a_message_invalid_entry_for_first_field() {
	}

	
	@Given("user is on sign in page to test with invalid password")
	public void user_is_on_sign_in_page_to_test_with_invalid_password() {
	}

	@When("User clicks Sign In button entering extra length of password")
	public void user_clicks_sign_in_button_entering_extra_length_of_password() {
	}

	@Then("User should get a message Invalid entry for password field")
	public void user_should_get_a_message_invalid_entry_for_password_field() {
	}

	@Given("user is on sign in page to test with username and password")
	public void user_is_on_sign_in_page_to_test_with_username_and_password() {
	}

	@When("User clicks Sign In button entering invalid values for both fields")
	public void user_clicks_sign_in_button_entering_invalid_values_for_both_fields() {
	}

	@Then("User should get error message Invalid login credentials")
	public void user_should_get_error_message_invalid_login_credentials() {
	}

	@Given("user is on sign In page to test forgot password button")
	public void user_is_on_sign_in_page_to_test_forgot_password_button() {
	}

	@When("User clicks on Forgot Password button")
	public void user_clicks_on_forgot_password_button() {
	}

	@Then("User should be directed to  Reset password link")
	public void user_should_be_directed_to_reset_password_link() {
	}

	@Given("user is on sign In page to Not member Yet button")
	public void user_is_on_sign_in_page_to_not_member_yet_button() {
	}

	@When("User clicks on not member yet button")
	public void user_clicks_on_not_member_yet_button() {
	}

	@Then("User will land on Register Page on dietition website")
	public void user_will_land_on_register_page_on_dietition_website() {
	}

	@Given("User is on sign In page to test all fields valid entry")
	public void user_is_on_sign_in_page_to_test_all_fields_valid_entry() {
	}

	@When("Validating Sign In with all fields valid entry")
	public void validating_sign_in_with_all_fields_valid_entry() {
	}

	@Then("User logged into sign in page successfully")
	public void user_logged_into_sign_in_page_successfully() {
	}

	
}
