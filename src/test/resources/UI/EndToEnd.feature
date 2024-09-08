Feature: End-to-end user creation and login

  Scenario: Create a new user via API and log in to UI
    Given I have the API endpoint to create a user
    When I send a POST request to create a user
    Then I should get a successful response

    # Chaining UI step
    Given I launch the web application
    When I log in with user data from the API
    Then I should see the user's dashboard
