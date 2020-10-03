package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup_page extends basePackage.TestBase {
	
	
	@FindBy(xpath = "//h4[contains(text(),'Register')]")
	WebElement Register_Tagname;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement Firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement Lastname;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement EmailAddress;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement Password;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[1]")
	WebElement Buy_RB;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[2]")
	WebElement sell_RB;
	
	@FindBy(xpath = "(//span[@class='checkmark'])[3]")
	WebElement Processor_RB;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Register_btn;
	
	//constructor Initiated
		public signup_page() 
		{
			PageFactory.initElements(driver, this);
		}
		
		public LoginPage loginopen()
		{
			Firstname.sendKeys(prop.getProperty("firstname"));
			Lastname.sendKeys(prop.getProperty("lastname"));
			EmailAddress.sendKeys(prop.getProperty("EmailAddress"));
			Password.sendKeys(prop.getProperty("password"));
			ConfirmPassword.sendKeys(prop.getProperty("confirmPassword"));
			
			if(Buy_RB.isSelected()==true||sell_RB.isSelected()==true||Processor_RB.isSelected()==true)
			{
				Register_btn.click();
			}
			return new LoginPage();
		}
		
		public void titlecheck()
		{
			Register_Tagname.getText();
		}
		
}
