package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import Generic.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.AddNewTaskPage;
import pom_class.CreateNewCustomer;
import pom_class.DeleteSettingsPage;

public class ActitimeCreateCustomer extends BaseTest
  {
   @Test
   public void createcustomer () throws IOException, InterruptedException
    {
	ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
	loginPage.loginMethod();
	
	ActitimeHomePage home =  new ActitimeHomePage(driver);
	home.tasksmethod();
	
	AddNewTaskPage opentaskpage = new AddNewTaskPage(driver);
	opentaskpage.addnewtaskmethod();
	opentaskpage.createnewcustomerMethod();

	CreateNewCustomer addnewcustomer = new CreateNewCustomer(driver);
	addnewcustomer.customertextfieldMethod();
	addnewcustomer.customerdescriptiontextfieldMethod();
	addnewcustomer.createcustomerMethod();	
	addnewcustomer.settingsMethod();
	DeleteSettingsPage delete = new DeleteSettingsPage(driver);
	delete.deleteMethod();
	delete.deletepermanentelyMethod();
   }
}