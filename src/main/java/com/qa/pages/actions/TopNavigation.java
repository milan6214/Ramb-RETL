package com.qa.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.pages.locators.TopNavigationLocators;

public class TopNavigation {

	
	public TopNavigationLocators topNav;
	
public TopNavigation(WebDriver driver) {
		
		this.topNav=new TopNavigationLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 10);
		
		PageFactory.initElements(factory, this.topNav);
	}
	
}
