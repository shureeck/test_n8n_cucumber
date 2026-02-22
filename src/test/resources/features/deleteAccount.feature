Feature: Login Feature

  Scenario: Delete Account
    Given user navigate to delete account page page
    When user enters username "admin" and password "1234"
    Then account deleted

  Scenario: Delete Account failed
    Given user navigate to delete account page page
    When user enters username "user" and password "1234"
    Then account not deleted
