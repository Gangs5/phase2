Feature: Register functionality of a Dietician website

 
  @TestWithValidCredentials
  Scenario: Validating the Signup form with valid credentials
   Given User is on register page to Signup
   When User enters the user first name last name valid mobile number and password
   Then User clicks on Signup 
   When User navigates to Next page 
   Then User is able to signup successfully
   
   @TestWithEmail
   Scenario: Sign Up with an email Option
   Given User On SignUp form with an Email Option
   When User enters all the valid values in the respective options
   Then User is successfully redirected to Signin page
      
   
   @NegativeTest1
   Scenario: Validating the signup form with all fields empty
  
    Given User is on register page 
    When User clicks on signup button with all fields empty
    Then User should see the message that Mandatory fields cannot be empty
    
    @NegativeTest2
    Scenario: Validating the signup form with invalid name
  
    Given User is on register page to signup with invalid name
    When User clicks SIGN UP button in the Sign Up form  by entering numeric text for First Name valid values for the remaining fields
    Then User should see a message Invalid data entered for First Name
    
     @NegativeTest3
    Scenario: Validating the signup form with invalid last name
  
    Given User is on register page to signup with invalid last name
    When User clicks SIGN UP button in the Sign Up form  by entering numeric text for last Name valid values for the remaining fields
    Then User should see a message Invalid data entered for last name
    
      
     @NegativeTest4
    Scenario: Validating the signup form with invalid mobile number
  
    Given User is on register page to signup with invalid mobile number
    When User clicks SIGN UP button in the Sign Up form  by entering alphanumeric text for mobile number field and valid values for the remaining fields
    Then User should see a message Invalid data entered for mobile number
    
      @NegativeTest5
    Scenario: Validating the signup form with invalid anyother field
  
    Given User is on register page to signup with invalid anyother field
    When User clicks SIGN UP button in the Sign Up form  by entering numeric values for anyother field and valid values for the remaining fields
    Then User should see a message Invalid data entered for anyother field
    
      @NegativeTest6
    Scenario: Validating the signup form with invalid email id field
  
    Given User is on register page to signup with invalid email id  field
    When User clicks SIGN UP button in the Sign Up form  by entering invalid email id  and valid values for the remaining fields
    Then User should see a message Invalid data entered for email id  field
    
      @NegativeTest7
    Scenario: Validating the signup form with invalid password 
  
    Given User is on register page to signup with invalid password  field
    When User clicks SIGN UP button in the Sign Up form  by entering invalid password  and valid values for the remaining fields
    Then User should see a message Invalid data entered forpassword field
    
      @NegativeTest8
    Scenario: Validating the signup form with all fields empty on sign up with email id form 
  
    Given User is on register page to signup with all fields empty on email sign up form
    When User clicks SIGN UP button in the Sign Up form  by leaving all fields empty on email signup form
    Then User should see a message cannot be empty
    
    
      @NegativeTest9
    Scenario: Validating the signup form with invalid name on sign up with email id form 
  
    Given User is on register page to signup with invalid name  on email sign up form
    When User clicks SIGN UP button in the Sign Up form by entering invalid name  on email signup form
    Then User should see a message invalid data entered for name
    
       @NegativeTest10
    Scenario: Validating the signup form with invalid last name on sign up with email id form 
  
    Given User is on register page to signup with invalid last name  on email sign up form
    When User clicks SIGN UP button in the Sign Up form by entering invalid last name  on email signup form
    Then User should see a message invalid data entered for last name on email sign up form
    
       @NegativeTest11
    Scenario: Validating the signup form with invalid UserName on sign up with email id form 
  
    Given User is on register page to signup with invalid UserName  on email sign up form
    When User clicks SIGN UP button in the Sign Up form by entering invalid UserName  on email signup form
    Then User should see a message invalid data entered for UserName on email sign up form
    
       @NegativeTest12
    Scenario: Validating the signup form with invalid Email Address on sign up with email id form 
  
    Given User is on register page to signup with invalid Email Address  on email sign up form
    When User clicks SIGN UP button in the Sign Up form by entering invalid Email Address on email signup form
    Then User should see a message invalid data entered for Email Address on email sign up form
    
       @NegativeTest13
    Scenario: Validating the signup form with invalid Password on sign up with email id form 
  
    Given User is on register page to signup with invalid Password  on email sign up form
    When User clicks SIGN UP button in the Sign Up form by entering invalid Password  on email signup form
    Then User should see a message invalid data entered for Password on email sign up form
    
       @NegativeTest14
    Scenario: Validating the signup form with invalid confirm Password on sign up with email id form 
  
    Given User is on register page to signup with invalid confirm Password  on email sign up form
    When User clicks SIGN UP button in the Sign Up form by entering invalid confirm Password on email signup form
    Then User should see a message invalid data entered for confirm Password on email sign up form
    
    
    
   
   