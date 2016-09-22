package mam.ukma.com.base;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.common.TopMenu;

public class UKMAPage {
	
	public WebDriver driver;
	private TopMenu topMenu;
	
	public UKMAPage(WebDriver driver){
		this.driver=driver;
		topMenu=PageFactory.initElements(driver, TopMenu.class);
	}
	
	
	public TopMenu getTopMenu(){
		return topMenu;
	}
	
	
	public boolean isElementPresent(String xPath){
		int webelement=driver.findElements(By.xpath(xPath)).size();
		try {
			if(webelement==0){
				return false;
			}
			else
				return true;
			
		} catch (NoSuchElementException e) {
			System.out.println("Web Element"+xPath.toString()+" is not present on the page!");
			return false;
		} 
		
	} 	
 
}
