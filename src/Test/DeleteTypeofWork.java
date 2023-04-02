package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;

public class DeleteTypeofWork extends BaseTest
{@Test
	public void deletetypeofwork() throws IOException, InterruptedException
	{
	ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
	loginPage.loginMethod();
	
	ActitimeHomePage home =  new ActitimeHomePage(driver);
	home.settingmethod();
	
	ActitimeSettingPage setting = new ActitimeSettingPage(driver);
	setting.typesofwork();
	
	ActitimeTypeOfWorkPage work = new ActitimeTypeOfWorkPage(driver);
	work.DeletenameMethod();
	
	}
	
}
