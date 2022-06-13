Feature: Generated Diet Plans Page

  Scenario: The dietician validates search filter option and searches the desired patient
  
    Given The dietician is on the Generated Diet Plans page
    When the dietician fills the search fields such as patients name or email address or phone number
    When The dietician hits the search button
    Then the dietician will be re directed to the search result page with similar inputs
