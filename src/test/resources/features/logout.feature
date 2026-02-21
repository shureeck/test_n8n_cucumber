Feature: Login Feature

  Scenario: Successful login
    Given user is on login page
    When user enters username "admin" and password "1234"
    Then login should be successful