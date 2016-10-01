package mam.ukma.com.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import mam.ukma.com.base.UKMAPage;

public class Selenium extends UKMAPage{

	public static Logger logger=Logger.getLogger("devpinoyLogger");

	
	public Selenium(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
	
	public static void typeAndNext(WebElement target, String typeValue){
		logger.debug("|typeAndWait|" +target+"|"+typeValue+"|");
		try{
			if(target.isDisplayed()){
				if(target.isEnabled()){
					target.clear();
					target.sendKeys(typeValue);
					target.sendKeys(Keys.TAB);
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

	public static void selectByVisibleText(WebElement selectcLocator, String selectValue){
		
		try{
			Select select=new Select(selectcLocator);
			if(selectcLocator.isDisplayed()){
				if(selectcLocator.isEnabled()){
					select.selectByVisibleText(selectValue);
				}
				else
					Assert.fail("Targated dropdown field is not enabled!");
			}
			else
				Assert.fail("Targated dropdown field is not displayed!");
			}
		
		catch(NoSuchElementException exp){
			Assert.fail("Web Element "+selectcLocator.toString()+" is not present on the page! "+exp.getMessage());
		}
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +selectcLocator.getText()+ "||" +exp.getMessage());
		}
	}
	
	public static void selectByIndex(WebElement selectcLocator, int selectValue){
		
		try{
			Select select=new Select(selectcLocator);
			if(selectcLocator.isDisplayed()){
				if(selectcLocator.isEnabled()){
					select.selectByIndex(selectValue);
				}
				else
					Assert.fail("Targated dropdown field is not enabled!");
			}
			else
				Assert.fail("Targated dropdown field is not displayed!");
			}
		
		catch(NoSuchElementException exp){
			Assert.fail("Web Element "+selectcLocator.toString()+" is not present on the page! "+exp.getMessage());
		}
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +selectcLocator.getText()+ "||" +exp.getMessage());
		}
	}
		
	
	public static void hoverOnWebElement(WebDriver driver, WebElement hoverElement){
		logger.debug("| hoverOnWebElement | "+hoverElement);
		try{
			Actions action=new Actions(driver);
			action.moveToElement(hoverElement).build().perform();
		}
		catch(NoSuchElementException exp){
			Assert.fail("Web Element "+hoverElement.toString()+" is not present on the page! "+exp.getMessage());
		}  
		catch(StaleElementReferenceException exp){
			Assert.fail("Oops Not Attched yet!" +hoverElement.getText()+ "||" +exp.getMessage());
		}
	
	}
	
	public static void clickOnPage(WebDriver driver){
		try{
			Actions action=new Actions(driver);
			action.click().build().perform();
		}
		catch(WebDriverException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public static void waitForElementPresent(WebDriver driver, WebElement elementToBeClickable){
		logger.debug("| waitTillElementClickable |" +elementToBeClickable);
		try{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(elementToBeClickable));
		}
		catch(TimeoutException exp){
			Assert.fail(exp.getMessage());
		}
	}
	
	public static void waitForElementSelectable(WebDriver driver, WebElement elementToBeSelectable){
		logger.debug("| waitTillElementClickable |" +elementToBeSelectable);
		try{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		//	wait.until(ExpectedConditions.elementToBeClickable(elementToBeClickable));
			wait.until(ExpectedConditions.elementToBeSelected(elementToBeSelectable));
		}
		catch(TimeoutException exp){
			Assert.fail(exp.getMessage());
		}
	}
	
	public static void waitForElementVisible(WebDriver driver, WebElement elementToBeSelectable){
		logger.debug("| waitTillElementClickable |" +elementToBeSelectable);
		try{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		//	wait.until(ExpectedConditions.elementToBeClickable(elementToBeClickable));
			wait.until(ExpectedConditions.visibilityOf(elementToBeSelectable));
		}
		catch(TimeoutException exp){
			Assert.fail(exp.getMessage());
		}
	}


}
