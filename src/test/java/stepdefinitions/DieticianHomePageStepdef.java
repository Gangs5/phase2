package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DieticianHomePageStepdef {

		
		@Given("The Dietitian is on Dietitian HOME PAGE")
		public void the_Dietitian_is_on_Dietitian_home_page() {

			System.out.println("Inside Step-The Dietitian is on Dietitian HOME PAGE");
		}

		@When("The Dietitian fills valid username, password")
		public void the_Dietitian_fills_valid_username_password() {
			System.out.println("Inside Step-The Dietitian fills valid username, password");
		}

		@When("clicks the logged in as Dietitian option")
		public void clicks_the_logged_in_as_Dietitian_option() {
			System.out.println("Inside Step-clicks the logged in as Dietitian option");
		}

		@When("clicks the Sign IN button")
		public void clicks_the_sign_in_button() {
			System.out.println("Inside Step-clicks the Sign IN button");
		}

		@Then("The page will be re directed to the Dietitian homepage and the username will display as Logged in as Dietitian Name")
		public void the_page_will_be_re_directed_to_the_Dietitian_homepage_and_the_username_will_display_as_logged_in_as_Dietitian_name() {
			System.out.println("Inside Step-The page will be re directed to the Dietitian homepage and the username will display as Logged in as Dietitian Name");
		}

		
		@Given("The Dietitian is on Dietitian HOME PAGE Top Panel Section")
		public void the_Dietitian_is_on_Dietitian_home_page_top_panel_section() {
		    System.out.println("Inside Step-The Dietitian is on Dietitian HOME PAGE Top Panel Section");
		}


		@When("The Dietitian Home Page contains company logo and an image")
		public void the_Dietitian_home_page_contains_company_logo_and_an_image() {
			System.out.println("Inside Step-The Dietitian Home Page contains company logo and an image");
		}
		  

		@Then("The Dietitian will see logo and image")
		public void the_Dietitian_will_see_logo_and_image() {
		 System.out.println("Inside Step-The Dietitian will see logo and image");
		}

		@When("The Dietitian Home page contains few clickable header options such as HOME,NEW PATIENT,MY PATIENT,DIET PLAN")
		public void the_Dietitian_home_page_contains_few_clickable_header_options_such_as_home_new_patient_my_patient_diet_plan() {
		   System.out.println("Inside Step-The Dietitian Home page contains few clickable header options such as HOME,NEW PATIENT,MY PATIENT,DIET PLAN");
		}

		@Then("The Dietitian will be re directed to the respective pages upon a click")
		public void the_Dietitian_will_be_re_directed_to_the_respective_pages_upon_a_click() {
		   System.out.println("Inside Step-The Dietitian will be re directed to the respective pages upon a click");
		
	}


		@Given("Dietitian is on body of Dietitian HOME PAGE")
		public void Dietitian_is_on_body_of_Dietitian_home_page() {
		   System.out.println("Inside Step-Dietitian is on body of Dietitian HOME PAGE");
		}

		@When("The Dietitian Home page contains Company banner and important Announcements")
		public void the_Dietitian_home_page_contains_company_banner_and_important_announcements() {
		   System.out.println("Inside Step-The Dietitian Home page contains Company banner and important Announcements");
		}

		@Then("The Dietitian will see all the important announcements upon login")
		public void the_Dietitian_will_see_all_the_important_announcements_upon_login() {
		    System.out.println("Inside Step-The Dietitian will see all the important announcements upon login");
		}

		@Given("Dietitian is Signing Out")
		public void Dietitian_is_signing_out() {
		    System.out.println("Inside Step-Dietitian is Signing Out");
		}

		@When("The Dietitian home page top panel contains a SIGN OUT clickable button")
		public void the_Dietitian_home_page_top_panel_contains_a_sign_out_clickable_button() {
		   System.out.println("Inside Step-The Dietitian home page top panel contains a SIGN OUT clickable button");
		}

		@Then("The Dietitian Signs out of the portal upon the click")
		public void the_Dietitian_signs_out_of_the_portal_upon_the_click() {
		    System.out.println("Inside Step-The Dietitian Signs out of the portal upon the click");
		}
		
		
		}




