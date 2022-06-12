package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPatient {


@When("User clicks on My Patients tab")
public void user_clicks_on_my_patients_tab() {
	//System.out.println("User clicks on My Patients tab");  
}

@Then("Name email and phone number filter options and search button are displayed")
public void name_email_and_phone_number_filter_options_and_search_button_are_displayed() {
//	System.out.println("Name,email and phone number are displayed");  
}

@Given("User is logged in")
public void user_is_logged_in() {
	//System.out.println("User is logged in");   
}


@Then("Button used for search has text as Search")
public void button_used_for_search_has_text_as_search() {
	//System.out.println("Button used for search has text as Search");   
}

@When("User starts typing inside name filter box")
public void user_starts_typing_inside_name_filter_box() {
	//System.out.println("User starts typing inside name filter box");   
}

@Then("Text inside name filter box should disappear")
public void text_inside_name_filter_box_should_disappear() {
	//System.out.println("Text inside name filter box should disappear");   
}

@When("User starts typing inside email address filter box")
public void user_starts_typing_inside_email_address_filter_box() {
	//System.out.println("User starts typing inside email address filter box");   
}

@Then("Text inside email address filter box should disappear")
public void text_inside_email_address_filter_box_should_disappear() {
	//System.out.println("Text inside email address filter box should disappear");   
}

@When("User starts typing inside phone number filter box")
public void user_starts_typing_inside_phone_number_filter_box() {
	//System.out.println("User starts typing inside phone number filter box");   
}

@Then("Text inside phone number filter box should disappear")
public void text_inside_phone_number_filter_box_should_disappear() {
	//System.out.println("Text inside phone number filter box should disappear");   
}

@Given("User is on my patients")
public void user_is_on_my_patients() {
	//System.out.println("User is on my patients");   
}

@When("User clicks on search with name phrase into name filter box")
public void user_clicks_on_search_with_name_phrase_into_name_filter_box() {
	//System.out.println("User clicks on search with name phrase into name filter box");
}

@Then("Records for name phrase are shown")
public void records_for_name_phrase_are_shown() {
	//System.out.println("Records for name phrase are shown"); 
}

@When("User clicks on search with email phrase into email address filter")
public void user_clicks_on_search_with_email_phrase_into_email_address_filter() {
	//System.out.println("User clicks on search with email phrase into email address filter"); 
}

@Then("Records for email phrase are shown")
public void records_for_email_phrase_are_shown() {
	//System.out.println("Records for email phrase are shown"); 
}

@When("User clicks on search with phone number into phone number filter")
public void user_clicks_on_search_with_phone_number_into_phone_number_filter() {
	//System.out.println("User clicks on search with phone number into phone number filter");
}

@Then("Records for phone number are shown")
public void records_for_phone_number_are_shown() {
	//System.out.println("Phone number are shown");
}


}


/*@When("User is on my patients")
public void user_is_on_my_patients() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}*/
