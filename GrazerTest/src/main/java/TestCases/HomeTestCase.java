package TestCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.TestUtil;

public class HomeTestCase extends basePackage.TestBase {
	
	LoginPage login;
	Homepage Home;
	TestUtil testUtil;
	
	public HomeTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		
		login = new LoginPage();
		Home = login.Home(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyDahboardPage() throws IOException{
		String homePage = Homepage.verifyDashboadPage();
		Assert.assertEquals(homePage, "DASHBOARD");
		
	}
	
	@Test(priority=2)
	public void verifyusers() throws InterruptedException, IOException{
		
		Home.buyerpage();
		testUtil.takeScreenshotAtEndOfTest();
		
	}
	@AfterMethod
	public void Close(){
		driver.quit();
	}

}
