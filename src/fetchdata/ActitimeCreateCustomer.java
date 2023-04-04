package fetchdata;

import org.testng.annotations.Test;

import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.AddNewTaskPage;
import pom_class.CreateNewCustomer;

public class ActitimeCreateCustomer extends BaseTest
{

	@Test()	
	public void login() throws Exception
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginmethod();
	}

	@Test(dataProvider="customerData" , dependsOnMethods = "login")
	public void userCreated(String name,String details) throws InterruptedException
	{
		ActitimeHomePage homepage = new ActitimeHomePage(driver);
		homepage.tasksmethod();

		AddNewTaskPage opentaskpage = new AddNewTaskPage(driver);
		opentaskpage.addnewtaskmethod();
		opentaskpage.createnewcustomerMethod();

		CreateNewCustomer addnewcustomer = new CreateNewCustomer(driver);
		addnewcustomer.customertextfieldMethod(name);
		addnewcustomer.customerdescriptiontextfieldMethod(details);
		addnewcustomer.createcustomerMethod();	
	}
}