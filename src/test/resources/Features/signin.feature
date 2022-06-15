Feature: feature to test Sign in pageTitle

  Scenario: Validating the title of sign in page
  
    Given user is on dietition website to validate sign in page
    When user click on icon symbol on sign in page
    Then user should see the title of the page signIn
    

  Scenario: Validating the Sign In page mandatory fields
  
    Given user is on dietition website to test mandatory fields on sign in page
    When user is  on sign in page to test mandatory fields
    Then User should see all mandatory fields with star symbol on top of those fields in sign in page
    
    