@tag
 Feature: Patient Test Report
  
   @Test012
  Scenario: Display Patient Test Report page
   Given Dietician is on the My patients page	
   When Enters the patient name in filter and clicks search	
  Then A record of the given patient is displays here
  When Clicks View Previous Test Reports button	
  Then Dietician navigates to View Patient Test Reports page
    @Test013
  Scenario:  View Patient Test Report page
  Given Dietician is on View Patients Test report page	 
  When Dietician checks the File/Report uploaded in the Confirm health condition and create diet plan page is available in the table
 	Then File/Report displays in the table located in the View Patient Test Reports page
 	When Clicks on the view PDF button of particular patients	
 	 Then PDF file opens in separate window
 	  @Test014
 	 Scenario:  View Patient PDF file
 	 Given Dietician is on PDF file	
 	 When Dietician clicks on View PDF button available in the Diet Plan column	 
 	 Then PDF file opens in separate window
 	 When Dietician checks the Patient Details and Doctor Details and health conditionsa and 7 Days Menu warnings and comments are available in the PDF file	
   Then 	Patient Details and doctor Details and health conditions and 7 Days Menu and warnings and comments are available in the PDF file
 	
 	
 
 
 