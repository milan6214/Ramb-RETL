package com.qa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.base.Page;
import com.qa.pages.locators.HomePageLocators;

public class HomePage extends Page {

	
	public HomePageLocators homepage;
	
	
	public HomePage() {
		
		this.homepage=new HomePageLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 10);
		
		PageFactory.initElements(factory, this.homepage);
	}
	
	
	public String verifyHomePageLogo()
	{
		
		return homepage.logoTab.getText();
	}
	
	public String verifyLogin() {
		
		return homepage.loginBtn.getText();
	}
}
