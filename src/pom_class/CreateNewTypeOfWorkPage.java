package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTypeOfWorkPage 
{
		//declaration
	
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
    	   
			PageFactory.initElements(driver, this);
		}

      //utilization
      
      public void nameMethod()
		{
			nameTextfield.sendKeys("swastik mohapatra");
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
			createtypeofworklink.click();
			Thread.sleep(5000);
		}
		public void cancelmethod()
		{
          cancelLink.click();
        }
		
	}
		
		

