package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import Generic.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;
import pom_class.CreateNewTypeOfWorkPage;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();

	
	}
} 