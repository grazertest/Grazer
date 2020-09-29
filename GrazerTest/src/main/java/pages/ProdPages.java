package pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdPages extends basePackage.TestBase {

	//seller Product Post fields
	
	@FindBy(xpath = "//input[@type='number']")  
	WebElement Price;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")  
	WebElement title;
	
	@FindBy(xpath = "//input[@class='form-control D-input pt-3']")  
	WebElement Description;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[1]") //whole  
	WebElement WholeProduct;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[2]") //share  
	WebElement shareProduct;
	
	@FindBy(xpath = "//input[@type='file']") // file Upload
	WebElement Uploadfile;
	
	@FindBy(xpath = "(//input[@type='text'])[2]") // preferred Processor
	WebElement preferredProcessor;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[3]") //  Processor selection
	WebElement processor_selection;
	
	@FindBy(xpath = "//button[contains(text(),'Close')]") // 
	WebElement Closebtn;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed to next step ')]") //  
	WebElement ProceedToNextStep;
	
	@FindBy(xpath = "//button[contains(text(),'List my product')]") //  
	WebElement ListmyProduct;
	
	// Buyer fields

	@FindBy(xpath = "//h5[contains(text(),'BEEF')]") //  beef
	WebElement Beef_btn;
	
	
	@FindBy(xpath = "///h5[contains(text(),'PORK ')]") //  Pork
	WebElement Pork_btn;
	
	@FindBy(xpath = "//h5[contains(text(),'GOAT')]") //  Goat
	WebElement Goat_btn;
	
	@FindBy(xpath = "//h5[contains(text(),'LAMB')]") //  lamb
	WebElement Lamb_btn;
	
	@FindBy(xpath = "(//a[starts-with(@href, \"/productview/\")])[1]")   //  Select the Product[AUCTION}
	WebElement SelecttheProd;
	
	public ProdPages() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public AuctionPage prodselection()  // Need to change the script 
	{
		if(Beef_btn.isDisplayed()==true)
		{
			Beef_btn.click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			SelecttheProd.click();
		}
		else if(Pork_btn.isDisplayed()==true)
		{
			Pork_btn.click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			SelecttheProd.click();
		}
		
		else if (Goat_btn.isDisplayed()==true)
		{
			Goat_btn.click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			SelecttheProd.click();
		}
		else if (Lamb_btn.isDisplayed()==true)
		{
			Lamb_btn.click();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			SelecttheProd.click();
		}
			return new AuctionPage();
	}
			
	}	
	