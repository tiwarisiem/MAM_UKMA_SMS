package mam.ukma.com.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;
import mam.ukma.com.pages.MeterPointPage;
import mam.ukma.com.pages.MeterPointSearchPage;
import mam.ukma.com.pages.SearchJobPage;
import mam.ukma.com.util.TestUtil;
import mam.ukma.com.util.Xls_Reader;

public class MeterPointTest extends BaseTest{
	
	Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\xls\\MeterPoints.xlsx");
  
	@Test(dataProvider="getData")
	public void searchMeterPoint(
			String runMode,
			String browser,
			String mprn,
			String meterPoint,
			String expectedResult) {
		if(!TestUtil.isTestRunnable(xls, "MeterPoint") || runMode.equals("N"))
			throw new SkipException("Test is not runnable!");
		LaunchPage lp=launchBrowser(browser);
		LoginPage login=lp.goToHomePage("DEV");
		Object page=login.doLogin("Admin", "Globrin@313");
		if(page instanceof LoginPage){
			Assert.fail("Login Credentials Failed to Login!");
		}
		SearchJobPage searchJob=(SearchJobPage)page;
		MeterPointSearchPage mpSearch=searchJob.getTopMenu().goToMeterPointSearchPage();
		MeterPointPage mp=mpSearch.editMeterPoint(mprn);
		mp.updateMeterPoint(meterPoint);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(xls, "MeterPoint");
	}
	
	@AfterMethod(enabled=false)
	public void quit(){
		super.quit();
	}
}
