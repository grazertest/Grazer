package tests;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import browerdrivers.UrlLaunching;


public class AllTests extends browerdrivers.UrlLaunching
{
	
	@BeforeMethod
	private void LoginTests()
	{
		WebElement Loginbtn  = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Login')]")));
		
		if(Loginbtn.isEnabled()==true)
		{
			Loginbtn.click();
		}
		else
		{
			System.out.println("Element Not found");
		}
	
	}
	
}
