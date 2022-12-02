Feature: Web Login
  @LogOut
  Scenario: Verify that the Projects page is displayed after login
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce my user alvarolioneldaza0
    And The user introduce my password P@ssw0rdPivotal
    Then Home page should be displayed

  Scenario: Verify that an error message is displayed when wrong data is entered in the login
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce my user alvarolioneldaza0
    And The user introduce my password wrongPassword
    Then Error message should be displayed
