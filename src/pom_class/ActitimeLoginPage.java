package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import fetchdata.DataProviderActitime;

public class  ActitimeLoginPage 
{
	
	public WebDriver driver;
	//Declaration
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy (name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy (id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actiTimeIncLink;
	
	
	
	//intialization
	
	public ActitimeLoginPage ( WebDriver driver)	
	{  
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	
	public void loginmethod() throws Exception
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		loginButton.click();
		Thread.sleep(8000);
	}
	
	public void validatehomepage()
	{
//		String actualTitle=driver.getTitle();
//		if(actualTitle.contains("Time-Track"))
//		{
//			System.out.println("home page beatifully opened");
//		}
//		else
//		{
//			System.out.println("not beautifully present");
//		}
		
		String actualTitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, "actiTIME - Enter Time-Track");
		s.assertAll();
	}
	
	public void ForgotPasswordMethod()	
	{
		forgotyourpasswordLink.click();
		
	}
	public void actitimeincMethod()
	{
		actiTimeIncLink.click();
	}
}