Feature: User login

  Scenario: As a User, I need to access the login landing page from the main landing page account, so that I can see the login module
    Given that the user navigates to the Trello application
    When the user clicks on the "Log in" button on the top right of the application
    Then the user will be taken to a login landing page
    And the user sees "Enter email" in the text field
    And the user sees "Enter password" in the text field
    Then the user sees "log in" button should be green with white text