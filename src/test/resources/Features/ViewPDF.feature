Feature: View PDF

  Scenario: Validation of View PDF option
    Given User is logged on to Dietician website to validate PDF
    When User is on View Recent Diets Page
    Then View PDF option is available for the generated diet plans

  Scenario: Validation of generation of PDF
    Given User is on view recent diet page to validate PDF
    When User selects the View PDF button for a generated diet plan
    Then User should see the information in the PDF as Patient details,Doctor details,Patient health details,7-day menu,warnings,Comments

  Scenario: Validation of download PDF option for a diet plan
    Given User is logged on to Dietician website to validate PDF for a diet plan
    When User selects the view PDF button
    Then User should be able to see download option for the PDF and able to download the PDF
