Feature: Dietitian HomePage

  @DietitianSignIN
  Scenario: The Dietitian lands into Dietitian home page after Sign in
    Given The Dietitian is on Dietitian HOME PAGE
    When The Dietitian fills valid username, password
    When clicks the logged in as Dietitian option
    When clicks the Sign IN button
    Then The page will be re directed to the Dietitian homepage and the username will display as Logged in as Dietitian Name

  @TopPanel
  Scenario: The Dietitian Home page TOP PANEL section
    Given The Dietitian is on Dietitian HOME PAGE Top Panel Section
    When The Dietitian Home Page contains company logo and an image
    Then The Dietitian will see logo and image
    When The Dietitian Home page contains few clickable header options such as HOME,NEW PATIENT,MY PATIENT,DIET PLAN
    Then The Dietitian will be re directed to the respective pages upon a click

  @Body
  Scenario: Body of the Dietitian Home Page
    Given Dietitian is on body of Dietitian HOME PAGE
    When The Dietitian Home page contains Company banner and important Announcements
    Then The Dietitian will see all the important announcements upon login

  @Signout
  Scenario: The Dietitian Home page SIGN OUT
    Given Dietitian is Signing Out
    When The Dietitian home page top panel contains a SIGN OUT clickable button
    Then The Dietitian Signs out of the portal upon the click
