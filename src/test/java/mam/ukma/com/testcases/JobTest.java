package mam.ukma.com.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mam.ukma.com.pages.JobDetailsPage;
import mam.ukma.com.pages.LaunchPage;
import mam.ukma.com.pages.LoginPage;
import mam.ukma.com.pages.MeterPointPage;
import mam.ukma.com.pages.SearchJobPage;
import mam.ukma.com.pages.WorkStreamSelectionPage;
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
		if(!TestUtil.isTestRunnable(xls, "CreateJob") || runMode.equals("N"))
			throw new SkipException("Test Case is not runnable!");
		LaunchPage lp=launchBrowser(browser);
		LoginPage login=lp.goToHomePage("DEV");
		Object page=login.doLogin("Admin", "Globrin@313");
		if(page instanceof LoginPage){
			Assert.fail("Credential Failure!");
		}
		 SearchJobPage landing=(SearchJobPage)page;
		 WorkStreamSelectionPage wrkStream=landing.getTopMenu().goToNewJob();
		 MeterPointPage meterPointPage=wrkStream.selectWorkStream(workStream, meterWorkType);
		 page=meterPointPage.enterMeterPointDetails(mprn);
		 if(page instanceof MeterPointPage){
			// String actualResult=meterPointPage.lblErrorMsg.getText();
			 Assert.assertEquals(meterPointPage.lblErrorMsg.getText(), expectedResult);
		 }
		 else if(page instanceof JobDetailsPage){
			 JobDetailsPage jobDetailsPage=(JobDetailsPage)page;
			 jobDetailsPage.saveJob();
		 }
		
		 
	}
		
		@DataProvider
		public Object[][] getData(){
			return TestUtil.getData(xls, "CreateJob");
		}
		
		
		@AfterMethod
		public void quit(){
			super.quit();
		} 
	
}
