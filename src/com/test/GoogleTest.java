package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod(groups = {"demo"})
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
	}
	
	@Test(groups = {"demo"})
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		System.out.println(title);
	
	}
	
	@Test(groups = {"demo"})
	public void googleLogoTest() {
		
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(groups = {"demo"})
	public void googleLinkTest() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	}
	
	
	@Test(priority = 3, groups = {"demo1"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority = 2, groups = {"demo1"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority = 1, groups = {"demo1"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups = {"demo2"})
	public void atest1() {
		System.out.println("atest1");
	}
	
	@Test(groups = {"demo2"})
	public void btest2() {
		System.out.println("btest2");
	}
	
	@Test(groups = {"demo2"})
	public void ctest3() {
		System.out.println("ctest3");
	}

	@AfterMethod(groups = {"demo"})
	public void tearDown() {
		
		driver.quit();
	}

}
