package automationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Execution started.");
		//System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		 driver.get("https://www.google.com/");
		 Thread.sleep(1000);
		 WebElement element = driver.findElement(By.name("q"));
		 element.sendKeys("Money Control");
		 Thread.sleep(1000);
		 WebElement element1 = driver.findElement(By.name("btnK"));
		 element1.click();
		 driver.quit();
		 System.out.println("Execution ending-- Webdriver session is closed.");

	}

}
