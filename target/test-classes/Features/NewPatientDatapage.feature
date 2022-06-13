Feature: NEW PATIENT PAGE

  @ValidatingNewPatientpage
  Scenario: Dietician is on New PATIENT page
    Given The Dietician lands on the New Patient page
    When the dietician clicks on the New Patient clickable header option in Home Page
    Then The dietician will be re directed to New Patient page from Dietician home page

  @NewPatientdatafilling
  Scenario: Filling New Patient Data
    Given Dietician is on New PATIENT page
    When The dietician fills the patient's FULL NAME
    When The dietician fills the patient's date of birth mm dd yyyy
    When The dietician fills the patient's height ___ft___in
    When The dietician fills the patient's weight  _____lbs
    When the dietician fills the patient's Address Line 1
    When The dietician fills the patient's Address line 2
    When the dietician clicks the country dropdown and selects the respective patient's country
    When the dietician fills the patient's City Name
    When the dietician fills the patient's State name
    When the dietician fills the patient's Postal Code
    When the dietician fills the patient's Email Id
    When the dietician fills the patient's 10 digit phone number
    When The dietician clicks the update button
    Then the dietician will get an alert on screen saying new patient details updated
    When the dietician clicks on the update health conditions button
    Then the dietician will be re directed to the update health conditions page

  @Failscenario
  Scenario: filling New Patient data fails(-ve)
    Given the system doesnt accept the new patient data
    When the dietician fills the new patient's first name and last name which are already in records
    Then the dietician will get an alert on screen saying same first name and last name exists
    When the dietician doesnt fill 10 digits in the mobile number tab
    Then the dietician will get an alert on screen saying enter valid mobile number
    When the dietician doesnt fill all the tabs in the form
    Then the dietician will get an alert on screen saying fill all the tabs in the form
    When the dietician doesnt fill valid 5 digit postal code
    Then the dietician will get an alert on screen saying enter valid 5 digit postal code
    When the dietician doesnt fill valid email address
    Then the dietician will get an alert on scree saying enter valid email address
    When the dietician fills the first name and last name as alphanumeric
    Then the dietician will get an alert on screen saying invalid first name and last name should contain alphabets only
