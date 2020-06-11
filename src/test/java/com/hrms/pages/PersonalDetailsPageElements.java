package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;
	
	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;
	
	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;
	
	@FindBy(xpath = "//input[@id='personal_txtLicenNo']")
	public WebElement drLicNumber;
	
	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']")
	public WebElement licExpiryDate;
	
	@FindBy(xpath = "//input[@id='personal_txtNICNo']")
	public WebElement SSN;
	
	@FindBy(xpath = "//input[@id='personal_txtSINNo']")
	public WebElement sinNumber;
	
	@FindBy(xpath = "//select[@id='personal_cmbMarital']")
	public WebElement maritalStatusDD;
	
	@FindBy(xpath = "//input[@id='personal_DOB']")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpNickName']")
	public WebElement nickName;
	
	@FindBy(xpath = "//input[@id='personal_txtMilitarySer']")
	public WebElement militarySrvc;
	
	@FindBy(xpath = "//input[@id='personal_chkSmokeFlag']")
	public WebElement smoker;
	
	@FindBy(xpath = "//input[@id='btnSave']")
	public WebElement editOrSaveBtn;
	
	
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
}
