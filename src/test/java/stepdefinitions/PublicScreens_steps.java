package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PublicScreens_steps {
	
	@Given("User is on public page")
	public void user_is_on_public_page() {
	   System.out.println("in stepdefinition-User is on public page");
	}

	@When("User opens the browser")
	public void user_opens_the_browser() {
	    System.out.println("in stepdefinition-User opens the browser");
	}

	@Then("User navigates to the public page")
	public void user_navigates_to_the_public_page() {
	    System.out.println("in stepdefinition-User navigates to the public page");
	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
	   System.out.println("in stepdefinition-User is on home page");
	}

	@When("User clicks the user sign in button")
	public void user_clicks_the_user_sign_in_button() {
	    System.out.println("in stepdefinition-User clicks the user sign in button");
	}

	@Then("User should be directed to the sign in page")
	public void user_should_be_directed_to_the_sign_in_page() {
	   System.out.println("in stepdefinition-User should be directed to the sign in page");
	}

	@When("User clicks Register link")
	public void user_clicks_register_link() {
	   System.out.println("in stepdefinition-User clicks Register link");
	}

	@Then("User should be redirected to the registration page")
	public void user_should_be_redirected_to_the_registration_page() {
	   System.out.println("in stepdefinition-User should be redirected to the registration page");
	}

	@When("User clicks TEAM tab")
	public void user_clicks_team_tab() {
	   System.out.println("in stepdefinion-User clicks TEAM tab");
	}

	@Then("It should display the page with three doctors or dieticians name and details")
	public void it_should_display_the_page_with_three_doctors_or_dieticians_name_and_details() {
	  System.out.println("in stepdefinition-It should display the page with three doctors or dieticians name and details");
	}

	@When("User clicks clients button")
	public void user_clicks_clients_button() {
	    System.out.println("in stepdefinition-User clicks clients button");
	}

	@Then("User should take to the clients testimonial page")
	public void user_should_take_to_the_clients_testimonial_page() {
	   System.out.println("in stepdefinition-User should take to the clients testimonial page");
	}

	@When("User clicks > button")
	public void user_clicks_button() {
	    System.out.println("in stepdefinion-User clicks > button");
	}

	@Then("User should be on the second page of client testimonial")
	public void user_should_be_on_the_second_page_of_client_testimonial() {
	   System.out.println("in stepdefinition-User should be on the second page of client testimonial");
	}

	@When("User clicks the > button")
	public void user_clicks_the_button() {
	   System.out.println("in stepdefinition-User clicks the > button");
	}

	@Then("User should be on the last page of client testimonial")
	public void user_should_be_on_the_last_page_of_client_testimonial() {
	   System.out.println("in stepdefinition-User should be on the last page of client testimonial");
	}

	@Given("User is on sing in page")
	public void user_is_on_sing_in_page() {
	   System.out.println("in stepdefinion-User is on sing in page");
	}

	@When("User clicks Forgot Password button")
	public void user_clicks_forgot_password_button() {
	    System.out.println("in stepdefinition-User clicks Forgot Password button");
	}

	@Then("User should be taken to the forgot password specific page")
	public void user_should_be_taken_to_the_forgot_password_specific_page() {
	   System.out.println("in stepdefinition-User should be taken to the forgot password specific page");
	}

	@When("User clicks the Product feature button")
	public void user_clicks_the_product_feature_button() {
	   System.out.println("in stepdefinition-User clicks the Product feature button");
	}

	@Then("User should be navigated to the page where product feature page")
	public void user_should_be_navigated_to_the_page_where_product_feature_page() {
	   System.out.println("in stepdefinition-User should be navigated to the page where product feature page");
	}

	@When("User clicks Contact")
	public void user_clicks_contact() {
	   System.out.println("in stepdefinition-User clicks Contact");
	}

	@Then("It should display Contact page")
	public void it_should_display_contact_page() {
	   System.out.println("in stepdefinition-It should display Contact page");
	}

	@When("User clicks the Blogs link")
	public void user_clicks_the_blogs_link() {
	   System.out.println("in stepdefinition-User clicks the Blogs link");
	}

	@Then("It should display Blogs page")
	public void it_should_display_blogs_page() {
	    System.out.println("in stepdefinition-It should display Blogs page");
	}

	@When("User is on blogs page")
	public void user_is_on_blogs_page() {
	    System.out.println("in stepdefinition-User is on blogs page");
	}

	@Then("User should see blogs written onthe page")
	public void user_should_see_blogs_written_onthe_page() {
	    System.out.println("in stepdefinition-User should see blogs written onthe page");
	}

	@When("User clicks Fearured Content")
	public void user_clicks_fearured_content() {
	    System.out.println("in stepdefinition-User clicks Fearured Content");
	}

	@Then("It should display featured content page")
	public void it_should_display_featured_content_page() {
	   System.out.println("in stepdefinition-It should display featured content page");
	}



}
