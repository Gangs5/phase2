package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewPatientDataPageStepDef {


    @Given("The Dietitian lands on the New Patient page")
	public void the_Dietitian_lands_on_the_new_patient_page() {
	   System.out.println("Inside Step-The Dietitian lands on the New Patient page");
	}

	@When("the Dietitian clicks on the New Patient clickable header option in Home Page")
	public void the_Dietitian_clicks_on_the_new_patient_clickable_header_option_in_home_page() {
		System.out.println("Inside Step-the Dietitian clicks on the New Patient clickable header option in Home Page");
	}

	@Then("The Dietitian will be re directed to New Patient page from Dietitian home page")
	public void the_Dietitian_will_be_re_directed_to_new_patient_page_from_Dietitian_home_page() {
		System.out.println("Inside Step-The Dietitian will be re directed to New Patient page from Dietitian home page");
	}

	@Given("Dietitian is on New PATIENT page")
	public void Dietitian_is_on_new_patient_page() {
		System.out.println("Inside Step-Dietitian is on New PATIENT page");
	}

	@When("The Dietitian fills the patient's FULL NAME")
	public void the_Dietitian_fills_the_patient_s_full_name() {
		System.out.println("Inside Step-The Dietitian fills the patient's FULL NAME");
	}

	@When("the Dietitian fills the patient's Address Line 1")
	public void the_Dietitian_fills_the_patient_s_address_line_1() {
		System.out.println("Inside Step-The Dietitian fills the patient's Address line 1");
	}

	@When("The Dietitian fills the patient's Address line 2")
	public void the_Dietitian_fills_the_patient_s_address_line_2() {
		System.out.println("Inside Step-The Dietitian fills the patient's Address line 2");
	}

	@When("the Dietitian clicks the country dropdown and selects the respective patient's country")
	public void the_Dietitian_clicks_the_country_dropdown_and_selects_the_respective_patient_s_country() {
		System.out.println("the Dietitian clicks the country dropdown and selects the respective patient's country");
	}

	@When("the Dietitian fills the patient's City Name")
	public void the_Dietitian_fills_the_patient_s_city_name() {
		System.out.println("Inside Step-the Dietitian fills the patient's City Name");
	}

	@When("the Dietitian fills the patient's State name")
	public void the_Dietitian_fills_the_patient_s_state_name() {
		System.out.println("Inside Step-the Dietitian fills the patient's State name");
	}

	@When("the Dietitian fills the patient's Postal Code")
	public void the_Dietitian_fills_the_patient_s_postal_code() {
		System.out.println("Inside Step-the Dietitian fills the patient's Postal Code");
	}

	@When("the Dietitian fills the patient's Email Id")
	public void the_Dietitian_fills_the_patient_s_email_id() {
		System.out.println("Inside Step-the Dietitian fills the patient's Email Id");
	}

	@When("the Dietitian fills the patient's 10 digit phone number")
	public void the_Dietitian_fills_the_patient_s_10_digit_phone_number() {
		System.out.println("Inside Step-the Dietitian fills the patient's 10 digit phone number");
	}

	@When("The Dietitian clicks the update button")
	public void the_Dietitian_clicks_the_update_button() {
		System.out.println("Inside Step-The Dietitian clicks the update button");
	}

	@Then("the Dietitian will get an alert on screen saying new patient details updated")
	public void the_Dietitian_will_get_an_alert_on_screen_saying_new_patient_details_updated() {
		System.out.println("Inside Step-the Dietitian will get an alert on screen saying new patient details updated");
	}

	@When("the Dietitian clicks on the update health conditions button")
	public void the_Dietitian_clicks_on_the_update_health_conditions_button() {
		System.out.println("Inside Step-the Dietitian clicks on the update health conditions button");
	}

	@Then("the Dietitian will be re directed to the update health conditions page")
	public void the_Dietitian_will_be_re_directed_to_the_update_health_conditions_page() {
		System.out.println("Inside Step-the Dietitian will be re directed to the update health conditions page");
	}

	@Given("the system doesnt accept the new patient data")
	public void the_system_doesnt_accept_the_new_patient_data() {
		System.out.println("Inside Step-the system doesnt accept the new patient data");
	}

	@When("the Dietitian fills the new patient's first name and last name which are already in records")
	public void the_Dietitian_fills_the_new_patient_s_first_name_and_last_name_which_are_already_in_records() {
		System.out.println("Inside Step-the Dietitian fills the new patient's first name and last name which are already in records");
	}

	@Then("the Dietitian will get an alert on screen saying same first name and last name exists")
	public void the_Dietitian_will_get_an_alert_on_screen_saying_same_first_name_and_last_name_exists() {
		System.out.println("Inside Step-the Dietitian will get an alert on screen saying same first name and last name exists");
	}

	@When("the Dietitian doesnt fill 10 digits in the mobile number tab")
	public void the_Dietitian_doesnt_fill_10_digits_in_the_mobile_number_tab() {
		System.out.println("Inside Step-the Dietitian doesnt fill 10 digits in the mobile number tab");
	}

	@Then("the Dietitian will get an alert on screen saying enter valid mobile number")
	public void the_Dietitian_will_get_an_alert_on_screen_saying_enter_valid_mobile_number() {
		System.out.println("Inside Step-the Dietitian will get an alert on screen saying enter valid mobile number");
	}

	@When("the Dietitian doesnt fill all the tabs in the form")
	public void the_Dietitian_doesnt_fill_all_the_tabs_in_the_form() {
		System.out.println("Inside Step-Tthe Dietitian doesnt fill all the tabs in the form");
	}

	@Then("the Dietitian will get an alert on screen saying fill all the tabs in the form")
	public void the_Dietitian_will_get_an_alert_on_screen_saying_fill_all_the_tabs_in_the_form() {
		System.out.println("Inside Step-the Dietitian will get an alert on screen saying fill all the tabs in the form");
	}

	@When("the Dietitian doesnt fill valid 5 digit postal code")
	public void the_Dietitian_doesnt_fill_valid_5_digit_postal_code() {
		System.out.println("Inside Step-the Dietitian doesnt fill valid 5 digit postal code");
	}

	@Then("the Dietitian will get an alert on screen saying enter valid {int} digit postal code")
	public void the_Dietitian_will_get_an_alert_on_screen_saying_enter_valid_digit_postal_code(Integer int1) {
		System.out.println("Inside Step-the Dietitian will get an alert on screen saying enter valid {int} digit postal code");
	}

	@When("the Dietitian doesnt fill valid email address")
	public void the_Dietitian_doesnt_fill_valid_email_address() {
		System.out.println("Inside Step-the Dietitian doesnt fill valid email address");
	}

	@Then("the Dietitian will get an alert on scree saying enter valid email address")
	public void the_Dietitian_will_get_an_alert_on_scree_saying_enter_valid_email_address() {
		System.out.println("Inside Step-the Dietitian will get an alert on scree saying enter valid email address");
	}

	@When("the Dietitian fills the first name and last name as alphanumeric")
	public void the_Dietitian_fills_the_first_name_and_last_name_as_alphanumeric() {
		System.out.println("Inside Step-the Dietitian fills the first name and last name as alphanumeric");
	}

	@Then("the Dietitian will get an alert on screen saying invalid first name and last name should contain alphabets only")
	public void the_Dietitian_will_get_an_alert_on_screen_saying_invalid_first_name_and_last_name_should_contain_alphabets_only() {
		System.out.println("Inside Step-the Dietitian will get an alert on screen saying invalid first name and last name should contain alphabets only");
	}
	
	
	
	
	
}
