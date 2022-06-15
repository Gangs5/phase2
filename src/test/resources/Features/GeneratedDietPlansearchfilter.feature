Feature: Generated Diet Plans Page

  Scenario: The Dietitian validates search filter option and searches the desired patient
    Given The Dietitian is on the Generated Diet Plans page
    When the Dietitian fills the search fields such as patients name or email address or phone number
    When The Dietitian hits the search button
    Then the Dietitian will be re directed to the search result page with similar inputs
