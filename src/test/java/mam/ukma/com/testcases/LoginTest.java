package mam.ukma.com.testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(dataProvider="getData")
	public void invalidLogin(String username, String password){
		LaunchPage lp=launchBrowser("chrome");
		LoginPage loginPage=lp.goToHomePage("DEV");
		loginPage.doLogin(username, password);
		Assert.assertEquals("* Invalid Username or Password!", "* Invalid Username or Password!");
			
	}
	
	@DataProvider
	public Object[][] getData(){
		
		String[][] arr=new String[2][2];
		arr[0][0]="Admin";
		arr[0][1]="Globrin@313";
		arr[1][0]="Adminyy";
		arr[1][1]="Globrin@313";

		return arr;
	}

}
