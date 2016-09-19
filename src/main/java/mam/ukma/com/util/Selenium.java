package mam.ukma.com.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import mam.ukma.com.base.UKMAPage;

public class Selenium extends UKMAPage{
	
	public static Logger logger=Logger.getLogger("devpinoyLogger");

	public Selenium(WebDriver driver) {
		super(driver);
		
	}
	
	public static void type(WebElement target, String typeValue){
		logger.debug("|type|" +target+"|"+typeValue+"|");
		try{
			if(target.isDisplayed()){
				if(target.isEnabled()){
					target.clear();
					target.sendKeys(typeValue);
				}
				else{
					System.out.println("Text field element is disabled at the moment!");
				}
			}
			
		}
		catch( NoSuchElementException exp){
			Assert.fail("Web Element "+target.getText()+" is not present on the page! "+exp.getMessage());
		}
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +target.getText()+ "||" +exp.getMessage());
		}
	}
	
	public static void typeAndWait(WebElement target, String typeValue){
		logger.debug("|typeAndWait|" +target+"|"+typeValue+"|");
		try{
			if(target.isDisplayed()){
				if(target.isEnabled()){
					target.clear();
					target.sendKeys(typeValue);
				}
				else{
					System.out.println("Text field element is disabled at the moment!");
				}
			}
			
		}
		catch( NoSuchElementException exp){
			Assert.fail("Web Element "+target.getText()+" is not present on the page! "+exp.getMessage());
		}
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +target.getText()+ "||" +exp.getMessage());
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

	public static void selectAndWait(){
		
	}

	public static void waitForElementPresent(WebDriver driver, WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
