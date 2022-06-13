#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Register page mandatory fields

  @MandatoryFieldsTest
  Scenario: Validating the Register page mandatory fields
    Given User is on Dietician website page
    When User lands on Register page on Dietician website
    Then User should see all mandatory flields with star symbol on top of those fields

