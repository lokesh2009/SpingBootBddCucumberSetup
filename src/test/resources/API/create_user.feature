Feature: User API

  Scenario: Create a new user
    Given I have the API endpoint to create a user
    When I send a POST request with valid user data
    Then I receive a successful response with status 201
