Feature: Book An Appointment page

  Scenario: User trying to book an Appointment
    Given User is in Book an Appointment page
    When User fills Patient Name column
    When user fills Mobile Number Column
    When User selects the required date from the calendar displaying date and day
    When User clicks available time slot for the selected date
    When the User clicks on the BOOK button
    Then User appointment gets booked and the screen will display an alert saying Your Appointment is booked
