Feature: Web Login

  Scenario: Login Pivotal Successful
    Given The user go to Pivotal web page
    When The user click on login button
    And The user introduce my user alvarolioneldaza0
    And The user introduce my password P@ssw0rdPivotal
    Then Home page should be displayed

