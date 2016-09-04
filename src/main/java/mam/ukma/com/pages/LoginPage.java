package mam.ukma.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mam.ukma.com.base.UKMAPage;

public class LoginPage extends UKMAPage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void doLogin(String username, String password){
		driver.findElement(By.id("MainContent_tbUserName")).sendKeys("Admin");
		driver.findElement(By.id("MainContent_tbPassword")).sendKeys("Globrin@313");
		driver.findElement(By.id("MainContent_btnLogin")).submit();

	}

}
