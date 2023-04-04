package fetchdata;

import org.testng.annotations.Test;
import pom_class.FacebookCreateCustomerpage;
import pom_class.Facebookloginpage;

public class FacebookCreateCustomer extends BaseTest
{
	@Test(dataProvider="createnewcustomer")
	public void fbcustomer (String fname,String lname,String mno,String pass) throws InterruptedException
	{
		Facebookloginpage login = new Facebookloginpage(driver);
		login.NewaccountMethod();
		
		FacebookCreateCustomerpage newcustomer = new FacebookCreateCustomerpage(driver);
		newcustomer.FirstnameMethod(fname);
		newcustomer.LastnameMethod(lname);
		newcustomer.MobilenoMethod(mno);
		newcustomer.PasswordMethod(pass);
		newcustomer.CloseMethod();
		System.out.println("-------execution complete----------");
	}
}