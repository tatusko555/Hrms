package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods{

	@When("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	  sendText(login.username, ConfigsReader.getProperty("username"));
	  sendText(login.password, ConfigsReader.getProperty("password"));
	  click(login.loginBtn);
	}

	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
		 sendText(login.username, ConfigsReader.getProperty("username"));
		  sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	  click(login.loginBtn);
	}

	@Then("admin user is successfully logged in")
	public void admin_user_is_successfully_logged_in() {
		String expected = "Welcome Admin";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome message is not displayed or not correct ", expected, actual );
		System.out.println(actual);
	}

	@When("user enter valid ess username and password")
	public void user_enter_valid_ess_username_and_password() {
		 sendText(login.username, "Gince123");
		 sendText(login.password, "SyntaxHrm123!");
	}

	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String expected = "Welcome Elvira";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome text is NOT displayed correctly", expected, actual);
	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		 sendText(login.username, "Elvira");
		 sendText(login.password, "Syntax123.....");
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_Invalid_Credentials_text_on_login_page() {
	    
	}
	
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
	}

	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String string) {
	}
	
	@When("I enter invalid username and password and see error message")
	public void i_enter_invalid_username_and_password_and_see_error_message(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> invalidCredentials = dataTable.asMaps();
	    
	    for (Map<String, String> map : invalidCredentials) {
			
	    	sendText(login.username, map.get("UserName"));
	    	sendText(login.password, map.get("Password"));
	    	jsClick(login.loginBtn);
	    	wait(1);
	    	takeScreenshot("invalidCredentials");
	    	Assert.assertEquals("Error message is not as expected", map.get("ErrorMessage"), login.errorMsg.getText());
	    	
		}
	}
}