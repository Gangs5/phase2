@featureTest
Feature: feature to test create new  Diet plan

@Scenario1
  Scenario: Validating the heading 
  
    Given User is logged on to Dietition website to validate heading
    When User lands on Create Plan page to validate heading
    Then User sees the heading Confirm Health Conditions and Generate a new Diet Plan on the page 
    
    @Scenario2
  Scenario: Validating the Browse button visibility
  
    Given User is logged on to Dietician website to browse button viibility
    When User lands on Create Plan page to test browse button
    Then User should see a button with name Browse on the page
    
    @Scenario3
  Scenario: Validating the Browse button tool tip option
  
    Given User is logged on to Dietician website to browse button tool tip option
    When User lands on Create Plan page to test browse button tool tip option
    Then User should see a tool tip PDF files only for the Browse button
    
    @Scenario4
  Scenario: Validating the Browse button operation
  
    Given User is logged on to Create plan page to test browse button operation
    When User clicks the Browse button and selects a document
    Then User should see the selected document in the field next to the Browse button on the page
    
    
    