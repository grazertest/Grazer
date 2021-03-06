package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuctionPage extends basePackage.TestBase  {
	
	//whole Product
	
	
	@FindBy(xpath = "//label[starts-with(text(),'Whole')]")  
	WebElement Whole_Prod;	
	
	@FindBy(xpath = "(//label[contains(text(),'Quarter')])[1]")  
	WebElement shared_Prod_1;
	
	@FindBy(xpath = "(//label[contains(text(),'Quarter')])[2]")  
	WebElement shared_Prod_2;
	
	@FindBy(xpath = "(//label[contains(text(),'Quarter')])[3]")  
	WebElement shared_Prod_3;
	
	@FindBy(xpath = "(//label[contains(text(),'Quarter')])[4]")  
	WebElement shared_Prod_4;
	
	@FindBy(xpath = "//button[contains(text(),'Buy now')]")  
	WebElement buynow;
	
	@FindBy(xpath = "//button[@class='btn btn-green bg-white txt-green fw-m']")  
	WebElement ViewfarmersProfile;
	
	@FindBy(xpath = "//p[contains(text(),'See approved processors')]")  
	WebElement seeApprovedProcessor;
	
	
	@FindBy(xpath = "//button[contains(text(),'Add to watchlist')]")  
	WebElement AddtowatchList;
	
	@FindBy(xpath = "//a[contains(text(),'View products ')]")  
	WebElement ViewProducts;
	
	@FindBy(xpath = "//span[@class='checkmark']")  //whole product checkbox
	WebElement checkbox;
	
	// shared products
	@FindBy(xpath = "(//span[@class='checkmark'])[1]")  
	WebElement fourQuartershare;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[2]")  
	WebElement twoQuartershare;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[3]")  
	WebElement threeQuartershare;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[4]")  
	WebElement OneQuartershare;
	
	@FindBy(xpath = "//button[contains(text(),'Buy now')]")  
	WebElement sharedbuynow;
	
	@FindBy(xpath = "//div[contains(text(),'Payment')]")  
	WebElement PaymentText;
	
	@FindBy(xpath = "//input[@name='cardNumber']")  
	WebElement cardNumber;
	
	@FindBy(xpath = "//input[@name='userName']")  
	WebElement cardName;
	
	@FindBy(xpath = "//input[@name='expYear']")  
	WebElement expYear;
	
	@FindBy(xpath = "//input[@name='expMonth']")  
	WebElement expMonth;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed to Pay ')]")  
	WebElement ProceedtoPay;
	
	public AuctionPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public boolean verifyPaymenent(){
		return PaymentText.isDisplayed();
	}
	
	public tracking prodbuying()
	{
		//whole prod
		
		if(Whole_Prod.isDisplayed()==true)
		{
			buynow.click();
			
			if(cardNumber.isDisplayed()==true)
			{
				cardName.sendKeys("test");
				expYear.sendKeys("2025");
				expMonth.sendKeys("09");
				ProceedtoPay.click();
				
				return new tracking();
			}
			else
			{	
				// Prod Not saving. Later ll add cont
			}
					
		}
		else if(shared_Prod_1.isSelected()||shared_Prod_2.isSelected()||shared_Prod_3.isSelected()||shared_Prod_4.isSelected())
		{
			buynow.click();
			if(cardNumber.isDisplayed()==true)
			{
				cardName.sendKeys("test");
				expYear.sendKeys("2025");
				expMonth.sendKeys("09");
				ProceedtoPay.click();
				
				return new tracking();
		}
			else
			{
							// Prod Not saving. Later ll add cont
			}
	}
		return new tracking();
}
}
