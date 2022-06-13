Feature: Dietician Dashboard

  Scenario: Dietician is on the Dietician Homepage Dashboard
    Given Dietician logged in successfully to the Dietician website
    When Dietician verifes Dashboard Left Side Bar
    Then User can see Upcoming Events section in left side bar
    When Dietician Verifies Upcoming Event Items
    Then Dietician can see the Items of  Upcoming Events section in left side bar
    When Dietician verifies Dashboard Top Right Side Bar
    Then User can see Banner or Announcements section in top right side bar
    When Dietician verifies Dashboard Bottom Right Side Bar
    Then Dietician can see the ratio graph of enrolled patients  in bottom right side bar Recovery rate
    When Dietician Verifies Total Patient
    Then Dietician can see the Total Patient count
    When Dietician verifies Verify New Patient
    Then Dietician can see the New Patient count
    When Dietician Verifies Recovered Patient
    Then Dietician can see Recovered Patient count
    When Dietician Verifies Incoming Patient History
    Then Dietician can see the comparison  graph in Incoming Patient History
