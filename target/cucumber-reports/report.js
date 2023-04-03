$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFiles/SwagLabsLogin.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Log in as valid credentials successfully",
  "description": "  The user should be able to login into the swag labs site when the username and the password are correct.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.iAmOnTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in with a valid  username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.iLogInWithAValidAndValid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be successfully authorized in system",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.StepDefinition.iShouldBeSuccessfullyAuthorizedInSystem()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});