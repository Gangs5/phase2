Feature: feature to test Login Email on signIn form

Scenario: Validating the heading on  Log in with  your email form
  
    Given User is on Dietition page to test log in with your email form
    When User is on Sign In page to test log in with your email form
    Then User should see a form with heading Log in with  your email form to sign In using email
  
  Scenario: Validating Login button on Log in with  your email form
  
    Given User is on Dietition page to test Login button
    When User is on Sign In page to test log in  button with your email form
    Then User should see a button with text Log in in the Sign In form
  
  Scenario: Validating Sign In with Email and password empty
  
    Given User is on sign In page to test Email and password empty
    When User clicks Log In button with all fields empty
    Then User gets  error message Please fill out fields in textbox
  
  Scenario: Validating Sign In with invalid email and valid password
  
    Given User is on sign In page to test invalid Email and valid password 
    When User clicks Log In button with invalid email and valid password
    Then User should see message Please fill with valid email id
  
  Scenario: Validating Sign In with valid email and invalid password
  
    Given User is on sign In page to test valid Email and invalid password 
    When User clicks Log In button with valid email and invalid password
    Then User gets a message Invalid Password Pleasetry again
    
     Scenario: Validating Sign In with valid email and empty password field
  
    Given User is on sign In page to test valid Email and empty password field
    When User clicks Log In button with valid email and empty password
    Then User gets a message Please fill the password
    
    Scenario: Validating Sign In with both invalid email and password
  
    Given User is on sign In page to test invalid Email and password 
    When User clicks Log In with both invalid email and password
    Then User gets error message message Invalid Login credentials
  
  Scenario: Validating Sign In with both valid email and password
  
    Given User is on sign In page to test valid Email and password 
    When User clicks Log In with both valid email and password
    Then User gets a message logged in successfully and sees signout button
    
    Scenario: Validating Sign In with Forgot your password
     
    Given User is on sign In page to forgot password 
    When User clicks on forgot password button
    Then User is redirected to reset password link
    
    
    Scenario: Validating Sign In with Facebook button 
     
    Given User is on sign In page to test facebook button
    When User clicks Facebook button to log in
    Then User is redirected to Facebook  login Page