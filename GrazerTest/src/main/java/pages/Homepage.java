package pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	
	@FindBy(xpath = "//button[contains(text(),'Choose Other Processor')]") 
	WebElement ChooseOtherProcessor;
	
	@FindBy(xpath = "//span[@class='checkmark']") 
	WebElement Checkmark;
	
	@FindBy(xpath = "//input[@name='userName']") 
	WebElement cardname;
	
	@FindBy(xpath = "//button[contains(text(),'Close')]") 
	WebElement Close_btn;
	
	@FindBy(xpath = "//input[@name='expYear']") 
	WebElement expYear;
	
	@FindBy(xpath = "//input[@name='expMonth']") 
	WebElement expMonth;
	
	@FindBy(xpath = "//button[contains(text(),'Make Payment')]") 
	WebElement MakePayment;
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement proceedtopay;
	
	//sellerprofile
	
	@FindBy(xpath = "//h4[contains(text(),'farm profile')]")
	WebElement FarmProfile;
	
	@FindBy(xpath = "//h4[contains(text(),'MY COMMUNITY')]")
	WebElement MyCommunity;
	
	@FindBy(xpath = "//button[contains(text(),'List a product')]") // ListProduct
	WebElement ListProduct;
	
	@FindBy(xpath = "//button[contains(text(),'Schedule a drop-off')]") //  schedule_dropoff
	WebElement Schedule_dropoff;
	
	
	
	
	//ProcessorProfile
	
	@FindBy(xpath = "//h4[contains(text(),'Order')]") // 
	WebElement Orders;
	
	@FindBy(xpath = "//h4[contains(text(),'MY CALENDAR')]") // 
	WebElement MyCalender;
	
	@FindBy(xpath = "//h6[contains(text(),'Today, There is no schedule!')]") // 
	WebElement ActioncenterNotification;
	
	@FindBy(xpath = "(//span[starts-with(text(),'Beef')])[1]") // date 4th
	WebElement beefselectioncalender;
	
	@FindBy(xpath = "(//span[starts-with(text(),'Goat')])[1]") // date 6th 
	WebElement Goatselectioncalender;
	
	@FindBy(xpath = "(//span[starts-with(text(),'Lamb')])[1]") //  date 4th
	WebElement Lambselectioncalender;
	
	@FindBy(xpath = "//li[contains(text(),'Orders')]") // order button
	WebElement orderbtn;
	
	@FindBy(xpath = "(//button[contains(text(),'Update status')])[1]") // order button
	WebElement Updatestatus;
	
	@FindBy(xpath = "(//input[@type='number'])[1]") //hanging weight animal
	WebElement Hangingweight;
	
	@FindBy(xpath = "(//input[@type='number'])[2]") // charges per pound
	WebElement charge_pound;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]") // charges per pound
	WebElement Submit;
	
	@FindBy(xpath = "//li[contains(text(),'Invoice')]") // charges per pound
	WebElement invoice;
	
	@FindBy(xpath = "//span[@class='fs-14 fw-sm fa fa-close fa-close-cls']") // charges per pound
	WebElement Closebtn;

	
	//constructor Initiated
	public Homepage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public ProdPages buyerpage() throws InterruptedException
	{
		if(Browseproducts.isDisplayed()==true)
		{
			if(MakePayment.isDisplayed()==false)
				{
			
				Browseproducts.click();
				if(personaldetails.isDisplayed()==true) 
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
			else
				{
				ChooseOtherProcessor.click();
				Thread.sleep(10);
				Checkmark.click();
				Thread.sleep(10);
				Close_btn.click();
				}
				}
			else
			{
				MakePayment.click();
				cardname.sendKeys("text");
				expYear.sendKeys("2024");
				expMonth.sendKeys("09");
				proceedtopay.click();
				Thread.sleep(5000);
			}
		}
		else if(ListProduct.isDisplayed()==true)
		{
			if(Schedule_dropoff.isDisplayed()==true)
			{
				Schedule_dropoff.click();
			}
			
			ListProduct.click();
			ProdPages prod = new ProdPages();
			prod.ListaProduct();
		}
		
		else if (MyCalender.isDisplayed()==true)
		{
			MyCalender.click();
			orderbtn.click();
			String str = "(//button[contains(text(),'Update status')])[1]";
			
			WebDriverWait wa = new WebDriverWait(driver,20);
			wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(str)));
			Updatestatus.click();
			
			String Prod_status_1 = "(//button[@class='btn btn-green btn-size'])[";
			String Prod_status_2 = "]";
			
			for(int j=1 ;j<=5;j++)
			{
				String Prod = Prod_status_1+j+Prod_status_2;
				WebElement ele = driver.findElement(By.xpath(Prod));
				ele.click();
				Thread.sleep(5);
			}
			invoice.click();//transaction page
			Hangingweight.sendKeys("20");
			charge_pound.sendKeys("5");
			Submit.click();
			Closebtn.click();		
			
//			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
//			   LocalDateTime now = LocalDateTime.now();  
//			   String currentDate = dtf.format(now);
//			   String getdate = currentDate.substring(8,11);
//			   System.out.println(getdate);
//			   System.out.println(currentDate);   
//			   
//			  if(currentDate==getdate) // picking any one beef list
//			  {
//				  for(int i=1;i<100;i++)
//				  {
//					  if(beefselectioncalender.isDisplayed()==true||Goatselectioncalender.isDisplayed()==true||Lambselectioncalender.isDisplayed()==true)
//					  {
//						  String getFirstitem = "(//span[@class='fc-title'])[";
//						  String  getLastitem = "]";
//						  String item = getFirstitem+i+getLastitem;
//						  driver.findElement(By.xpath(item)).click();
//						  break;  
//					  }
//					  else
//					  {
//						  
//						  System.out.println("product not displayed in the calender. Pick another date");
//					  }
//				  }
//			    
		}
		return new ProdPages();
	}
	public static String verifyDashboadPage(){
		
		String Dashboad = driver.findElement(By.xpath("//h4[contains(text(),' DASHBOARD')]")).getText();
		
		return Dashboad;
	}

}
