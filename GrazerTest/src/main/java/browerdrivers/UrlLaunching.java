package browerdrivers;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;



public class UrlLaunching {
		String paramUrl ="", Chromepath ="", firefoxpath ="", browsparam = ""; public WebDriver driver;
		String path = System.getProperty("user.dir"); 
		@BeforeTest
		public String getDriverPath(String userparam) 
	{
		browsparam = this.getDriverPath(userparam).toLowerCase();
		{
			Properties prop = new Properties();
			try {
			 String Name =  System.getProperty("paramUrl").toLowerCase();
		        if (browsparam.contains("chrome")) 
		        {
					System.setProperty("webdriver.chrome.driver",path+"\\alldrivers\\chromedriver.exe");
		            driver= new ChromeDriver();
		        	driver.get(prop.getProperty("url"));
		        	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		        	driver.manage().window().maximize();
		        	 driver.manage().deleteAllCookies();
		        	String title = driver.getTitle();
		        	if(title.equals("Grazr"))
		        	{
		        		System.out.println("Login Successfully");
		        	}
		        	else
		        	{
		        		driver.close();
		        		System.exit(0);
		        	}	
		        }
		        if (browsparam.contains("firefox")){ 
		        	System.setProperty("webdriver.chrome.driver",path+"\\alldrivers\\geckodriver.exe");
		        	WebDriver driver = new FirefoxDriver();
		        	driver.get(prop.getProperty("url"));
		        	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		        	driver.manage().window().maximize();
		        	 driver.manage().deleteAllCookies();
		        	String title = driver.getTitle();
		        	if(title.equals("Grazr"))
		        	{
		        		System.out.println("Login Successfully");
		        	}
		        	else
		        	{
		        		driver.close();
		        		System.exit(0);
		        	}	 	
		        }
			}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}			
		}
		return userparam;
	}		
}
