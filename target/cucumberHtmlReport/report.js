$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/my_first.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Login",
  "description": "      As a user I should able to login into Gmail.",
  "id": "gmail-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "I login with valid credential",
  "description": "",
  "id": "gmail-login;i-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to \"http://www.gmail.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"test@gmail.com\" into input field having id \"Email\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on element having id \"next\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "element having class \"error-msg\" should be present",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I wait for 15 sec",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.gmail.com",
      "offset": 15
    }
  ],
  "location": "PredefinedStepDefinitions.navigate_to(String)"
});
