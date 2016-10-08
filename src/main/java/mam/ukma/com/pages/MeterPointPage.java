package mam.ukma.com.pages;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class MeterPointPage extends UKMAPage{

	@FindBy(xpath=Constants.MPRN_XPATH)
	WebElement txtMeterPointRefNo;
	
	@FindBy(xpath=Constants.PRESSURETIER_XPATH)
	WebElement ddPressureTier;
	
	@FindBy(xpath=Constants.MICROBUSINESS_XPATH)
	WebElement ddMicroBusiness;
	
	@FindBy(xpath=Constants.ADD1_XPATH)
	WebElement txtAddress1;
	
	@FindBy(xpath=Constants.ADD2_XPATH)
	WebElement txtAddress2;
	
	@FindBy(xpath=Constants.POSTTOWN_XPATH)
	WebElement txtPostTown;
	
	@FindBy(xpath=Constants.POSTCODE_XPATH)
	WebElement txtPostCode;
	
	@FindBy(xpath=Constants.TITLE_XPATH)
	WebElement ddlTitle;
	
//	@FindBy(xpath=Constants.PRESSURETIER_XPATH)
//	WebElement txtInitialName;
	
	@FindBy(xpath=Constants.SURNAME_XPATH)
	WebElement txtSurName;
	
	@FindBy(xpath=Constants.TELEPHONE1_XPATH)
	WebElement txtTelephone1;
	
	@FindBy(xpath=Constants.SAVEANDNEXTBUTTON_XPATH)
	WebElement btnSaveAndNext;
	
	@FindBy(xpath=Constants.METERPOINT_ERRORMSG_XPATH)
	public WebElement lblErrorMsg;
	
	public MeterPointPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Object enterMeterPointDetails(String meterPointRefNo){
	//	Selenium.waitForElementPresent(driver, txtMeterPointRefNo);
		Selenium.typeAndNext(txtMeterPointRefNo, meterPointRefNo);
		Selenium.clickOnPage(driver);
		/*
		boolean result=isElementPresent(Constants.METERPOINT_ERRORMSG_XPATH); 
		if(result){
			return PageFactory.initElements(driver, MeterPointPage.class);
		} */
		if(!btnSaveAndNext.isEnabled()){
			return PageFactory.initElements(driver, MeterPointPage.class);
		}
		Selenium.selectByIndex(ddPressureTier, 1);
		Selenium.selectByIndex(ddMicroBusiness, 1);
		Selenium.type(txtAddress1, "A5A");
		Selenium.type(txtAddress2, "222");
		Selenium.type(txtPostTown, "Gurgaon");
		Selenium.type(txtPostCode, "AB1 0AB");
		Selenium.selectByIndex(ddlTitle, 1);
		Selenium.type(txtSurName, "Tiwari");
		Selenium.type(txtTelephone1, "9818159545");
		Selenium.clickAndWait(btnSaveAndNext);
		return PageFactory.initElements(driver, JobDetailsPage.class);
	}
	
	public String meterPointMessage(){
		String meterPointValidation=lblErrorMsg.getText();
		return meterPointValidation;
	}
	
	public void updateMeterPoint(String meterPoint){
		ArrayList<String> before=this.meterPointDetails();
		Selenium.type(txtMeterPointRefNo, meterPoint);
		Selenium.clickOnPage(driver);
		ArrayList<String> after=this.meterPointDetails();
		if(!before.equals(after)){
			System.out.println("Meter Point Details desperated.");
		}
		Selenium.clickAndWait(btnSaveAndNext);
	}
	
	public ArrayList<String> meterPointDetails(){
		ArrayList<String> mpDetails=new ArrayList<String>();
		mpDetails.add(txtAddress1.getAttribute("value"));
		mpDetails.add(txtAddress2.getAttribute("value"));
		mpDetails.add(txtPostTown.getAttribute("value"));
		mpDetails.add(txtPostCode.getAttribute("value"));
		mpDetails.add(txtSurName.getAttribute("value"));
		mpDetails.add(txtTelephone1.getAttribute("value"));
		System.out.println(mpDetails);
		return mpDetails;

	}

}
