package mam.ukma.com.testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;
import mam.ukma.com.util.TestUtil;
import mam.ukma.com.util.Xls_Reader;

public class LoginTest extends BaseTest{
	
	//Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir"+"\\xls\\Authentication.xlsx"));
	Xls_Reader xls=new Xls_Reader("F:\\Selenium_Maven\\Project_Directory\\MAM_UKMA_SMS\\xls\\Authentication.xlsx");
	@Test(dataProvider="getData")
	public void invalidLoginTest(
					String runMode,
					String browser,
					String username, 
					String password,
					String expectedResult){
		LaunchPage lp=launchBrowser("chrome");
		LoginPage loginPage=lp.goToHomePage("DEV");
		loginPage.doLogin(username, password);
		Assert.assertEquals("* Invalid Username or Password!", "* Invalid Username or Password!");
			
	}
	
	
	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(xls, "LoginTest");
	}

}
