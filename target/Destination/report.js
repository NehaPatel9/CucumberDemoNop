$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6502187800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to register successfully.",
  "description": "        so that user can use all user functionality on my website",
  "id": ";user-should-able-to-register-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters all required -submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 246179493,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 1539172464,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_registration_details()"
});
formatter.result({
  "duration": 1247307529,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_submit_button()"
});
formatter.result({
  "duration": 2096486312,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 34568848,
  "status": "passed"
});
formatter.after({
  "duration": 899681580,
  "status": "passed"
});
});