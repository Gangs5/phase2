package stepdefinitions;

import io.cucumber.java.en.*;

public class ViewPDF 
{
	

@Given("User is logged on to Dietician website to validate PDF")
public void user_is_logged_on_to_dietician_website_to_validate_pdf() {
}

@Then("View PDF option is available for the generated diet plans")
public void view_pdf_option_is_available_for_the_generated_diet_plans() {
}

@Given("User is on view recent diet page to validate PDF")
public void user_is_on_view_recent_diet_page_to_validate_pdf() {
}

@When("User selects the View PDF button for a generated diet plan")
public void user_selects_the_view_pdf_button_for_a_generated_diet_plan() {
}

@Then("User should see the information in the PDF as Patient details,Doctor details,Patient health details,{int}-day menu,warnings,Comments")
public void user_should_see_the_information_in_the_pdf_as_patient_details_doctor_details_patient_health_details_day_menu_warnings_comments(Integer int1) {
}

@Given("User is logged on to Dietician website to validate PDF for a diet plan")
public void user_is_logged_on_to_dietician_website_to_validate_pdf_for_a_diet_plan() {
}

@When("User selects the view PDF button")
public void user_selects_the_view_pdf_button() {
}

@Then("User should be able to see download option for the PDF and able to download the PDF")
public void user_should_be_able_to_see_download_option_for_the_pdf_and_able_to_download_the_pdf() {
}


}
