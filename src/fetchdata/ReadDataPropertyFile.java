package fetchdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataPropertyFile 
{
	public WebDriver driver;
	@Test
	public void readdatafrompfile() throws IOException, InterruptedException
	{
       FileInputStream fis = new FileInputStream("./property/config.property");
       Properties pro = new Properties();
       pro.load(fis);
       
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.findElement(By.id(pro.getProperty("usernameLocator"))).sendKeys(pro.getProperty("username"));
		driver.findElement(By.name(pro.getProperty("passwordLocator"))).sendKeys(pro.getProperty("password"));
	}
}
