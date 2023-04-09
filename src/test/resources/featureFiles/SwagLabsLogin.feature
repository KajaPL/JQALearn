@login
Feature: Login

  Scenario: Log in as valid credentials successfully
  The user should be able to login into the swag labs site when the username and the password are correct.
  #The user should be shown an error text when the username and the password are incorrect.

    Given I am on the login page
    When I log in with a username and password
    And I click on login button
    Then I should be successfully authorized in system
