package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class emailSignInForm {

	@Given("User is on Dietition page to test log in with your email form")
	public void user_is_on_dietition_page_to_test_log_in_with_your_email_form() {
	}

	@When("User is on Sign In page to test log in with your email form")
	public void user_is_on_sign_in_page_to_test_log_in_with_your_email_form() {
	}

	@Then("User should see a form with heading Log in with  your email form to sign In using email")
	public void user_should_see_a_form_with_heading_log_in_with_your_email_form_to_sign_in_using_email() {
	}
	
	
	@Given("User is on Dietition page to test Login button")
	public void user_is_on_dietition_page_to_test_login_button() {
	}

	@When("User is on Sign In page to test log in  button with your email form")
	public void user_is_on_sign_in_page_to_test_log_in_button_with_your_email_form() {
	}

	@Then("User should see a button with text Log in in the Sign In form")
	public void user_should_see_a_button_with_text_log_in_in_the_sign_in_form() {
	}

	@Given("User is on sign In page to test Email and password empty")
	public void user_is_on_sign_in_page_to_test_email_and_password_empty() {
	}

	@When("User clicks Log In button with all fields empty")
	public void user_clicks_log_in_button_with_all_fields_empty() {
	}

	@Then("User gets  error message Please fill out fields in textbox")
	public void user_gets_error_message_please_fill_out_fields_in_textbox() {
	}
	
	@Given("User is on sign In page to test invalid Email and valid password")
	public void user_is_on_sign_in_page_to_test_invalid_email_and_valid_password() {
	}

	@When("User clicks Log In button with invalid email and valid password")
	public void user_clicks_log_in_button_with_invalid_email_and_valid_password() {
	}

	@Then("User should see message Please fill with valid email id")
	public void user_should_see_message_please_fill_with_valid_email_id() {
	}

	@Given("User is on sign In page to test valid Email and invalid password")
	public void user_is_on_sign_in_page_to_test_valid_email_and_invalid_password() {
	}

	@When("User clicks Log In button with valid email and invalid password")
	public void user_clicks_log_in_button_with_valid_email_and_invalid_password() {
	}

	@Then("User gets a message Invalid Password Pleasetry again")
	public void user_gets_a_message_invalid_password_pleasetry_again() {
	}

	@Given("User is on sign In page to test valid Email and empty password field")
	public void user_is_on_sign_in_page_to_test_valid_email_and_empty_password_field() {
	}

	@When("User clicks Log In button with valid email and empty password")
	public void user_clicks_log_in_button_with_valid_email_and_empty_password() {
	}

	@Then("User gets a message Please fill the password")
	public void user_gets_a_message_please_fill_the_password() {
	}
	
	
	@Given("User is on sign In page to test invalid Email and password")
	public void user_is_on_sign_in_page_to_test_invalid_email_and_password() {
	}

	@When("User clicks Log In with both invalid email and password")
	public void user_clicks_log_in_with_both_invalid_email_and_password() {
	}

	@Then("User gets error message message Invalid Login credentials")
	public void user_gets_error_message_message_invalid_login_credentials() {
	}

	@Given("User is on sign In page to test valid Email and password")
	public void user_is_on_sign_in_page_to_test_valid_email_and_password() {
	}

	@When("User clicks Log In with both valid email and password")
	public void user_clicks_log_in_with_both_valid_email_and_password() {
	}

	@Then("User gets a message logged in successfully and sees signout button")
	public void user_gets_a_message_logged_in_successfully_and_sees_signout_button() {
	}
	
	@Given("User is on sign In page to forgot password")
	public void user_is_on_sign_in_page_to_forgot_password() {
	}

	@When("User clicks on forgot password button")
	public void user_clicks_on_forgot_password_button() {
	}

	@Then("User is redirected to reset password link")
	public void user_is_redirected_to_reset_password_link() {
	}
	
	@Given("User is on sign In page to test facebook button")
	public void user_is_on_sign_in_page_to_test_facebook_button() {
	}

	@When("User clicks Facebook button to log in")
	public void user_clicks_facebook_button_to_log_in() {
	}

	@Then("User is redirected to Facebook  login Page")
	public void user_is_redirected_to_facebook_login_page() {
	}

}
