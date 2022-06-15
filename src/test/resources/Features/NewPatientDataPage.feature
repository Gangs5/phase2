Feature: NEW PATIENT PAGE

  @ValidatingNewPatientpage
  Scenario: Dietitian is on New PATIENT page
    Given The Dietitian lands on the New Patient page
    When the Dietitian clicks on the New Patient clickable header option in Home Page
    Then The Dietitian will be re directed to New Patient page from Dietitian home page

  @NewPatientdatafilling
  Scenario: Filling New Patient Data
    Given Dietitian is on New PATIENT page
    When The Dietitian fills the patient's FULL NAME
    When the Dietitian fills the patient's Address Line 1
    When The Dietitian fills the patient's Address line 2
    When the Dietitian clicks the country dropdown and selects the respective patient's country
    When the Dietitian fills the patient's City Name
    When the Dietitian fills the patient's State name
    When the Dietitian fills the patient's Postal Code
    When the Dietitian fills the patient's Email Id
    When the Dietitian fills the patient's 10 digit phone number
    When The Dietitian clicks the update button
    Then the Dietitian will get an alert on screen saying new patient details updated
    When the Dietitian clicks on the update health conditions button
    Then the Dietitian will be re directed to the update health conditions page

  @Failscenario
  Scenario: filling New Patient data fails(-ve)
    Given the system doesnt accept the new patient data
    When the Dietitian fills the new patient's first name and last name which are already in records
    Then the Dietitian will get an alert on screen saying same first name and last name exists
    When the Dietitian doesnt fill 10 digits in the mobile number tab
    Then the Dietitian will get an alert on screen saying enter valid mobile number
    When the Dietitian doesnt fill all the tabs in the form
    Then the Dietitian will get an alert on screen saying fill all the tabs in the form
    When the Dietitian doesnt fill valid 5 digit postal code
    Then the Dietitian will get an alert on screen saying enter valid 5 digit postal code
    When the Dietitian doesnt fill valid email address
    Then the Dietitian will get an alert on scree saying enter valid email address
    When the Dietitian fills the first name and last name as alphanumeric
    Then the Dietitian will get an alert on screen saying invalid first name and last name should contain alphabets only
