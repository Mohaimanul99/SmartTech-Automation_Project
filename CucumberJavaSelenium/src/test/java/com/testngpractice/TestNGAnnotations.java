package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("I am before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("I am before Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("I am before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("I am before method");
		
	}
	
	@Test        //(invocationCount = 10) running the test multiple times     //priority for which test to run first
	public void test1() {
		
		System.out.println("I am the Test Login1");
	}
	
/*	@Test(priority=3)              //multiple tests
	public void test2() {
		
		System.out.println("I am the Test Login2");
	}  
	
	@Test(priority=2)
	public void test3() {
		System.out.println("I am the Test Login3");
		
	} 
*/
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("I am after Method");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("I am after Class");
	}
	@AfterTest
	public void afterTest() {
		
		System.out.println("I am after Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("I am after Suite");
		
	}
	
}