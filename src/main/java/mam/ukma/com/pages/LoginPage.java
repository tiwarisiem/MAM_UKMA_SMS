package mam.ukma.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import mam.ukma.com.base.UKMAPage;

public class LoginPage extends UKMAPage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void doLogin(String username, String password){
		driver.findElement(By.id("MainContent_tbUserName")).sendKeys(username);
		driver.findElement(By.id("MainContent_tbPassword")).sendKeys(password);
		driver.findElement(By.id("MainContent_btnLogin")).sendKeys(Keys.ENTER);
	//	String invalidMsg=driver.findElement(By.id("")).getText();

	}

}
