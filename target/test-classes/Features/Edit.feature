@tag
Feature: Edit patient report

   @Test015
  Scenario: Validate VIEW/EDIT/CREATE buttons are visible for the patient with their health conditions are not confirmed	
   Given Dietician naviagates to My Patients screen	
   When Dietician enters patient name and clicks search button	
   Then Patient details for the given name is displays in the My Patients screen
   When Dietician checks  VIEW PREVIOUS TEST REPORTand PLANS and CREATE NEW REPORT and PLAN and EDIT PREVIOUS REPORT and PLAN buttons
   Then VIEW PREVIOUS TEST REPORT and PLAN and CREATE NEW REPORT and PLAN buttons  EDIT PREVIOUS REPORT and PLAN buttons displays in the My Patients screen
    @Test016
   Scenario: Validate user is able to Edit the Diet plan when the health conditions are not confirmed	
    Given Dietician is on My Patients screen	
     When Dietician clicks EDIT PREVIOUS REPORT/PLAN button	
     Then  Dietician navigates to Confirm Health conditions and Generate a new Diet plan
     @Test017
   Scenario: Validate the health conditions and co - morbidis and preferences are preselected based on its created	
    Given Dietician is on Confirm Health Conditions and Generate a new Diet Plan page	
    When Dietician gets the page with pre selections of health conditionsa andCo-Morbidities and Preference	
    Then  health conditions and Co-Morbidities and Preference are preselected based on the report and Menu created
    When Dietician changes the condition and Co Morbidities and preference	
    Then changed condition and Co Morbidities and preferences appears on the screen along with the previous selection
    @Test018
   Scenario: Confirm Health Conditions and Generate a new Diet Plan
   Given Dietician is on Confirm Health Conditions and Generate a new Diet Plan page	
    When Clicks both of the confirm buttons	
    Then Confirm button turns into Confirmed and authenticiated with the message Health conditions and Co Morbidities and preferences are confirmed
    When Clicks GENERATE MENU button	Diet plan 
    Then updated and authendicated with the message Report and Diet Plan is updated successfully

    @Test019
   Scenario: Validate Dietician could not edit the health conditions and Diet plans for a patient has confirmed health conditions	
    Given Dietician navigates to My Patients screen	
     When Enters patient name and hit the search button	
    Then Patient details for the given name is displays in the My Patients screen
    When Dietician gets VIEW PREVIOUS TEST REPORT and  VIEW PREVIOUS DIET PLANS and CREATE NEW REPORT or  PLAN buttons
 	   Then EDIT PREVIOUS REPORT/PLAN button is not displays on the screen


