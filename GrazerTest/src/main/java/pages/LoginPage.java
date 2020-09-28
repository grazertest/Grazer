package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends basePackage.TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//span[@class='checkmark']")
	WebElement RememberMe;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(xpath="(//a[contains(text(),'Register now')])[2]")
	WebElement Registernow;
	
	@FindBy(xpath="//a[contains(text(),'here')]")
	WebElement RecoverPassword;
	
	@FindBy(xpath="//a[contains(text(),'Listings')]")
	WebElement Listings;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public Homepage Home(String username, String Password)
	{
		this.EmailAddress.sendKeys(username);
		this.Password.sendKeys(Password);
		Loginbtn.click();
		return new Homepage();
	}

	
}
