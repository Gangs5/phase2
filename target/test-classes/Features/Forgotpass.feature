@tag
Feature: Sign in functionality of a dietician website

   @Test020
    Scenario: Sign in	
    Given Already created user name
	  When User enters valid user name
		Given  Already created password	
	  When User enters the valid password	
    Then User should be signed in successfully
   @Test021
   Scenario: User forgot password	
   Given User is in sign in page
	 When User clicks the Forgot Password	
	 Then It should take to set new password page
	 @Test022
	 Scenario:User set new password	
	 Given User is on reset your password 
	 When page	User enters the email	
	 Then An OTP should sent to the valid email
	 @Test023
	 Scenario:User check email for OTP	
  	Given OTP in email	
	  When User enters the OTP	
	 Then User should be allowed to create a new Password
	  @Test024
	 Scenario:User setting new password	
	 Given Set password page	
	 When User creates a new Password	
	 Then User should be allowed to set new Password
	  @Test025
	  Scenario:Log in with new password	
	  Given Set password page	
	  When user clicks Login button	
	  Then User should be able to login successfully with new password
	  @Test026
	 Scenario: User not a member yet of that website	
	  Given User is in sign in page	
	  When User clicks the Not a member yet	
	  Then It should redirect user to the sign up page
	  
	 @Test027
	Scenario: Sign in with invalid credentials (_ve)	
	 Given Invalid password	
	 When User enters invalid password	
   Given Invalid user name	
   When User enters invalid user name	
	 Then User fails to sign in
	 @Test028
	Scenario:User try to sign in without sign up or registration	
	Given Unauthorised activity of user	
	When User fills sign in form	
	 Then User should get error message please register before signning in
	
	@Test029
	 Scenario:Using one valid, one invalid credentials	
	 Given User is on sign in page	
	When User enters valid username with incorrect password	
	Then User should get error message please enter valid password
	 When User enters invalid username and correct password	
	 Then User should get error message please enter valid username
	 @Test030
	Scenario:Forgot password	
	Given Forgot password page	
	When User enters an incorrect OTP	
	Then It should give an error asking user to click resend OTP button
	
	
	
	
	
	
	
	
	
