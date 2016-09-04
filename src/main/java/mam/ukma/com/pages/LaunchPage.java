package mam.ukma.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.base.UKMAPage;

public class LaunchPage extends UKMAPage{
	
	public LaunchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public LoginPage goToHomePage(String env){
		try{
				String URL=null;
				if(env.equals("DEV")){
					URL="http://localhost/UKMA";
				}
				if(env.equals("Main")){
					URL="http://localhost/UKMA.MAIN";			
					
				}
				driver.get(URL);
				return PageFactory.initElements(driver, LoginPage.class);
			}
		catch(NullPointerException exp){
			System.out.println("URL Launching Issue! " +exp.getMessage());
		}
		return null;
		
		
	}

}
