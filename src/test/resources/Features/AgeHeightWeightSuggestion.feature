Feature: New Patient Data Page new suggestions

  Scenario: Dietitian fills Patient Age,Height and Weight Data
    Given Dietitian is on New Patient Data page
    When The Dietitian fills the patient's date of birth mm dd yyyy
    When The Dietitian fills the patient's height ___ft___in
    When The Dietitian fills the patient's weight  _____lbs
    When The Dietitian fills all the other mandatory fields
    When The Dietician clicks on the Update Button
    Then The Dietician gets an alert saying New Patient details updated
