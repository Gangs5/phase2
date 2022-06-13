 @tag
 Feature: Search patient

 @Test002
  Scenario:  User search the Patient text
  Given User is on any page after login
  When User clicks on My Patients tab
  Then Name email and phone number filter options and search button are displayed

  @Test003
  Scenario: Verify search button text
  Given User is logged in
  When User is on my patients
  Then Button used for search has text as Search
  When User starts typing inside name filter box
  Then Text inside name filter box should disappear
  When User starts typing inside email address filter box
  Then Text inside email address filter box should disappear
   When User starts typing inside phone number filter box
  Then Text inside phone number filter box should disappear
  
  @Test004
  Scenario: Search patients by name
  Given User is on my patients
  When User clicks on search with name phrase into name filter box
  Then Records for name phrase are shown
  When User clicks on search with email phrase into email address filter
  Then Records for email phrase are shown
  When User clicks on search with phone number into phone number filter
  Then Records for phone number are shown




  