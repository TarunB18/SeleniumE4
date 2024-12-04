package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationsPagePOM {
	
	public OrganizationsPagePOM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement plusIcon;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationName;
	
	@FindBy(xpath = "(//input[@value='  Save  '])[2]")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industryDropDown;
	
	
	public void plusIcon() {
		plusIcon.click();
	}
	
	public void organizationName(String organizationName) {
		this.organizationName.sendKeys(organizationName);
	}
	
	public void saveBtn() {
		saveBtn.click();
	}
	
	public void industryDropDown(String value) {
		Select select=new Select(industryDropDown);
		select.selectByValue(value);
	}
	
}
