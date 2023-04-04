package fetchdata;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FetchdataFromHashmap extends BaseTest
 {

public static HashMap<String, String> getcredentialMap()
 {
HashMap<String, String> hash = new HashMap<>();
hash.put("admin","admin:manager");
hash.put("distributor","bikram:beytala");
hash.put("sellor","admin:swastik44");
hash.put("buyer","monkey:monkey33");
hash.put("user","ashu:ashu@123");
return hash;
 }

@Test
public void login() 
  {
driver.findElement(By.id("username")).sendKeys(getusername("sellor"));
driver.findElement(By.id("username")).sendKeys(getpassword("sellor"));
  }

public static String getusername(String role)
  {
	String username = getcredentialMap().get(role);
	return username.split(":")[0];
  }
public static String getpassword(String role)
  {
	String password = getcredentialMap().get(role);
	return password.split(":")[1];
  }

    }

