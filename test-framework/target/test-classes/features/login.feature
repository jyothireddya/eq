@ui @smoke
Feature: Swag Labs login

  Scenario: Login with a valid user
    Given the Swag Labs login page is open
    When I sign in with the configured valid user
    Then the products page is displayed
