package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends CommonMethods {

	@Then("user see dashboard menu is displayed")
	public void user_see_dashboard_menu_is_displayed(DataTable dashboardMenu) {
		List<String> expectedMenu = dashboardMenu.asList();
		List<String> actualMenu = new ArrayList<>();

		for (WebElement el : dashboard.dashMenu) {
			actualMenu.add(el.getText());
		}
		System.out.println(expectedMenu);
		System.out.println(actualMenu);

		Assert.assertTrue(actualMenu.equals(expectedMenu));
	}

	@When("user clicks on edit button")
	public void user_clicks_on_edit_button() {
		click(pdetails.editOrSaveBtn);
	}

	@Then("user modifies employee personal data")
	public void user_modifies_employee_personal_data(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps();
		for (Map<String, String> m : map) {
			
			sendText(pdetails.drLicNumber, m.get("Drivers License Number"));
			sendText(pdetails.licExpiryDate, m.get("License Expiry Date"));
			pdetails.licExpiryDate.sendKeys(Keys.ENTER);
			sendText(pdetails.SSN, m.get("SSN Number"));
			sendText(pdetails.sinNumber, m.get("SIN Number"));
			WebElement male = pdetails.genderRadioGroup.get(0);
			click(male);
			wait(3);
			selectDdValue(pdetails.maritalStatusDD, m.get("Marital Status"));
			selectDdValue(pdetails.nationalityDD, m.get("Nationality"));
			sendText(pdetails.dateOfBirth, m.get("Date of Birth"));
			pdetails.dateOfBirth.sendKeys(Keys.ENTER);
			sendText(pdetails.nickName, m.get("Nick Name"));
			sendText(pdetails.militarySrvc, m.get("Military Service"));
			waitForClickability(pdetails.smoker);
			click(pdetails.smoker);
			wait(3);
			click(pdetails.editOrSaveBtn);
			wait(3);
			takeScreenshot("personalDetailsModified");
			
		}

	}
}
