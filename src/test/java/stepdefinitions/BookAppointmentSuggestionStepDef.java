package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookAppointmentSuggestionStepDef {

	
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
	
	
}
