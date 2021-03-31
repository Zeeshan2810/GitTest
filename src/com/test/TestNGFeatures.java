package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test(groups = {"demo2"})
	public void loginTest() {
		
		System.out.println("Login Page");
		//int i = 9/0;// Arithmetic error, due to which test case will be failed and others test case will be skipped
		//System.out.println(i);
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest() {
		
		System.out.println("Home Page");
	}
	
	
	@Test(dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		
		System.out.println("Search Page");
	}
	
	

}
