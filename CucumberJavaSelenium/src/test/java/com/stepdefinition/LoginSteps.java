package com.stepdefinition;

import com.baseclass.BaseClass;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseClass {
	

	@Given("User can open any browser")
	public void user_can_open_any_browser() {
		//SetUp();
		
		
	}

	@Given("User is able to enter url")
	public void user_is_able_to_enter_url() {
		driver.get("https://www.hotwire.com/");
	
	    
	}

	@When("User clicks on the Login in button")
	public void user_clicks_on_the_login_in_button() {
	   driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/button[1]/span")).click();
	    
	}

	@When("User enters email and password")
	public void user_enters_email_and_password() {
		driver.findElement(By.id("email")).sendKeys("smarttech123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SmartTech123");
	}

	@When("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		driver.findElement(By.xpath("//*[@id=\"signin-model\"]/div/div/div[2]/form/div/div[6]/button")).click();
	    
	}

	@Then("User is able to verify successful login & verify page title")
	public void user_is_able_to_verify_successful_login_verify_page_title() {
		System.out.println("The title of the website is : "+driver.getTitle());
		String expected = "Sign in to Hotwire - Hotwire";
		Assert.assertEquals(expected, driver.getTitle());
		 
	
	
}
	
}
