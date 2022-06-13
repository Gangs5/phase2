package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("The dietician is on dietician HOME PAGE")
	public void the_dietician_is_on_dietician_home_page() {

		System.out.println("Inside Step-The dietician is on dietician HOME PAGE");
	}

	@When("The Dietician fills valid username, password")
	public void the_dietician_fills_valid_username_password() {
		System.out.println("Inside Step-The Dietician fills valid username, password");
	}

	@When("clicks the logged in as Dietician option")
	public void clicks_the_logged_in_as_dietician_option() {
		System.out.println("Inside Step-clicks the logged in as Dietician option");
	}

	@When("clicks the Sign IN button")
	public void clicks_the_sign_in_button() {
		System.out.println("Inside Step-clicks the Sign IN button");
	}

	@Then("The page will be re directed to the Dietician homepage and the username will display as Logged in as Dietician Name")
	public void the_page_will_be_re_directed_to_the_dietician_homepage_and_the_username_will_display_as_logged_in_as_dietician_name() {
		System.out.println("Inside Step-The page will be re directed to the Dietician homepage and the username will display as Logged in as Dietician Name");
	}

	
	@Given("The dietician is on dietician HOME PAGE Top Panel Section")
	public void the_dietician_is_on_dietician_home_page_top_panel_section() {
	    System.out.println("Inside Step-The dietician is on dietician HOME PAGE Top Panel Section");
	}


	@When("The Dietician Home Page contains company logo and an image")
	public void the_dietician_home_page_contains_company_logo_and_an_image() {
		System.out.println("Inside Step-The Dietician Home Page contains company logo and an image");
	}
	  

	@Then("The dietician will see logo and image")
	public void the_dietician_will_see_logo_and_image() {
	 System.out.println("Inside Step-The dietician will see logo and image");
	}

	@When("The Dietician Home page contains few clickable header options such as HOME,NEW PATIENT,MY PATIENT,DIET PLAN")
	public void the_dietician_home_page_contains_few_clickable_header_options_such_as_home_new_patient_my_patient_diet_plan() {
	   System.out.println("Inside Step-The Dietician Home page contains few clickable header options such as HOME,NEW PATIENT,MY PATIENT,DIET PLAN");
	}

	@Then("The dietician will be re directed to the respective pages upon a click")
	public void the_dietician_will_be_re_directed_to_the_respective_pages_upon_a_click() {
	   System.out.println("Inside Step-The dietician will be re directed to the respective pages upon a click");
	
}


	@Given("dietician is on body of dietician HOME PAGE")
	public void dietician_is_on_body_of_dietician_home_page() {
	   System.out.println("Inside Step-dietician is on body of dietician HOME PAGE");
	}

	@When("The Dietician Home page contains Company banner and important Announcements")
	public void the_dietician_home_page_contains_company_banner_and_important_announcements() {
	   System.out.println("Inside Step-The Dietician Home page contains Company banner and important Announcements");
	}

	@Then("The dietician will see all the important announcements upon login")
	public void the_dietician_will_see_all_the_important_announcements_upon_login() {
	    System.out.println("Inside Step-The dietician will see all the important announcements upon login");
	}

	@Given("dietician is Signing Out")
	public void dietician_is_signing_out() {
	    System.out.println("Inside Step-dietician is Signing Out");
	}

	@When("The Dietician home page top panel contains a SIGN OUT clickable button")
	public void the_dietician_home_page_top_panel_contains_a_sign_out_clickable_button() {
	   System.out.println("Inside Step-The Dietician home page top panel contains a SIGN OUT clickable button");
	}

	@Then("The Dietician Signs out of the portal upon the click")
	public void the_dietician_signs_out_of_the_portal_upon_the_click() {
	    System.out.println("Inside Step-The Dietician Signs out of the portal upon the click");
	}

	@Given("The Dietician lands on the New Patient page")
	public void the_dietician_lands_on_the_new_patient_page() {
	   System.out.println("Inside Step-The Dietician lands on the New Patient page");
	}

	@When("the dietician clicks on the New Patient clickable header option in Home Page")
	public void the_dietician_clicks_on_the_new_patient_clickable_header_option_in_home_page() {
		System.out.println("Inside Step-the dietician clicks on the New Patient clickable header option in Home Page");
	}

	@Then("The dietician will be re directed to New Patient page from Dietician home page")
	public void the_dietician_will_be_re_directed_to_new_patient_page_from_dietician_home_page() {
		System.out.println("Inside Step-The dietician will be re directed to New Patient page from Dietician home page");
	}

	@Given("Dietician is on New PATIENT page")
	public void dietician_is_on_new_patient_page() {
		System.out.println("Inside Step-Dietician is on New PATIENT page");
	}

	@When("The dietician fills the patient's FULL NAME")
	public void the_dietician_fills_the_patient_s_full_name() {
		System.out.println("Inside Step-The dietician fills the patient's FULL NAME");
	}


	@When("the dietician fills the patient's Address Line 1")
	public void the_dietician_fills_the_patient_s_address_line_1() {
		System.out.println("Inside Step-The dietician fills the patient's Address line 1");
	}

	@When("The dietician fills the patient's Address line 2")
	public void the_dietician_fills_the_patient_s_address_line_2() {
		System.out.println("Inside Step-The dietician fills the patient's Address line 2");
	}

	@When("the dietician clicks the country dropdown and selects the respective patient's country")
	public void the_dietician_clicks_the_country_dropdown_and_selects_the_respective_patient_s_country() {
		System.out.println("the dietician clicks the country dropdown and selects the respective patient's country");
	}

	@When("the dietician fills the patient's City Name")
	public void the_dietician_fills_the_patient_s_city_name() {
		System.out.println("Inside Step-the dietician fills the patient's City Name");
	}

	@When("the dietician fills the patient's State name")
	public void the_dietician_fills_the_patient_s_state_name() {
		System.out.println("Inside Step-the dietician fills the patient's State name");
	}

	@When("the dietician fills the patient's Postal Code")
	public void the_dietician_fills_the_patient_s_postal_code() {
		System.out.println("Inside Step-the dietician fills the patient's Postal Code");
	}

	@When("the dietician fills the patient's Email Id")
	public void the_dietician_fills_the_patient_s_email_id() {
		System.out.println("Inside Step-the dietician fills the patient's Email Id");
	}

	@When("the dietician fills the patient's 10 digit phone number")
	public void the_dietician_fills_the_patient_s_10_digit_phone_number() {
		System.out.println("Inside Step-the dietician fills the patient's 10 digit phone number");
	}

	@When("The dietician clicks the update button")
	public void the_dietician_clicks_the_update_button() {
		System.out.println("Inside Step-The dietician clicks the update button");
	}

	@Then("the dietician will get an alert on screen saying new patient details updated")
	public void the_dietician_will_get_an_alert_on_screen_saying_new_patient_details_updated() {
		System.out.println("Inside Step-the dietician will get an alert on screen saying new patient details updated");
	}

	@When("the dietician clicks on the update health conditions button")
	public void the_dietician_clicks_on_the_update_health_conditions_button() {
		System.out.println("Inside Step-the dietician clicks on the update health conditions button");
	}

	@Then("the dietician will be re directed to the update health conditions page")
	public void the_dietician_will_be_re_directed_to_the_update_health_conditions_page() {
		System.out.println("Inside Step-the dietician will be re directed to the update health conditions page");
	}

	@Given("the system doesnt accept the new patient data")
	public void the_system_doesnt_accept_the_new_patient_data() {
		System.out.println("Inside Step-the system doesnt accept the new patient data");
	}

	@When("the dietician fills the new patient's first name and last name which are already in records")
	public void the_dietician_fills_the_new_patient_s_first_name_and_last_name_which_are_already_in_records() {
		System.out.println("Inside Step-the dietician fills the new patient's first name and last name which are already in records");
	}

	@Then("the dietician will get an alert on screen saying same first name and last name exists")
	public void the_dietician_will_get_an_alert_on_screen_saying_same_first_name_and_last_name_exists() {
		System.out.println("Inside Step-the dietician will get an alert on screen saying same first name and last name exists");
	}

	@When("the dietician doesnt fill 10 digits in the mobile number tab")
	public void the_dietician_doesnt_fill_10_digits_in_the_mobile_number_tab() {
		System.out.println("Inside Step-the dietician doesnt fill 10 digits in the mobile number tab");
	}

	@Then("the dietician will get an alert on screen saying enter valid mobile number")
	public void the_dietician_will_get_an_alert_on_screen_saying_enter_valid_mobile_number() {
		System.out.println("Inside Step-the dietician will get an alert on screen saying enter valid mobile number");
	}

	@When("the dietician doesnt fill all the tabs in the form")
	public void the_dietician_doesnt_fill_all_the_tabs_in_the_form() {
		System.out.println("Inside Step-Tthe dietician doesnt fill all the tabs in the form");
	}

	@Then("the dietician will get an alert on screen saying fill all the tabs in the form")
	public void the_dietician_will_get_an_alert_on_screen_saying_fill_all_the_tabs_in_the_form() {
		System.out.println("Inside Step-the dietician will get an alert on screen saying fill all the tabs in the form");
	}

	@When("the dietician doesnt fill valid 5 digit postal code")
	public void the_dietician_doesnt_fill_valid_5_digit_postal_code() {
		System.out.println("Inside Step-the dietician doesnt fill valid 5 digit postal code");
	}

	@Then("the dietician will get an alert on screen saying enter valid {int} digit postal code")
	public void the_dietician_will_get_an_alert_on_screen_saying_enter_valid_digit_postal_code(Integer int1) {
		System.out.println("Inside Step-the dietician will get an alert on screen saying enter valid {int} digit postal code");
	}

	@When("the dietician doesnt fill valid email address")
	public void the_dietician_doesnt_fill_valid_email_address() {
		System.out.println("Inside Step-the dietician doesnt fill valid email address");
	}

	@Then("the dietician will get an alert on scree saying enter valid email address")
	public void the_dietician_will_get_an_alert_on_scree_saying_enter_valid_email_address() {
		System.out.println("Inside Step-the dietician will get an alert on scree saying enter valid email address");
	}

	@When("the dietician fills the first name and last name as alphanumeric")
	public void the_dietician_fills_the_first_name_and_last_name_as_alphanumeric() {
		System.out.println("Inside Step-the dietician fills the first name and last name as alphanumeric");
	}

	@Then("the dietician will get an alert on screen saying invalid first name and last name should contain alphabets only")
	public void the_dietician_will_get_an_alert_on_screen_saying_invalid_first_name_and_last_name_should_contain_alphabets_only() {
		System.out.println("Inside Step-the dietician will get an alert on screen saying invalid first name and last name should contain alphabets only");
	}

	
	@Given("Dietician logged in successfully to the Dietician website")
	public void dietician_logged_in_successfully_to_the_dietician_website() {
		System.out.println("Inside Step-Dietician logged in successfully to the Dietician website");
	}

	@When("Dietician verifes Dashboard Left Side Bar")
	public void dietician_verifes_dashboard_left_side_bar() {
		System.out.println("Inside Step-Dietician verifes Dashboard Left Side Bar");
	}

	@Then("User can see Upcoming Events section in left side bar")
	public void user_can_see_upcoming_events_section_in_left_side_bar() {
		System.out.println("Inside Step-User can see Upcoming Events section in left side bar");
	}

	@When("Dietician Verifies Upcoming Event Items")
	public void dietician_verifies_upcoming_event_items() {
		System.out.println("Inside Step-Dietician Verifies Upcoming Event Items");
	}

	@Then("Dietician can see the Items of  Upcoming Events section in left side bar")
	public void dietician_can_see_the_items_of_upcoming_events_section_in_left_side_bar() {
		System.out.println("Inside Step-Dietician can see the Items of  Upcoming Events section in left side bar");
	}

	@When("Dietician verifies Dashboard Top Right Side Bar")
	public void dietician_verifies_dashboard_top_right_side_bar() {
		System.out.println("Inside Step-Dietician verifies Dashboard Top Right Side Bar");
	}

	@Then("User can see Banner or Announcements section in top right side bar")
	public void user_can_see_banner_or_announcements_section_in_top_right_side_bar() {
		System.out.println("Inside Step-User can see Banner or Announcements section in top right side bar");
	}

	@When("Dietician verifies Dashboard Bottom Right Side Bar")
	public void dietician_verifies_dashboard_bottom_right_side_bar() {
		System.out.println("Inside Step-Dietician verifies Dashboard Bottom Right Side Bar");
	}

	@Then("Dietician can see the ratio graph of enrolled patients  in bottom right side bar Recovery rate")
	public void dietician_can_see_the_ratio_graph_of_enrolled_patients_in_bottom_right_side_bar_recovery_rate() {
		System.out.println("Inside Step-Dietician can see the ratio graph of enrolled patients  in bottom right side bar Recovery rate");
	}

	@When("Dietician Verifies Total Patient")
	public void dietician_verifies_total_patient() {
		System.out.println("Inside Step-Dietician Verifies Total Patient");
	}

	@Then("Dietician can see the Total Patient count")
	public void dietician_can_see_the_total_patient_count() {
		System.out.println("Inside Step-Dietician can see the Total Patient count");
	}

	@When("Dietician verifies Verify New Patient")
	public void dietician_verifies_verify_new_patient() {
		System.out.println("Inside Step-Dietician verifies Verify New Patient");
	}

	@Then("Dietician can see the New Patient count")
	public void dietician_can_see_the_new_patient_count() {
		System.out.println("Inside Step-Dietician can see the New Patient count");
	}

	@When("Dietician Verifies Recovered Patient")
	public void dietician_verifies_recovered_patient() {
		System.out.println("Inside Step-Dietician Verifies Recovered Patient");
	}

	@Then("Dietician can see Recovered Patient count")
	public void dietician_can_see_recovered_patient_count() {
		System.out.println("Inside Step-Dietician can see Recovered Patient count");
	}

	@When("Dietician Verifies Incoming Patient History")
	public void dietician_verifies_incoming_patient_history() {
		System.out.println("Inside Step-Dietician Verifies Incoming Patient History");
	}

	@Then("Dietician can see the comparison  graph in Incoming Patient History")
	public void dietician_can_see_the_comparison_graph_in_incoming_patient_history() {
		System.out.println("Inside Step-Dietician can see the comparison  graph in Incoming Patient History");
	}
	
	
	@Given("User is on home page after login")
	public void user_is_on_home_page_after_login() {
		System.out.println("Inside Step-Dietician can see Recovered Patient count");
	}

	@When("Clicks My account icon on the menu bar")
	public void clicks_my_account_icon_on_the_menu_bar() {
		System.out.println("Inside Step-Dietician can see Recovered Patient count");
	}

	@Then("Account displays few clickable options which will be redirected to their respective pages")
	public void account_displays_few_clickable_options_which_will_be_redirected_to_their_respective_pages() {
		System.out.println("Inside Step-Dietician can see Recovered Patient count");
	}

	@When("user clicks on Test Reports option")
	public void user_clicks_on_test_reports_option() {
		System.out.println("Inside Step-user clicks on Test Reports option");
	}

	@Then("user can see the Test reports")
	public void user_can_see_the_test_reports() {
		System.out.println("Inside Step-user can see the Test reports");
	}

	@When("user clicks on Diet Plans option")
	public void user_clicks_on_diet_plans_option() {
		System.out.println("Inside Step-user clicks on Diet Plans option");
	}

	@Then("user can see all the Diet Plans")
	public void user_can_see_all_the_diet_plans() {
		System.out.println("Inside Step-user can see all the Diet Plans");
	}

	@When("user clicks on Previous Visits")
	public void user_clicks_on_previous_visits() {
		System.out.println("Inside Step-user clicks on Previous Visits");
	}

	@Then("user can see all their Previous visits")
	public void user_can_see_all_their_previous_visits() {
		System.out.println("Inside Step-user can see all their Previous visits");
	}

	@When("user clicks on Upcoming visits")
	public void user_clicks_on_upcoming_visits() {
		System.out.println("Inside Step-user clicks on Upcoming visits");
	}

	@Then("user can see all the Upcoming visits")
	public void user_can_see_all_the_upcoming_visits() {
		System.out.println("Inside Step-user can see all the Upcoming visits");
	}

	@When("user clicks on BOOK AN APPOINTMENT")
	public void user_clicks_on_book_an_appointment() {
		System.out.println("Inside Step-user clicks on BOOK AN APPOINTMENT");
	}

	@Then("user will be redirected to Book an Appointment page")
	public void user_will_be_redireted_to_book_an_appointment_page() {
		System.out.println("Inside Step-user will be redirected to Book an Appointment page");
	}

	@When("user clicks on Services")
	public void user_clicks_on_services() {
		System.out.println("Inside Step-user clicks on Services");
	}

	@Then("user can see all the services provided")
	public void user_can_see_all_the_services_provided() {
		System.out.println("Inside Step-user can see all the services provided");
	}

	@When("user clicks on Recipes")
	public void user_clicks_on_recipes() {
		System.out.println("Inside Step-user clicks on Recipes");
	}

	@Then("user can see all the recipes available")
	public void user_can_see_all_the_recipies_available() {
		System.out.println("Inside Step-user can see all the recipes available");
	}
	
	@Given("User is in Book an Appointment page")
	public void user_is_in_book_an_appointment_page() {
		System.out.println("Inside Step-User is in Book an Appointment page");
	}

	@When("User fills Patient Name column")
	public void user_fills_patient_name_column() {
		System.out.println("Inside Step-User fills Patient Name column");
	}

	@When("user fills Mobile Number Column")
	public void user_fills_mobile_number_column() {
		System.out.println("Inside Step-user fills Mobile Number Column");
	}

	@When("User selects the required date from the calendar displaying date and day")
	public void user_selects_the_required_date_from_the_calendar_displaying_date_and_day() {
		System.out.println("Inside Step-User selects the required date from the calendar displaying date and day");
	}

	@When("User clicks available time slot for the selected date")
	public void user_clicks_available_time_slot_for_the_selected_date() {
		System.out.println("Inside Step-User clicks available time slot for the selected date");
	}

	@When("the User clicks on the BOOK button")
	public void the_user_clicks_on_the_book_button() {
		System.out.println("Inside Step-the User clicks on the BOOK button");
	}

	@Then("User appointment gets booked and the screen will display an alert saying Your Appointment is booked")
	public void user_appointment_gets_booked_and_the_screen_will_display_an_alert_saying_your_appointment_is_booked() {
		System.out.println("Inside Step-User appointment gets booked and the screen will display an alert saying Your Appointment is booked");
	}

	@Given("The dietician is on the Generated Diet Plans page")
	public void the_dietician_is_on_the_generated_diet_plans_page() {
		System.out.println("Inside Step-The dietician is on the Generated Diet Plans page");
	}

	@When("the dietician fills the search fields such as patients name or email address or phone number")
	public void the_dietician_fills_the_search_fields_such_as_patients_name_or_email_address_or_phone_number() {
		System.out.println("Inside Step-the dietician fills the search fields such as patients name or email address or phone number");
	}

	@When("The dietician hits the search button")
	public void the_dietician_hits_the_search_button() {
		System.out.println("Inside Step-The dietician hits the search button");
	}

	@Then("the dietician will be re directed to the search result page with similar inputs")
	public void the_dietician_will_be_re_directed_to_the_search_result_page_with_similar_inputs() {
		System.out.println("Inside Step-the dietician will be re directed to the search result page with similar inputs");
	}

	@Given("Dietician is on New Patient Data page")
	public void dietician_is_on_new_pata_data() {
		System.out.println("Inside Step-Dietician is on New Patient Data page");
	}

	@When("The dietician fills the patient's date of birth mm dd yyyy")
	public void the_dietician_fills_the_patient_s_date_of_birth_mm_dd_yyyy() {
		System.out.println("Inside Step-The dietician fills the patient's date of birth mm dd yyyy");
	}

	@When("The dietician fills the patient's height ___ft___in")
	public void the_dietician_fills_the_patient_s_height____ft___in() {
		System.out.println("Inside Step-The dietician fills the patient's height ___ft___in");
	}

	@When("The dietician fills the patient's weight  _____lbs")
	public void the_dietician_fills_the_patient_s_weight______lbs() {
		System.out.println("Inside Step-The dietician fills the patient's weight  _____lbs");
	}
}
