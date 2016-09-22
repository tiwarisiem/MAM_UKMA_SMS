package mam.ukma.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Constants;
import mam.ukma.com.util.Selenium;

public class LoginPage extends UKMAPage{
	
	@FindBy(xpath=Constants.USERNAME_XPATH)
	WebElement txtUsername;
	
	@FindBy(xpath=Constants.PASSWORD_XPATH)
	WebElement txtPassword;
	
	@FindBy(xpath=Constants.LOGIN_BUTTON_XPATH)
	WebElement btnLogin;
	
	@FindBy(xpath=Constants.LOGIN_ERRORMSG)
	public WebElement msgLoginError;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public Object doLogin(String username, String password){
		boolean result=isElementPresent(Constants.USERNAME_XPATH);
		Selenium.type(txtUsername, username);
		Selenium.type(txtPassword, password);
		Selenium.clickAndWait(btnLogin);
		result=isElementPresent(Constants.USERNAME_XPATH);
		if(result){
			return PageFactory.initElements(driver, LoginPage.class);
		}
		else
		return PageFactory.initElements(driver, SearchJobPage.class);

	}

}
