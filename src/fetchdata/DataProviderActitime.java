package fetchdata;

import org.testng.annotations.DataProvider;

public class DataProviderActitime 
{
	@DataProvider(name = "loginData")
	public Object[][] passLoginData()
	{
		Object[][] data1= {							
							{"admin" , "admin"} , 
							{"swastik" , "swastik"} , 
							{"ashu" , "ashu"} , 
							{"admin" , "manager"} , 
							
						};
		return data1;
	}
	
	@DataProvider(name = "customerData")
	public Object[][] passCustomerData()
	{
		Object[][] data2= {
							{"ashutosh" , "Ashutosh is a good programmer"} , 
							{"swastik" , "Swastik is a good drinker"} ,
							{"pratyusha" , "Pratyusha is a good dancer"},
							{"balaram" , "Balaram is a good reeler"} ,
							{"suvendu" , "Suvendu is a good rider"}
						};
		return data2;
	}
//	@DataProvider(name = "createnewcustomer")
//	public Object[][] passcreatecustomer()
//	{
//		Object[][]data3= {
//							{"swastik", "mohapatra","9658606613","swastik@123"},
//							{"swasti", "mohapatr","965860661","swastik@12"},
//							{"swast", "mohapat","96586066","swastik@1"},
//							{"swas", "mohapa","9658606","swastik@"},
//							{"swa", "mohap","965860","swastik"}
//						  };
//		return data3;
	}
