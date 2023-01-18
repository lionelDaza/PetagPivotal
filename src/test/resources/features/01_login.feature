Feature: Web Login
  @LogOut
  Scenario: Verify that the Projects page is displayed after login
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce his username
    And The user introduce his password
    Then Home page should be displayed

  Scenario: Verify that an error message is displayed when wrong data is entered in the login
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce his username
    And The user introduce a invalida password wrongPassword
    Then Error message should be displayed
