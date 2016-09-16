package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mam.ukma.com.base.UKMAPage;
import mam.ukma.com.util.Selenium;

public class LoginPage extends UKMAPage{
	
	@FindBy(id="MainContent_tbUserName")
	WebElement userName;
	
	@FindBy(id="MainContent_tbPassword")
	WebElement passWord;
	
	@FindBy(id="MainContent_btnLogin")
	WebElement submit;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void doLogin(String username, String password){
		Selenium.type(userName, username);
		Selenium.type(passWord, password);
		Selenium.clickAndWait(submit);
	//	String invalidMsg=driver.findElement(By.id("")).getText();

	}

}
