package com.baseclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BaseClass {

	
	//How to open browser using selenium?
	//1. Create the main method
	//2. System.setProterty(specify the driver, and location)
	//3. Create an object of the driver
	
	public static WebDriver driver;
	@BeforeMethod
	@Parameters(value={"browser"})                  //testng.xml file
	public void SetUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //UpCasting Polymorphism 
		
		
		}	          //CrossBrowser Testing
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();  //UpCasting Polymorphism 
		} 
		
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.msedge.driver", "./Driver/msedgedriver.exe");
			driver = new EdgeDriver();  //UpCasting Polymorphism 
		} 
		
		else {
			System.out.println("The browser does not exit");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void openApplicaiton() {
		driver.get("https://www.google.com/");
	}

}
