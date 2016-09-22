package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class WorkStreamSelectionPage extends UKMAPage{

	
	@FindBy(xpath=Constants.WORKSTREAM_XPATH)
	WebElement ddWorkStream;
	
	public WorkStreamSelectionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void selectWorkStream(String workStream, String meterWorkType){
		Selenium.selectByValue(ddWorkStream, workStream);
	}
	
	

}
