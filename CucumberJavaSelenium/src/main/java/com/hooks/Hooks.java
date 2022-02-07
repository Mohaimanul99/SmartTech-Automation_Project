package com.hooks;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void initialization(){
	//SetUp();
	}

	@After 
	public void teardown() {
	driver.quit();
	}
	
}
