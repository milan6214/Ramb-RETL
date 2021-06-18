package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath="//img[@title='RTS Tactical']")
	
	public WebElement logoTab;
	
	@FindBy(xpath="//a[.='Log In']")
	public WebElement loginBtn;
	
	
	
}
