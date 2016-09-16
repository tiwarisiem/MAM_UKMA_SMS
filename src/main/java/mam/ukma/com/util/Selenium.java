package mam.ukma.com.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import mam.ukma.com.base.UKMAPage;

public class Selenium extends UKMAPage{
	
	public static Logger logger=Logger.getLogger("devpinoyLogger");

	public Selenium(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public static void type(WebElement locator, String value){
		logger.debug("| type | " +locator +" | "+value+"|");
		try{
			if(locator.isEnabled()){
				locator.clear();
				locator.sendKeys(value);
			}
			else{
				System.out.println("Text field element is disabled at the moment!");
			}
		}
		catch( NoSuchElementException exp){
			Assert.fail("Web Element "+locator.getText()+" is not present on the page! "+exp.getMessage());
		}
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +locator.getText()+ "||" +exp.getMessage());
		}
	}
	
	public static void clickAndWait(WebElement locator){
		logger.debug("| clickAndWait | "+locator);
		try{
			if(locator.isEnabled()){
				locator.click();
			}
			else{
				System.out.println("Button is disabled at the moment!");
			}
		}
		catch(NoSuchElementException exp){
			Assert.fail("Web Element "+locator.toString()+" is not present on the page! "+exp.getMessage());
		}
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +locator.getText()+ "||" +exp.getMessage());
		}
		
	}

}
