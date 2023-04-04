package pom_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookloginpage 
{
	public WebDriver driver;

	@FindBy (xpath= "//a[.='Create new account']")
	public WebElement newaccount;

	public Facebookloginpage  (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void NewaccountMethod() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newaccount);
		Thread.sleep(5000);
	}
}
