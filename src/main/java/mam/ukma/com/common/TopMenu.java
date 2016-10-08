package mam.ukma.com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.pages.MeterPointSearchPage;
import mam.ukma.com.pages.WorkStreamSelectionPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class TopMenu {
	
	public WebDriver driver;
	
	@FindBy(xpath=Constants.JOBMENU_XPATH)
	WebElement jobMenu;
	
	@FindBy(xpath=Constants.NEWJOBMENU_XPATH)
	WebElement newJobMenu;
	
	@FindBy(xpath=Constants.METERPOINTMENU_XPATH)
	WebElement meterPointMenu;
	
	public TopMenu(WebDriver driver){
		this.driver=driver;
	}
	
	public WorkStreamSelectionPage goToNewJob(){
		Selenium.hoverOnWebElement(driver, jobMenu);
		Selenium.clickAndWait(newJobMenu);
		return PageFactory.initElements(driver, WorkStreamSelectionPage.class);

	}
	
	public MeterPointSearchPage goToMeterPointSearchPage(){
		Selenium.clickAndWait(meterPointMenu);
		return PageFactory.initElements(driver, MeterPointSearchPage.class);
	}
	

	

}
