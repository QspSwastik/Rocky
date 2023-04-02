package pom_class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.BaseTestMethod;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.ExcelLibrary;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class CreateNewTypeOfWorkPage extends BasePage implements AutoConstant
{
		//declaration
	public WebDriver driver;
		@FindBy(xpath="(//input[@type='text'])[4]")
		private WebElement nameTextfield;
		
		@FindBy (xpath="//input[@name='billable']")
		private WebElement catagorylink;
		
		@FindBy (xpath="//input[@id='billingRate_input']")
		private WebElement billingratetextfield;

		@FindBy(xpath="//input[@type='submit']")
		private WebElement createtypeofworklink;
		
		@FindBy(xpath="(//input[@type='button'])[1]")
		private WebElement cancelLink;
		
	
		//intialization
      public CreateNewTypeOfWorkPage  ( WebDriver driver)
		
		{
    	    this.driver=driver;
			PageFactory.initElements(driver, this);
		}

      //utilization
      
      public void nameMethod() throws IOException, InterruptedException
		{
    	  nameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name3, 0, 1));
    	  Thread.sleep(5000);
		}
		public void catagoryMethod()
		{
			catagorylink.click();
		}
		public void billingratemethod()
		{
			billingratetextfield.click();
		}
		public void createtypeofworkmethod() throws InterruptedException
		{
			javascriptclick(driver,createtypeofworklink);
			Thread.sleep(5000);
		}
		public void cancelmethod()
		{
          cancelLink.click();
        }
		
	}
		
		

