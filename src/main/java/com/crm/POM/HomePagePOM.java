package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseClass.BaseClass;

public class HomePagePOM {

	Actions actions = new Actions(BaseClass.driver);

	public HomePagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='small']/img")
	private WebElement profileIcon;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendarLink;

	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsLink;

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizationsLink;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsLink;

	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunitiesLink;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productsLink;

	@FindBy(xpath = "//a[text()='Email']")
	private WebElement emailLink;

	@FindBy(xpath = "//a[text()='Trouble Tickets']")
	private WebElement troubleTicketsLink;

	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboardLink;

	public void logout() {
		actions.moveToElement(profileIcon).perform();
		actions.click(signout).perform();
	}

	public void CalenderLink() {
		calendarLink.click();
	}

	public void leadsLink() {
		leadsLink.click();
	}

	public void organizationsLink() {
		organizationsLink.click();
	}

	public void contactsLink() {
		contactsLink.click();
	}

	public void opportunitiesLink() {
		opportunitiesLink.click();
	}

	public void productsLink() {
		productsLink.click();
	}

	public void emailLink() {
		emailLink.click();
	}

	public void troubleTicketsLink() {
		troubleTicketsLink.click();
	}

	public void dashboardLink() {
		dashboardLink.click();
	}

}
