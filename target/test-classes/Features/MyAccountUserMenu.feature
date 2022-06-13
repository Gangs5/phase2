Feature: My Account(User) Menu page

  Scenario: options in My Account (User)Menu page after login
    Given User is on home page after login
    When Clicks My account icon on the menu bar
    Then Account displays few clickable options which will be redirected to their respective pages
    When user clicks on Test Reports option
    Then user can see the Test reports
    When user clicks on Diet Plans option
    Then user can see all the Diet Plans
    When user clicks on Previous Visits
    Then user can see all their Previous visits
    When user clicks on Upcoming visits
    Then user can see all the Upcoming visits
    When user clicks on BOOK AN APPOINTMENT
    Then user will be redirected to Book an Appointment page
    When user clicks on Services
    Then user can see all the services provided
    When user clicks on Recipes
    Then user can see all the recipes available
