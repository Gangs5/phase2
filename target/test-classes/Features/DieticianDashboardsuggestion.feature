Feature: Dietitian Dashboard

  Scenario: Dietitian is on the Dietitian Homepage Dashboard
    Given Dietitian logged in successfully to the Dietitian website
    When Dietitian verifes Dashboard Left Side Bar
    Then User can see Upcoming Events section in left side bar
    When Dietitian Verifies Upcoming Event Items
    Then Dietitian can see the Items of  Upcoming Events section in left side bar
    When Dietitian verifies Dashboard Top Right Side Bar
    Then User can see Banner or Announcements section in top right side bar
    When Dietitian verifies Dashboard Bottom Right Side Bar
    Then Dietitian can see the ratio graph of enrolled patients  in bottom right side bar Recovery rate
    When Dietitian Verifies Total Patient
    Then Dietitian can see the Total Patient count
    When Dietitian verifies Verify New Patient
    Then Dietitian can see the New Patient count
    When Dietitian Verifies Recovered Patient
    Then Dietitian can see Recovered Patient count
    When Dietitian Verifies Incoming Patient History
    Then Dietitian can see the comparison  graph in Incoming Patient History
