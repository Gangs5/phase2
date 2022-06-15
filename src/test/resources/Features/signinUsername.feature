Feature: feature to test Sign with username

  Scenario: Validating the Sign In form heading
  
    Given user is on dietition website to test sign In form heading
    When user is on sign in page to test sign In form heading
    Then User should see a form with heading Sign In form to sign In using Username
    
    Scenario: Validating Sign In button
  
    Given user is on dietition website to test sign In button
    When user is on sign in page to test sign In button
    Then User should see a button with text SIGN IN in the Sign In form
    
    Scenario: Validating Sign In Process with all fields empty
  
    Given user is on sign in page to test with all fields empty
    When User clicks Sign In Button in the Sign In form with all fields empty 
    Then User should get error message Please fill out the fields
    
    Scenario: Validating Sign In Process with invalid FirstName
  
    Given user is on sign In page to test invalid FirstName
    When User clicks Sign In button entering numeric values for Username and valid values for password
    Then User should get a message Invalid entry for first field
 
 Scenario: Validating Sign In process with invalid password

    Given user is on sign in page to test with invalid password
    When User clicks Sign In button entering extra length of password 
    Then User should get a message Invalid entry for password field
    
    Scenario: Validating Sign In with both invalid username and password

    Given user is on sign in page to test with username and password
    When User clicks Sign In button entering invalid values for both fields
    Then User should get error message Invalid login credentials
    
    
    Scenario: Validating Sign In with Forgot password button
  
    Given user is on sign In page to test forgot password button
    When User clicks on Forgot Password button
    Then User should be directed to  Reset password link
    
    
    Scenario: Validating Sign In with Not member Yet button
  
    Given user is on sign In page to Not member Yet button
    When User clicks on not member yet button
    Then User will land on Register Page on dietition website
    
Scenario: Validating Sign In with all fields valid entry
  
    Given User is on sign In page to test all fields valid entry
    When Validating Sign In with all fields valid entry
    Then User logged into sign in page successfully 
    
   
    
    
    
    
    