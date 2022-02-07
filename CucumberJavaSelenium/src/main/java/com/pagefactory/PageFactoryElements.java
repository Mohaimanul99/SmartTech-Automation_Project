package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;


public class PageFactoryElements extends BaseClass {

	public PageFactoryElements() {
		
		PageFactory.initElements(driver,this);
	
		}
	@FindBy(xpath="//*[@id='collapsibleNavbar']")
	@CacheLookup
	
	private WebElement login;
	
	public WebElement getlogin() {
		return login;
	}
	
	@FindBy(id="//*[@id='email]")
	@CacheLookup
	private WebElement email;
	
	public WebElement getemail() {
		return email;
	}
	
	@FindBy(id="//*[@id='password']")
	@CacheLookup
	
	private WebElement password;
	
	public WebElement getpassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@id='signin-model']")
	@CacheLookup
	
	private WebElement signin;
	
	public WebElement getsignin() {
		return signin;
	}
	
}

