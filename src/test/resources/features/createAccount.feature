Feature: Login Feature

  Scenario: Create Account
    Given user navigate to create account page page
    When user enters username "admin" and password "1234"
    Then account created
