package pom_class;

import org.junit.runner.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class CreateNewCustomer 
{    
	public WebDriver driver;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement customertextfield;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerdescriptiontextfield;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement createcustomerlink;

@FindBy(xpath="//div[@class='greyButton cancelBtn']")
private WebElement cancellink;
@FindBy(xpath="(//div[.='swastik'])[1]/../..//div[@class='editButton']")
private WebElement settingsbutton;

@FindBy(xpath="//div[.='Customer with the specified name already exists']")
private WebElement errormessage;

public CreateNewCustomer ( WebDriver driver)

{    this.driver= driver;
	PageFactory.initElements(driver, this);
	
}


public void customertextfieldMethod(String name)
{
	customertextfield.sendKeys(name);
}
public void customerdescriptiontextfieldMethod(String details)
{
	customerdescriptiontextfield.sendKeys(details);
}
public void createcustomerMethod() throws InterruptedException
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()",createcustomerlink); 
	Thread.sleep(5000);
}
public void cancellinkMethod()
{
	cancellink.click();
}
public void alertMethod()
{
	driver.switchTo().alert().accept();
}
public void settingsMethod()
{
	settingsbutton.click();
} 	
public void verifyerrormessage() throws InterruptedException
{
	Thread.sleep(2000);
	String actualErrorMessage = errormessage.getText();	
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualErrorMessage, "Customer with the specified name already exists");
	s.assertAll();
 } 	
}