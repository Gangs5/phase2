Feature: New Patient Data Page suggestions

  Scenario: Dietician fills Patient Age,Height and Weight Data
  
    Given Dietician is on New Patient Data page
    When The dietician fills the patient's date of birth mm dd yyyy
    When The dietician fills the patient's height ___ft___in
    When The dietician fills the patient's weight  _____lbs
