package mam.ukma.com.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;
import mam.ukma.com.pages.SearchJobPage;
import mam.ukma.com.util.TestUtil;
import mam.ukma.com.util.Xls_Reader;

public class JobTest extends BaseTest{

	Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\xls\\DomTransactional.xlsx");

	@Test(dataProvider="getData")
	public void createNewJob(
			String runMode,
			String browser,
			String workStream,
			String meterWorkType,
			String mprn,
			String existingMSN,
			String expectedResult){
		if(!TestUtil.isTestRunnable(xls, "CreateJob"))
			throw new SkipException("Test Case is not runnable!");
		LaunchPage lp=launchBrowser(browser);
		LoginPage login=lp.goToHomePage("DEV");
		Object page=login.doLogin("Admin", "Globrin@313");
		if(page instanceof LoginPage){
			Assert.fail("Credential Failure!");
		}
		 SearchJobPage landing=(SearchJobPage)driver;
		 landing.getTopMenu().goToNewJob();
		 
	}
		
		@DataProvider
		public Object[][] getData(){
			return TestUtil.getData(xls, "CreateJob");
		}
		
		@AfterTest
		public void quit(){
			super.quit();
		}
	
}
