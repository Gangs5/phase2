package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPage {




	@Given("User is on register page to Signup")
	public void user_is_on_register_page_to_Signup() {
		System.out.println("User is on register page");	
	}

	@When("User enters the user first name last name valid mobile number and password")
	public void user_enters_the_user_first_name_last_name_valid_mobile_number_and_password() {
		System.out.println("User enters the valid credentials in mandatory fields");
	}
	@Then("User clicks on Signup")
	public void user_clicks_on_signup() {
		System.out.println("User clicks on signup button");	
	}

	@When("User navigates to Next page")
	public void user_navigates_to_next_page() {
		System.out.println("User should be  navigated to next page");	
	}

	@Then("User is able to signup successfully")
	public void user_is_able_to_signup_successfully() {
		System.out.println("User signedup successfully");	
	}


	@Given("User On SignUp form with an Email Option")
	public void user_on_sign_up_form_with_an_email_option() {
		System.out.println("User on signup page with an email option");
	}

	@When("User enters all the valid values in the respective options")
	public void user_enters_all_the_valid_values_in_the_respective_options() {
		System.out.println("User enters valid values ");
	}

	@Then("User is successfully redirected to Signin page")
	public void user_is_successfully_redirected_to_signin_page() {
		System.out.println("User is able to login successfully");

	}



	@Given("User is on register page")
	public void user_is_on_register_page() {
		System.out.println("USer is on Register page");
	}

	@When("User clicks on signup button with all fields empty")
	public void user_clicks_on_signup_button_with_all_fields_empty() {

		System.out.println("User leaves all the fields empty");	}

	@Then("User should see the message that Mandatory fields cannot be empty")
	public void user_should_see_the_message_that_mandatory_fields_cannot_be_empty() {
		System.out.println("User should see the message as missing mandatory fields");	
	}


	@Given("User is on register page to signup with invalid name")
	public void user_is_on_register_page_to_signup_with_invalid_name() {
		System.out.println("user is on register page");
	}

	@When("User clicks SIGN UP button in the Sign Up form  by entering numeric text for First Name valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
		System.out.println("user enters invalid name");
	}

	@Then("User should see a message Invalid data entered for First Name")
	public void user_should_see_a_message_invalid_data_entered_for_first_name() {
		System.out.println("user finds invalid name message");
	}

	@Given("User is on register page to signup with invalid last name")
	public void user_is_on_register_page_to_signup_with_invalid_last_name() {

	}

	@When("User clicks SIGN UP button in the Sign Up form  by entering numeric text for last Name valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
	}

	@Then("User should see a message Invalid data entered for last name")
	public void user_should_see_a_message_invalid_data_entered_for_last_name() {
	}

	@Given("User is on register page to signup with invalid mobile number")
	public void user_is_on_register_page_to_signup_with_invalid_mobile_number() {
	}

	@When("User clicks SIGN UP button in the Sign Up form  by entering alphanumeric text for mobile number field and valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_alphanumeric_text_for_mobile_number_field_and_valid_values_for_the_remaining_fields() {
	}

	@Then("User should see a message Invalid data entered for mobile number")
	public void user_should_see_a_message_invalid_data_entered_for_mobile_number() {
	}


	@Given("User is on register page to signup with invalid anyother field")
	public void user_is_on_register_page_to_signup_with_invalid_anyother_field() {
	}

	@When("User clicks SIGN UP button in the Sign Up form  by entering numeric values for anyother field and valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_values_for_anyother_field_and_valid_values_for_the_remaining_fields() {
	}

	@Then("User should see a message Invalid data entered for anyother field")
	public void user_should_see_a_message_invalid_data_entered_for_anyother_field() {
	}

	@Given("User is on register page to signup with invalid email id  field")
	public void user_is_on_register_page_to_signup_with_invalid_email_id_field() {
	}

	@When("User clicks SIGN UP button in the Sign Up form  by entering invalid email id  and valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_email_id_and_valid_values_for_the_remaining_fields() {
	}

	@Then("User should see a message Invalid data entered for email id  field")
	public void user_should_see_a_message_invalid_data_entered_for_email_id_field() {
	}
	@Given("User is on register page to signup with invalid password  field")
	public void user_is_on_register_page_to_signup_with_invalid_password_field() {
	}

	@When("User clicks SIGN UP button in the Sign Up form  by entering invalid password  and valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_password_and_valid_values_for_the_remaining_fields() {
	}

	@Then("User should see a message Invalid data entered forpassword field")
	public void user_should_see_a_message_invalid_data_entered_forpassword_field() {
	}

	@Given("User is on register page to signup with all fields empty on email sign up form")
	public void user_is_on_register_page_to_signup_with_all_fields_empty_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form  by leaving all fields empty on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_leaving_all_fields_empty_on_email_signup_form() {
	}

	@Then("User should see a message cannot be empty")
	public void user_should_see_a_message_cannot_be_empty() {
	}

	@Given("User is on register page to signup with invalid name  on email sign up form")
	public void user_is_on_register_page_to_signup_with_invalid_name_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form by entering invalid name  on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_name_on_email_signup_form() {
	}

	@Then("User should see a message invalid data entered for name")
	public void user_should_see_a_message_invalid_data_entered_for_name() {
	}

	@Given("User is on register page to signup with invalid last name  on email sign up form")
	public void user_is_on_register_page_to_signup_with_invalid_last_name_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form by entering invalid last name  on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_last_name_on_email_signup_form() {
	}

	@Then("User should see a message invalid data entered for last name on email sign up form")
	public void user_should_see_a_message_invalid_data_entered_for_last_name_on_email_sign_up_form() {
	}

	@Given("User is on register page to signup with invalid UserName  on email sign up form")
	public void user_is_on_register_page_to_signup_with_invalid_user_name_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form by entering invalid UserName  on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_user_name_on_email_signup_form() {
	}

	@Then("User should see a message invalid data entered for UserName on email sign up form")
	public void user_should_see_a_message_invalid_data_entered_for_user_name_on_email_sign_up_form() {
	}

	@Given("User is on register page to signup with invalid Email Address  on email sign up form")
	public void user_is_on_register_page_to_signup_with_invalid_email_address_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form by entering invalid Email Address on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_email_address_on_email_signup_form() {
	}

	@Then("User should see a message invalid data entered for Email Address on email sign up form")
	public void user_should_see_a_message_invalid_data_entered_for_email_address_on_email_sign_up_form() {
	}

	@Given("User is on register page to signup with invalid Password  on email sign up form")
	public void user_is_on_register_page_to_signup_with_invalid_password_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form by entering invalid Password  on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_password_on_email_signup_form() {
	}

	@Then("User should see a message invalid data entered for Password on email sign up form")
	public void user_should_see_a_message_invalid_data_entered_for_password_on_email_sign_up_form() {
	}

	@Given("User is on register page to signup with invalid confirm Password  on email sign up form")
	public void user_is_on_register_page_to_signup_with_invalid_confirm_password_on_email_sign_up_form() {
	}

	@When("User clicks SIGN UP button in the Sign Up form by entering invalid confirm Password on email signup form")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_confirm_password_on_email_signup_form() {
	}

	@Then("User should see a message invalid data entered for confirm Password on email sign up form")
	public void user_should_see_a_message_invalid_data_entered_for_confirm_password_on_email_sign_up_form() {
	}








}
