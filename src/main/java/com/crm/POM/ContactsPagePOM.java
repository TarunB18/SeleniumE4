package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPagePOM {

	public ContactsPagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement plusIcon;

//	Creating New Contact POM
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutationDropDown;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement organizationName;

	@FindBy(xpath = "//input[@name='support_start_date']")
	private WebElement startDate;

	@FindBy(xpath = "//input[@name='support_end_date']")
	private WebElement endDate;

	@FindBy(xpath = "(//input[@value='  Save  '])[2]")
	private WebElement saveBtn;

	public void plusIcon() {
		plusIcon.click();
	}
	
	public void salutationDropDown(String value) {
		Select select=new Select(salutationDropDown);
		select.selectByValue(value);
	}
	
	public void firstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void lastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void organizationName(String organizationName) {
		this.organizationName.sendKeys(organizationName);
	}
	
	public void saveBtn() {
		saveBtn.click();
	}

}
