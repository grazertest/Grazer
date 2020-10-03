package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tracking extends basePackage.TestBase {
	
	@FindBy(xpath = "((//button[contains(text(),'Track')])[1]")  // index should be changed based on items in the grid
	WebElement Track_Btn;
	
	@FindBy(xpath = "//span[@class='fs-18 fw-m fa fa-close fa-close-cls']")  
	WebElement Track_close;
	
	public tracking() {
		PageFactory.initElements(driver, this);
	}
	
	public void Tran_Prod()
	{
		System.out.println("Process completed");
		
	}
	
	
}
