package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;

public class Login extends basePackage.TestBase {
	
	LoginPage Login;
	Homepage home;
	
	public Login()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		Login = new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPagetitle()
	{
		String gettitle = LoginPage.validateLoginPageTitle();
		Assert.assertEquals(gettitle, "Grazr");
		
	}
	@Test(priority=2)
	public void loginTest()
	{
		home = Login.Home(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
