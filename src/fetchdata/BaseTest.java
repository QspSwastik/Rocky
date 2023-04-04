package fetchdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;

public class BaseTest extends DataProviderActitime

{
	public WebDriver driver;

	@BeforeSuite
	public void executionStart()
	{
		System.out.println("execution start");
	}

	@BeforeClass
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() throws InterruptedException 
	{
	   driver.quit();
	}

	@AfterSuite
	public void executioncompled()
	{
		System.out.println("execution completed");
	}
}