Feature: Login
  Scenario: Log in as valid credentials successfully
    Given I am on the login page
    When I log in with a valid username and valid password
    |username|password|
    |standard_user|secret_sauce|
    And I click on login button
    Then I should be successfully authorized in system
