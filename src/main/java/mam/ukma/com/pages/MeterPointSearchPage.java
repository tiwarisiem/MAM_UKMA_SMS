package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class MeterPointSearchPage extends UKMAPage{

	@FindBy(xpath=Constants.METERPOINT_REFNO_XPATH)
	WebElement txtMeterPointRefNo;
	
	@FindBy(xpath=Constants.SEARCHBUTTON_METERPOINT_XPATH)
	WebElement btnSearch;
	
	@FindBy(xpath=Constants.EDITBUTTON_METERPOINT_XPATH)
	WebElement btnMeterPoint;
	
	@FindBy(xpath=Constants.EDITBUTTON_VIEWTRANSACTION_XPATH)
	WebElement btnViewTransaction;
	
	@FindBy(xpath=Constants.EDITBUTTON_MARKETPARTICIPANTS_XPATH)
	WebElement btnMarketParticipants;
	
	@FindBy(xpath=Constants.EDITBUTTON_VIEWASSETS_XPATH)
	WebElement btnMPAssets;
	
	
	public MeterPointSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void serachMeterPoint(String meterPointRefNo){
		Selenium.type(txtMeterPointRefNo, meterPointRefNo);
		Selenium.clickAndWait(btnSearch);
	}
	public MeterPointPage editMeterPoint(String mrpn){
		Selenium.type(txtMeterPointRefNo, mrpn);
		Selenium.clickAndWait(btnSearch);
		Selenium.clickAndWait(btnMeterPoint);
		return PageFactory.initElements(driver, MeterPointPage.class);

	}
	public MeterPointAssetTransaction viewMPAssetTransaction(String mrpn){
		Selenium.type(txtMeterPointRefNo, mrpn);
		Selenium.clickAndWait(btnSearch);
		Selenium.clickAndWait(btnMeterPoint);
		return PageFactory.initElements(driver, MeterPointAssetTransaction.class);
	}
	
	public MeterPointMarketParticipants viewMPMarketParticipants(String mrpn){
		Selenium.type(txtMeterPointRefNo, mrpn);
		Selenium.clickAndWait(btnSearch);
		Selenium.clickAndWait(btnMeterPoint);
		return PageFactory.initElements(driver, MeterPointMarketParticipants.class);
	}
	
	public MeterPointAssetDetails viewAssets(String mrpn){
		Selenium.type(txtMeterPointRefNo, mrpn);
		Selenium.clickAndWait(btnSearch);
		Selenium.clickAndWait(btnMeterPoint);
		return PageFactory.initElements(driver, MeterPointAssetDetails.class);
	}
	

}
