package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends basePackage.TestBase {
	
	//Buyer Profiles
	@FindBy(xpath = "//p[contains(text(),'There is no Notification')]")
	WebElement No_notifications;
	
	@FindBy(xpath = "//a[contains(text(),'Listings')]")
	WebElement Listings;
	
	@FindBy(xpath = "//h4[contains(text(),'Transactions')]")
	WebElement Transactions;
	
	@FindBy(xpath = "//h4[contains(text(),'my profile')]")
	WebElement my_profile;
	
	@FindBy(xpath = "//h4[contains(text(),'Watchlist')]")
	WebElement Watchlist;
	
	@FindBy(xpath = "//h4[contains(text(),'Tracker')]")
	WebElement Tracker;
	
	@FindBy(xpath = "//h4[contains(text(),'MESSAGES')]")
	WebElement MESSAGES;
	
	@FindBy(xpath = "//h4[contains(text(),'Favourite farms')]")
	WebElement Favourite_farms;
	
	@FindBy(xpath = "//button[contains(text(),'Browse products')]") // browseProducts
	WebElement Browseproducts;
	
	@FindBy(xpath = "//h3[contains(text(),'Personal Details')]") // 
	WebElement personaldetails;
	
	@FindBy(xpath = "(//input[@class='form-control D-input'])[4]") 
	WebElement MobileNumber;
	
	@FindBy(xpath = "(//select[@type='text'])[1]") 
	WebElement StateSelection;
	
	@FindBy(xpath = "(//select[@type='text'])[2]") 
	WebElement citySelection;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]") 
	WebElement Savebtn;
	

	//sellerprofile
	
	@FindBy(xpath = "//h4[contains(text(),'farm profile')]")
	WebElement FarmProfile;
	
	@FindBy(xpath = "//h4[contains(text(),'MY COMMUNITY')]")
	WebElement MyCommunity;
	
	@FindBy(xpath = "//button[contains(text(),'List a product')]") // ListProduct
	WebElement ListProduct;
	
	//ProcessorProfile
	
	@FindBy(xpath = "//h4[contains(text(),'Order')]") // 
	WebElement Orders;
	
	@FindBy(xpath = "//h4[contains(text(),'MY CALENDAR')]") // 
	WebElement MyCalender;
	
	@FindBy(xpath = "//h6[contains(text(),'Today, There is no schedule!')]") // 
	WebElement ActioncenterNotification;
	
	//constructor Initiated
	public Homepage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public ProdPages buyerpage()
	{
		if(Browseproducts.isDisplayed()==true)
		{
		Browseproducts.click();
			if(personaldetails.isDisplayed()==true) //Kindly Update the profile
				{
				
				MobileNumber.sendKeys("1234567890");
				WebDriverWait wait = new WebDriverWait(driver,50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@type='text'])[1]")));
				Select sel = new Select(StateSelection);
				sel.selectByIndex(10);
				WebDriverWait waits = new WebDriverWait(driver,50);
				waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//select[@type='text'])[2]")));
				Select city = new Select(citySelection);
				sel.selectByIndex(1);
				Savebtn.click();
				
			}
		}
		else if(ListProduct.isDisplayed()==true)
		{
			ListProduct.click();
		}
		
		else if (MyCalender.isDisplayed()==true)
		{
			//dummy content.
		}
		return new ProdPages();
	}

	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

}
