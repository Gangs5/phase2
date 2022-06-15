package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountuserstepdef {

	
	@Given("User is on home page after login")
	public void user_is_on_home_page_after_login() {
		System.out.println("Inside Step-Dietitian can see Recovered Patient count");
	}

	@When("Clicks My account icon on the menu bar")
	public void clicks_my_account_icon_on_the_menu_bar() {
		System.out.println("Inside Step-Dietitian can see Recovered Patient count");
	}

	@Then("Account displays few clickable options which will be redirected to their respective pages")
	public void account_displays_few_clickable_options_which_will_be_redirected_to_their_respective_pages() {
		System.out.println("Inside Step-Dietitian can see Recovered Patient count");
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

	@Then("user will be redireted to Book an Appointment page")
	public void user_will_be_redireted_to_book_an_appointment_page() {
	 System.out.println("Inside Step-user will be redireted to Book an Appointment page");  
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
	public void user_can_see_all_the_recipes_available() {
	  System.out.println("Inside Step-user can see all the recipes available");
	}

	
}
