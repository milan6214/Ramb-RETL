package com.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Page;
import com.qa.pages.actions.HomePage;

public class HomePageTest {

	HomePage home= new HomePage();
	
	@BeforeMethod
	public void start()
	{
		
		Page.initConfiguration();
	}
	
	@Test()
	public void verifyHomelogo()
	{
		
		System.out.println(home.verifyHomePageLogo());
	}


	@Test
	public void verifyLogin()
	{
		
		Assert.assertEquals(home.verifyLogin(), "hii", "failed");
	}
}

