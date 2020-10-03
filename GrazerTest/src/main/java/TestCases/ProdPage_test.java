package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.ProdPages;
import pages.TestUtil;

public class ProdPage_test extends basePackage.TestBase {
	
	LoginPage login;
	ProdPages Prod;
	Homepage Home;

public ProdPage_test()	
{
	super();
}

	@BeforeMethod
public void setUp() {
	initialization();
	
	login = new LoginPage();
	Prod = new ProdPages();
	Home = login.Home(prop.getProperty("username"), prop.getProperty("password"));
}
	@Test
	public void GetProd() 
	{
		Prod.prodselection();
	
	}	
	@AfterMethod
	public void Close(){
		driver.quit();
	}
	
}
