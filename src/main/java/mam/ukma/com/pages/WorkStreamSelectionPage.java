package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class WorkStreamSelectionPage extends UKMAPage{

	
	@FindBy(xpath=Constants.WORKSTREAM_XPATH)
	WebElement ddWorkStream;
	
	@FindBy(xpath=Constants.METERWORKTYPE_XPATH)
	WebElement ddMeterWorkType;
	
	@FindBy(xpath=Constants.CONVERTERWORKTYPE_XPATH)
	WebElement ddconverterWorkType;
	
	@FindBy(xpath=Constants.METERAMRWORKTYPE_XPATH)
	WebElement ddMeterAMRWorkType;
	
	@FindBy(xpath=Constants.CONVERTERAMRWORKTYPE_XPATH)
	WebElement ddConverterAMRWorkType;
	
	@FindBy(xpath=Constants.NEXTBUTTON_WORKSTREAM_XPATH)
	WebElement btnNext;
	
	public WorkStreamSelectionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public MeterPointPage selectWorkStream(String workStream, String meterWorkType){
		Selenium.selectByVisibleText(ddWorkStream, workStream);
		Selenium.selectByVisibleText(ddMeterWorkType, meterWorkType);
		Selenium.waitForElementPresent(driver, btnNext);
		Selenium.clickAndWait(btnNext);
		return PageFactory.initElements(driver, MeterPointPage.class);
	}
	
	public MeterPointPage selectWorkStream(String workStream, String meterWorkType, String converterWorkType, String meterAMR, String converterAMR){
		Selenium.selectByVisibleText(ddWorkStream, workStream);
		Selenium.selectByVisibleText(ddMeterWorkType, meterWorkType);
		Selenium.waitForElementPresent(driver, btnNext);
		Selenium.clickAndWait(btnNext);
		return PageFactory.initElements(driver, MeterPointPage.class);
	}
	
	

}
