package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScreensDietician_steps {
	
	@Given("User is on dietician page")
	public void user_is_on_dietician_page() {
	   System.out.println("in stepdefinition-User is on dietician page");
	}

	@When("User clicks dietician link")
	public void user_clicks_dietician_link() {
	   System.out.println("in stepdefinition-User clicks dietician link");
	}

	@Then("User should see dietician page")
	public void user_should_see_dietician_page() {
	   System.out.println("in stepdefinition-User should see dietician page");
	}

	@Given("User is on view recent diets page")
	public void user_is_on_view_recent_diets_page() {
	    System.out.println("in stepdefinition-User is on view recent diets page");
	}

	@When("User clicks the view recent diets")
	public void user_clicks_the_view_recent_diets() {
	   System.out.println("in stepdefinition-User clicks the view recent diets");
	}

	@Then("User should see  recent diets")
	public void user_should_see_recent_diets() {
	   System.out.println("in stepdefinition-User should see  recent diets");
	}

	@Given("User is on view recent test reports page")
	public void user_is_on_view_recent_test_reports_page() {
	  System.out.println("in stepdefinition-User is on view recent test reports page");
	}

	@When("User clicks view recent test reports")
	public void user_clicks_view_recent_test_reports() {
	   System.out.println("in stepdefinition-User clicks view recent test reports");
	}

	@Then("User should see view recent test reports")
	public void user_should_see_view_recent_test_reports() {
	   System.out.println("in stepdefinition-User should see view recent test reports");
	}

	@Given("User on new patient page")
	public void user_on_new_patient_page() {
	    System.out.println("in stepdefinition-User on new patient page");
	}

	@When("User clicks new patient button")
	public void user_clicks_new_patient_button() {
	    System.out.println("in stepdefinition-User clicks new patient button");
	}

	@Then("it should display new patient details")
	public void it_should_display_new_patient_details() {
	  System.out.println("in stepdefinitiopn-it should display new patient details");
	}

	@When("User clicks dietician home")
	public void user_clicks_dietician_home() {
	   System.out.println("in stepdefinition-User clicks dietician home");
	}

	@Then("User should go to dietician home page")
	public void user_should_go_to_dietician_home_page() {
	  System.out.println("in stepdefinition-User should go to dietician home page");
	}

	@When("User clicks my patient")
	public void user_clicks_my_patient() {
	  System.out.println("in stepdefinition-User clicks my patient");
	}

	@Then("It should display my patient")
	public void it_should_display_my_patient() {
	   System.out.println("in stepdefinition-It should display my patient");
	}

	@When("User clicks Confirm conditions and create diet plan")
	public void user_clicks_confirm_conditions_and_create_diet_plan() {
	  System.out.println("in stepdefinition- user clicks confirm conditions");
	}

	@Then("User should see Confirm conditions and create diet plan page")
	public void user_should_see_confirm_conditions_and_create_diet_plan_page() {
	    System.out.println("in stepdefinition-User should see Confirm conditions and create diet plan page");	
	    }

}
