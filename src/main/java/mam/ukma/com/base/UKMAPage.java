package mam.ukma.com.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UKMAPage {
	
	public WebDriver driver;
	
	public UKMAPage(WebDriver driver){
		this.driver=driver;
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
