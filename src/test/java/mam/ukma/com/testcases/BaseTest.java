package mam.ukma.com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import mam.ukma.com.pages.LaunchPage;

public class BaseTest {
	
WebDriver driver;
	
	public LaunchPage launchBrowser(String browser){
		try{
			if(browser.equalsIgnoreCase("mozilla")){
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Tools\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Tools\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(NullPointerException exp){
			System.out.println("Browser "+browser.toString()+" is not exist! "+exp.getMessage());
		}
		
		return PageFactory.initElements(driver, LaunchPage.class);
		
	}
	
}
