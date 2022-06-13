#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
@tag
Feature: My Patient elements

  @Test001
  Scenario: Verify my patient tab
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then It shows breadcrubs as Dietician Software MyPatients
