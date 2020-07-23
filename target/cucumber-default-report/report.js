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
  "error_message": "java.lang.AssertionError: expected:\u003c[{emp_firstname\u003dAli}]\u003e but was:\u003c[{emp_firstname\u003dtest}, {emp_firstname\u003dSelma S}, {emp_firstname\u003dSamuel J}, {emp_firstname\u003dJames X}, {emp_firstname\u003dJames X}, {emp_firstname\u003dAdam}, {emp_firstname\u003dSamuel H}, {emp_firstname\u003dColin}, {emp_firstname\u003dColin}, {emp_firstname\u003dRage}, {emp_firstname\u003dBobby Boshat}, {emp_firstname\u003dRoll}, {emp_firstname\u003dFernando}, {emp_firstname\u003dShazeb}, {emp_firstname\u003dSumair}, {emp_firstname\u003dShazeb}, {emp_firstname\u003dThomas}, {emp_firstname\u003dThomas}, {emp_firstname\u003dNigina N}, {emp_firstname\u003dLeyla L}, {emp_firstname\u003dLeyla L}, {emp_firstname\u003dJulie}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dStorm}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}, {emp_firstname\u003dMary}]\u003e\n\tat org.junit.Assert.fail(Assert.java:89)\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\n\tat org.junit.Assert.assertEquals(Assert.java:120)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat com.hrms.steps.EmployeeSearchSteps.verify_first_name_from_ui_against_db(EmployeeSearchSteps.java:56)\n\tat ✽.verify first name from ui against db(file:///Users/andrii/eclipse-workspace/Hrms/src/test/resources/features/NameValidationsInDB.feature:12)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "First Name validation against DB");
formatter.after({
  "status": "passed"
});
});