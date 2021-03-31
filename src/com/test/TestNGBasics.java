package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void setUp() {
		
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	@BeforeMethod(groups = {"demo"})		//@BeforeMethod will always be executed before every @Test(test case)
	public void login() {
		
		System.out.println("Login to App");
	}
	
	@Test(groups = {"demo"})
	public void gmailTitleTest() {
		
		System.out.println("gmail Title Test");
	}
	
	@Test(groups = {"demo"})
	public void searchButtonTest() {
		
		System.out.println("Serch Button Test");
	}
	
	@AfterMethod(groups = {"demo"})	 //@AfterMethod will always be executed after every @Test(test case)
	public void logout() {
		
		System.out.println("Logout from App");
	}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}
	
	
	@AfterTest
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("Report Generated");
	}
	
}
