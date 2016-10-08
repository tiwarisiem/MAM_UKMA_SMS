package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;

public class JobConfirmationPage extends UKMAPage{

	@FindBy(xpath=Constants.JOBCONFIRMATIONMSG_XPATH)
	WebElement message;
		
	
	
	public JobConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean confirmationJobMsg(){
		return message.isDisplayed();
		
	}

}
