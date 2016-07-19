package vijay.drive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test {

	WebDriver driver;
	
	@Test
	public void doLogin()
	{
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");	
	}
	@BeforeTest
	public void doStart()
	{
		System.setProperty("webdriver.chrome.driver", "/src/test/java/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@AfterTest
	public void doStop()
	{
		driver.close();
		driver.quit();
	}
}
