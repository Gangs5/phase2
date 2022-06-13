Feature: Dietician specific screens

  Scenario: Validating dietician page
    Given User is on dietician page
    When User clicks dietician link
    Then User should see dietician page

  Scenario: View recent diets
    Given User is on view recent diets page
    When User clicks the view recent diets
    Then User should see  recent diets

  Scenario: Validating view recent test reports
    Given User is on view recent test reports page
    When User clicks view recent test reports
    Then User should see view recent test reports

  Scenario: Lists on the menu
    Given User on new patient page
    When User clicks new patient button
    Then it should display new patient details
    When User clicks dietician home
    Then User should go to dietician home page
    When User clicks my patient
    Then It should display my patient
    When User clicks Confirm conditions and create diet plan
    Then User should see Confirm conditions and create diet plan page
