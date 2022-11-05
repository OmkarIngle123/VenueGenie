package com.crm.generic.utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void configureBS() {	
		System.out.println("Connect to the database");	
	}
	
	@BeforeTest
	public void configureBT() {
		System.out.println("Execute the script in the parallel mode");
	}
	
	@BeforeClass
	public void configureBC() {
		System.out.println("Launching the browser");
	}
	
	@BeforeMethod
	public void configureBM() {
		System.out.println("login to the application");
	}
	
	@AfterMethod
	public void configureAM() {
		System.out.println("logout from the application");
	}
	
	@AfterClass
	public void configureAC() {
		System.out.println("close the browser");
	}
	
	@AfterTest
	public void configureAT() {
		System.out.println("close parallel mode");
	}
	
	@AfterSuite
	public void configureAS() {
		System.out.println("disconnect from database");
}
}