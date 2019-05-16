$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\selenium\cucumber\multipleScenarios.feature');
formatter.feature({
  "line": 1,
  "name": "Home Page",
  "description": "In order to test Home Page of application\r\nAs a Registered user\r\nI want to specify the features of home page",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Home Page Default content",
  "description": "",
  "id": "home-page;home-page-default-content",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on Github home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user gets a GitHub bootcamp section",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "username is also displayed on right corner",
  "keyword": "And "
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_is_on_Github_home_page()"
});
formatter.result({
  "duration": 281454200,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_a_GitHub_bootcamp_section()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.username_is_also_displayed_on_right_corner()"
});
formatter.result({
  "duration": 26600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "GitHub Bootcamp Section",
  "description": "",
  "id": "home-page;github-bootcamp-section",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on GitHub home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user focuses on GitHub Bootcamp Section",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user gets an option to setup git",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user gets an option to create repository",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user gets an option to Fork Repository",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user gets an option to work together",
  "keyword": "And "
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_is_on_GitHub_home_page()"
});
formatter.result({
  "duration": 27600,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_focuses_on_GitHub_Bootcamp_Section()"
});
formatter.result({
  "duration": 24700,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_to_setup_git()"
});
formatter.result({
  "duration": 30800,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_to_create_repository()"
});
formatter.result({
  "duration": 29400,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_to_Fork_Repository()"
});
formatter.result({
  "duration": 28300,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_to_work_together()"
});
formatter.result({
  "duration": 21700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Top Banner content",
  "description": "",
  "id": "home-page;top-banner-content",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user is on GitHub home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user focuses on Top Banner",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user gets an option of home page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user gets an option to search",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user gets settings options",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user gets an option to logout",
  "keyword": "And "
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_is_on_GitHub_home_page()"
});
formatter.result({
  "duration": 21500,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_focuses_on_Top_Banner()"
});
formatter.result({
  "duration": 29900,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_of_home_page()"
});
formatter.result({
  "duration": 29100,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_to_search()"
});
formatter.result({
  "duration": 26100,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_settings_options()"
});
formatter.result({
  "duration": 22400,
  "status": "passed"
});
formatter.match({
  "location": "MultipleScenarioStepDefinition.user_gets_an_option_to_logout()"
});
formatter.result({
  "duration": 23900,
  "status": "passed"
});
});