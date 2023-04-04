package pom_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookCreateCustomerpage 
{	
	public WebDriver driver;
	
	@FindBy (xpath= "//input[@name='firstname']")
	public WebElement firstname;
	
	@FindBy (xpath= "//input[@name='lastname']")
	public WebElement lastname;
	
	@FindBy (xpath= "//input[@name='reg_email__']")
	public WebElement mobileno;
	
	@FindBy (xpath= "//input[@data-type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//img[@class='_8idr img']")
	private WebElement closeLink;
	
	
	public FacebookCreateCustomerpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void FirstnameMethod(String fname)
	{
		 firstname.sendKeys(fname);
	}
	public void LastnameMethod(String lname)
	{
		lastname.sendKeys(lname); 
	}
	public void MobilenoMethod(String mno)
	{
		mobileno.sendKeys(mno);
	}
	public void PasswordMethod(String pass)
	{
		password.sendKeys(pass);
	}	
	
	public void CloseMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", closeLink);
	}	
  }