package mam.ukma.com.testcases;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;
import mam.ukma.com.pages.SearchJobPage;
import mam.ukma.com.util.Selenium;
import mam.ukma.com.util.TestUtil;
import mam.ukma.com.util.Xls_Reader;

public class LoginTest extends BaseTest{
	
		Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\xls\\Authentication.xlsx");
		
	@Test(dataProvider="getData")
	public void invalidLoginTest(
			String runMode,
			String browser,
			String username, 
			String password,
			String expectedResult){
		if(!TestUtil.isTestRunnable(xls, "LoginTest"))
			throw new SkipException("Test Case is not runnable!");
		LaunchPage lp=launchBrowser(browser);
		LoginPage loginPage=lp.goToHomePage("DEV");
		Object page=loginPage.doLogin(username, password);	
		if(page instanceof LoginPage){
		Assert.assertEquals(loginPage.msgLoginError.getText().toString(), expectedResult);
		}
		else {
		String title=driver.getTitle().toString();
		Assert.assertEquals(title, expectedResult);
		}
	}
	
	
	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(xls, "LoginTest");
	}

}
