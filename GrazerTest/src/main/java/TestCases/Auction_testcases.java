package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AuctionPage;
import pages.Homepage;
import pages.LoginPage;

public class Auction_testcases extends basePackage.TestBase {
	
	LoginPage login;
	Homepage Home;
	AuctionPage auction;
	
	public Auction_testcases()
	{
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		
		login = new LoginPage();
		Home = new Homepage(); 
		auction = new AuctionPage();
		Home = login.Home(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void validation()
	{
		auction.verifyPaymenent();
		
	}	
	@Test(priority=2)
	public void auction()
	{
		auction.prodbuying();
		
	}
	@AfterMethod
	public void Close(){
		driver.quit();
	}
}
