package fetchdata;

import org.testng.annotations.Test;
import pom_class.ActitimeLoginPage;

public class ActitimeMultipleUserLogin extends BaseTest
{
	@Test(dataProvider="loginData")	
	public void login(String username,String password) throws Exception
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginmethod(username, password);
		loginPage.validatehomepage();
	}
}