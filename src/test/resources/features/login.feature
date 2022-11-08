Feature: Web Login
  @LogOut
  Scenario: Login Pivotal Successful
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce my user alvarolioneldaza0
    And The user introduce my password P@ssw0rdPivotal
    Then Home page should be displayed

  Scenario: Login Pivotal Fail
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce my user alvarolioneldaza0
    And The user introduce my password wrongPassword
    Then Error message should be displayed

