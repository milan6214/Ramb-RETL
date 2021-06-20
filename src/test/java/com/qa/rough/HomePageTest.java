package com.qa.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.qa.pages.actions.HomePage;

public class HomePageTest {

public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.rtstactical.com");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	HomePage home=new HomePage();
	
	System.out.println(home.verifyHomePageLogo());
	
	//Assert.assertEquals(home.verifyHomePageLogo(), "RTS Tactical");
	
	//Assert.assertEquals(home.verifyLogin(),"Log In");
	
	
			
	
		
	}
	
}


	

