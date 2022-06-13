Feature: Generate Menu button on Create Plan page

  Scenario: Validating the Generate Menu button visibility
    Given User is logged on to Dietician website
    When User lands on Confirm conditions and Create Plan page
    Then User should see a button with text GENERATE MENU  at the bottom of the page

  Scenario: Validating the Generate Menu button operation
    Given User is on create plan page to click on menu button
    When User clicks the GENERATE MENU button
    Then New Diet plan should be generated with the latest confirmed Health conditions

  Scenario: Validating the Generate Menu button operation to land on view recent diets page
    Given User is on create plan page to click on menu button to land on view recent diets page
    When User clicks the GENERATE MENU button to land on view recent diets page
    Then User should land on View Recent Diets page
