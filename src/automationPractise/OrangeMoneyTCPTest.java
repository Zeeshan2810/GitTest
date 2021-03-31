package automationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrangeMoneyTCPTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://omc-qualif7.orange.fr/tango");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[Contains(text(),'More information")).click();
		driver.findElement(By.id("overridelink")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("login_homepage_loginId")).sendKeys("Auto7");
		driver.findElement(By.id("login_homepage_password")).sendKeys("Tango@70");
		driver.findElement(By.id("loginSubmit")).click();
		
		driver.findElement(By.xpath("//a[Contins(text(),'Transfer Control Profile')]")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@name = 'domainCode']/following-sibling::input")));
		
		

	}

}
