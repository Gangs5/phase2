@tag
 Feature: Fetch patient info


    @Test005(-ve)
    Scenario:Search Filters		
    Given User is on my patients page
    When User types in anything other than 0 to 9 in phone number field
    Then It must throw error message and discontinue search action
    When User types in anything other valid character in email address field
    Then It must throw error message and discontinue search action
    When User types in anything other alphabets in name field
    Then It must throw error message and discontinue search action

   @Test006
   Scenario: Display list of patients
   Given User is on my patients 
   When User clicks on search button with all fields empty
   Then Displays all patients for that dietician only

    @Test007
   Scenario: Verify column names
   Given User is on my patients list
   When User clicks on search button with or without all fields empty
   Then It shows columns name like Record Number CustID and Name and Details and Last Visit and Actions and View Previous Test Report and View Previous Diet Plans and Create New Report or Plan
  
   @Test008
   Scenario: Verify that page needs pagiation
   Given Patients record are displayed
   When Records are more than 10
   Then It must show pagination links
    When User clicks on next pagination link
    Then It goes to next page and shows different patients on that page"
    When User clicks on previous pagination link
    Then It goes to previous page
   
   @Test009
   Scenario: Verify that each patient detail
   Given User has searched patients
   When Patients records Cust ID are displayed
   Then Customer Id is shown in column Cust ID column
    When Patients records  Name are displayed
   Then Patients name is displayed in Name column
   When Patients records are displayed
   Then Details column shows patients email or phone number or address
   When Patients records are valid date displayed
   Then Last visit date is shown in valid date format
   When Patients records valid format are displayed
   Then Verify that email address is in valid format in details cloumn

    @Test010
   Scenario: View pateints diet plans
   Given Patients records are displayed
   When User clicks on button View Previous Diet Plans
   Then It redirects user to Generated Diet Plans page
   When User clicks on button Create New Report/Plan
   Then It redirects user to Confirm Health Conditions and Generate a New Diet plan page
   
   @Test011
   Scenario: View patients previous test reports
   Given Patients records are displayed
    When User clicks on button View Previous Test Reports
    Then It redirects user to View Patient Test Reports page

 