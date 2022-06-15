package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AgeHeightWeightSuggestionStepDef {

	
	
	@Given("Dietitian is on New Patient Data page")
	public void Dietitian_is_on_new_pata_data() {
		System.out.println("Inside Step-Dietitian is on New Patient Data page");
	}

	@When("The Dietitian fills the patient's date of birth mm dd yyyy")
	public void the_Dietitian_fills_the_patient_s_date_of_birth_mm_dd_yyyy() {
		System.out.println("Inside Step-The Dietitian fills the patient's date of birth mm dd yyyy");
	}

	@When("The Dietitian fills the patient's height ___ft___in")
	public void the_Dietitian_fills_the_patient_s_height____ft___in() {
		System.out.println("Inside Step-The Dietitian fills the patient's height ___ft___in");
	}

	@When("The Dietitian fills the patient's weight  _____lbs")
	public void the_Dietitian_fills_the_patient_s_weight______lbs() {
		System.out.println("Inside Step-The Dietitian fills the patient's weight  _____lbs");
	}
	
	
	@When("The Dietitian fills all the other mandatory fields")
	public void the_dietitian_fills_all_the_other_mandatory_fields() {
		System.out.println("Inside Step-The Dietitian fills all the other mandatory fields");

	}

	@When("The Dietician clicks on the Update Button")
	public void the_dietician_clicks_on_the_update_button() {
		System.out.println("Inside Step-The Dietician clicks on the Update Button");

	}

	@Then("The Dietician gets an alert saying New Patient details updated")
	public void the_dietician_gets_an_alert_saying_new_patient_details_updated() {
		System.out.println("Inside Step-The Dietician gets an alert saying New Patient details updated");

	}


}
