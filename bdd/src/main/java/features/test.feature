Feature: Facebook login functionality
Scenario: Login with valid credentials
    Given User is on login page
    When user enters username
    And User enters password
    And User clicks on signin button
    Then User logged in successfully