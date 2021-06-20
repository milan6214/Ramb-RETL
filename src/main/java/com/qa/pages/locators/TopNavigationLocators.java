package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

	
	@FindBy(xpath="(//a[.='My Account'])[1]")
	public WebElement myAccountTab;
	
	
	@FindBy(xpath="//a[contains(text(),'My Wishlist')]]")
	public WebElement myWishListTab;
	
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	public WebElement checkOutTab;
	
	@FindBy(xpath="//a[contains(text(),'Log In')]")
	public WebElement loginTab;
	
	@FindBy(xpath="//a[contains(text(),'Create an account')]")
	public WebElement createAnAccountTab;
	
	@FindBy(xpath="//span[contains(text(),'All Gear')]")
	public WebElement allGearTab;
	
	@FindBy(xpath="//span[contains(text(),'Brands')]")
	public WebElement brandTab;
	
	@FindBy(xpath="//span[contains(text(),'REP THE BRAND ')]")
	public WebElement repBrandTab;
	
	@FindBy(xpath="//span[contains(text(),'Bundles')]")
	public WebElement bundlesTab;
	
	@FindBy(xpath="//span[contains(text(),'Request a Quote')]")
	public WebElement requestAQuoteTab;
	
	@FindBy(xpath="//span[contains(text(),'Contact Us')]")
	public WebElement contactUsTab;
	
}
