Feature: HomePage of the Dietician website

  Scenario: Validating title of homepage
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see the public page

  Scenario: Verifying the logo on the Home page
    Given User is on the public page
    When User navigates to this page from any browser
    Then User should see a logo with the company name on the home page

  Scenario: Homepage contains few tabs and icons on the menu bar
    Given User on Homepage
    When User navigates to the homepage
    Then User should see a menu bar which contains few tabs along with a search icon, my account icon and a menu bar icon
