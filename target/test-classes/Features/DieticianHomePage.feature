Feature: Dietician HomePage

  @DieticianSignIN
  Scenario: The Dietician lands into Dietician home page after Sign in
    Given The dietician is on dietician HOME PAGE
    When The Dietician fills valid username, password
    When clicks the logged in as Dietician option
    When clicks the Sign IN button
    Then The page will be re directed to the Dietician homepage and the username will display as Logged in as Dietician Name

  @TopPanel
  Scenario: The Dietician Home page TOP PANEL section
    Given The dietician is on dietician HOME PAGE Top Panel Section
    When The Dietician Home Page contains company logo and an image
    Then The dietician will see logo and image
    When The Dietician Home page contains few clickable header options such as HOME,NEW PATIENT,MY PATIENT,DIET PLAN
    Then The dietician will be re directed to the respective pages upon a click

  @Body
  Scenario: Body of the Dietician Home Page
    Given dietician is on body of dietician HOME PAGE
    When The Dietician Home page contains Company banner and important Announcements
    Then The dietician will see all the important announcements upon login

  @Signout
  Scenario: The dietician Home page SIGN OUT
    Given dietician is Signing Out
    When The Dietician home page top panel contains a SIGN OUT clickable button
    Then The Dietician Signs out of the portal upon the click
