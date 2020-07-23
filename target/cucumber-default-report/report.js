$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NameValidationsInDB.feature");
formatter.feature({
  "name": "Name validations against DB",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "First Name validation against DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DB"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to employee list page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_navigate_to_employee_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid employee id \"14688\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_enters_valid_employee_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify table is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.verify_table_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get first name from table",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.get_first_name_from_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get data from db",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.DBSteps.get_data_from_db()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify first name from ui against db",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.verify_first_name_from_ui_against_db()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "First Name validation against DB");
formatter.after({
  "status": "passed"
});
});