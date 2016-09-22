package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;

public class SearchJobPage extends UKMAPage{

	@FindBy(xpath=Constants.WORKSTREAM_XPATH)
	WebElement ddWorkStream;
	
	@FindBy(xpath=Constants.WORKTYPE_XPATH)
	WebElement ddWorkType;
	
	@FindBy(xpath=Constants.JOBSTATUS_XPATH)
	WebElement ddJobTatus;
	
	@FindBy(xpath=Constants.REFERENCENO_XPATH)
	WebElement txtJobReferenceNo;
	
	@FindBy(xpath=Constants.METERPOINTREFNO_XPATH)
	WebElement txtMeterPointRefNo;
	
	@FindBy(xpath=Constants.JOBCOORFINATOR_XPATH)
	WebElement ddJobCoordinator;
	
	@FindBy(xpath=Constants.SEARCHJOB_BUTTON_XPATH)
	WebElement btnSearchJob;
	
	
	
	public SearchJobPage(WebDriver driver) {
		super(driver);
	}
	
	

}
