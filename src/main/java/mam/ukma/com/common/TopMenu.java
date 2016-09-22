package mam.ukma.com.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.pages.WorkStreamSelectionPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class TopMenu {
	
	WebDriver driver;
	
	@FindBy(xpath=Constants.JOBMENU_XPATH)
	WebElement jobMenu;
	
	@FindBy(xpath=Constants.NEWJOBMENU_XPATH)
	WebElement newJobMenu;
	
	
	public void hoverOnJobMenu(){
		Selenium.hoverOnWebElement(driver, jobMenu);
	}
	
	public WorkStreamSelectionPage clickOnNewJobMenu(){
		Selenium.clickAndWait(newJobMenu);
		return PageFactory.initElements(driver, WorkStreamSelectionPage.class);
	}
	
	public WorkStreamSelectionPage goToNewJob(){
		Selenium.hoverOnWebElement(driver, jobMenu);
		Selenium.clickAndWait(newJobMenu);
		return PageFactory.initElements(driver, WorkStreamSelectionPage.class);

	}
	

	

}
