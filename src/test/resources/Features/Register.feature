  @tag
   Feature: Register functionality using any other field
    
   
    Scenario: Sign up formalities	
     Given  Sign up with First Name credential
     When  User fill the valid First Name
    Given Sign up with Last Name credential	
     When User fill the Last Name
     Given Sign up with mobile no	
     When User fill the valid mobile no
     Given  Sign up with any other field as Username
     When User creates Username
     Given Signup with email	
     When User enter the valid email
     Given Sign up with password
     When User create password
      Given Sign up with all valid credentials	
     When User clicks sign up button
     Then Users should be able to sign up successfully


   Scenario: Register with invalid credentials	(-ve)
     Given Sign up formalities with one or more invalid values	
     When User try to write a numeric value in Firstname field	
     Then It should display an error Please enter a valid name
   
    Scenario:  Keeping email box empty	
     Given Sign up with empty field	
     When User leaves email field empty	
    Then It should display an alert to fill up all the mandatory fields
   
     Scenario: Gives invalid ph no 	
     Given Sign up with invalid ph no
   	When User puts 7 digit ph no 	
   	Then It should give an alert to user for using a valid ph no for the field
   	
   	 Scenario: Password could not match the criteria	
   	 Given Sign up with invalid password	
   	 When User creates shorter password than required 	
   	 Then User should get an error message password criteria did not match
   	
   	
   	 Scenario: Leaving any other field empty	
   	 Given User on sign up form page	
   	 When User leaves any other field empty	
     Then User should get an error message asking to fill all the boxes
   	
   	
   
    
   
   
   
   
   
   
   