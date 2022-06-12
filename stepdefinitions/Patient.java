package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Patient {


@Given("User is on any page after login")
public void user_is_on_any_page_after_login() {
	 System.out.println("User is on any page after login");  
}

@When("User clicks on {string} tab")
public void user_clicks_on_tab(String string) {
	 System.out.println("patient tab clicking");
}


@Then("It shows breadcrubs as Dietician Software MyPatients")
public void it_shows_breadcrubs_as_dietician_software_my_patients() {
	 System.out.println("It shows breadcrubs as Dietician Software and MyPatients");
}

}
