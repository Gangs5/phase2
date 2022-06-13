Feature: Lists of screens for Users, Dieticians and clients access

  Scenario: Validating the Public section on list of screens
    Given User is on public page
    When User opens the browser
    Then User navigates to the public page

  Scenario: Screens avalable in the drop down menu
    Given User is on home page
    When User clicks the user sign in button
    Then User should be directed to the sign in page
    When User clicks Register link
    Then User should be redirected to the registration page
    When User clicks TEAM tab
    Then It should display the page with three doctors or dieticians name and details

  Scenario: CLIENTS on homepage menu bar
    Given User is on home page
    When User clicks clients button
    Then User should take to the clients testimonial page
    When User clicks > button
    Then User should be on the second page of client testimonial
    When User clicks the > button
    Then User should be on the last page of client testimonial

  Scenario: Other screens on the menu
    Given User is on sing in page
    When User clicks Forgot Password button
    Then User should be taken to the forgot password specific page
    When User clicks the Product feature button
    Then User should be navigated to the page where product feature page
    When User clicks Contact
    Then It should display Contact page
    When User clicks the Blogs link
    Then It should display Blogs page
    When User is on blogs page
    Then User should see blogs written onthe page
    When User clicks Fearured Content
    Then It should display featured content page
