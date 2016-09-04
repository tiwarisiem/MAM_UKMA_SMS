package mam.ukma.com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void invalidLogin(){
		LaunchPage lp=launchBrowser("chrome");
		LoginPage loginPage=lp.goToHomePage("DEV");
		loginPage.doLogin("daddffdfdf", "Globrin@313");
		Assert.assertEquals("* Invalid Username or Password!", "* Invalid Username or Password!");
			
	}

}
