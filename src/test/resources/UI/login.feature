Feature: User Login

  Scenario: Successful Login
    Given I launch the web application
    When I log in with valid credentials
    Then I should see the welcome message