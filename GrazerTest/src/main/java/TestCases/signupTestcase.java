package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.TestUtil;
import pages.signup_page;

public class signupTestcase extends basePackage.TestBase {
	
	signup_page signup;
	LoginPage login;
	Homepage Home;

	//constructor initiated
	public signupTestcase()
	{		
		super();		
	}
	@BeforeMethod
	public void setUp() {
		initialization();	
		signup = new signup_page();
		//login = new LoginPage();
		//Home = login.Home(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void Signup()
	{
		signup.loginopen();
		signup.titlecheck();
		
	}
	@AfterMethod
	public void Close(){
		driver.quit();
	}
	
}
