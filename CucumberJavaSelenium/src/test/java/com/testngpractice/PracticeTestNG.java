package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PracticeTestNG {

		WebDriver driver;
		
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		


	}

	@Test
	public void openApplication() {
		
		driver.get("https://www.facebook.com/");
	}
	
	@AfterTest
	public void closeApplicaiton() {
		
	}
}
