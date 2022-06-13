Feature: Signup using Facebook button

  Scenario: Validating the Sign up process with Facebook
    Given User is on Register page to signup with facebook
    When User clicks Facebook button in the Sign Up with your Email form
    Then User successfully login with Facebook account

