Feature: Pagination on View Recent Diet Plans page

  Scenario: Validating the default number of records displayed per page
    Given User is logged on to Dietician website to validate
    When User is on View Recent Diets Page
    Then User should see 5 records per page

  Scenario: Validation of traversing to next page
    Given User is on view recent diets page to validate
    When More than one page of records are displayed and User is on first page
    Then Next Page button  is enabled

  Scenario: Validation of traversing to second  page from view recent diets page
    Given User is on View Recent Diets Page and more than one page of records are displayed and User is on first page
    When User clicks on next button
    Then User should see the second page

  Scenario: Validating the traversing to previous page button
    Given User is on last page of view recent diets
    When User see more than one page of records
    Then Previous Page button is enabled

  Scenario: Validating the traversing to previous page
    Given User is on last page of view recent diets to validate previou page
    When User clicks on previous page button
    Then User should be traversed to previous page

  Scenario: Validation of traversing to previous page when user is on first page
    Given User is on first page
    When User see more than one page of records
    Then Previous page button is disabled
