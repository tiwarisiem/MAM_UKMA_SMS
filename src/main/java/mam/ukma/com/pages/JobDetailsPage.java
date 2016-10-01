package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class JobDetailsPage extends UKMAPage{

	@FindBy(xpath=Constants.SUPPLIER_XPATH)
	WebElement ddlSupplier;
	
	@FindBy(xpath=Constants.EXISTINGMSN_XPATH)
	WebElement txtExistingMSN;
	
	@FindBy(xpath=Constants.SAVEJOBBUTTON_XPATH)
	WebElement btnSaveJob;
	
	public JobDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void saveJob(){
		Selenium.waitForElementVisible(driver, ddlSupplier);
		Selenium.selectByIndex(ddlSupplier, 1);
		Selenium.clickAndWait(btnSaveJob);
	}

}
