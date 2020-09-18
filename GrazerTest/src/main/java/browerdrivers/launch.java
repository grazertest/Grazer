package browerdrivers;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) 
	{
		String paramUrl ="", Chromepath ="";
		Properties prop = new Properties();
		try {
				String path = System.getProperty("user.dir"); 
				System.out.println(path); 
				System.setProperty("webdriver.chrome.driver",path+"\\alldrivers\\chromedriver.exe");
	        	WebDriver driver= new ChromeDriver();
	        	driver.get("http://grazr.moblearn.net/");
	        	driver.manage().window().maximize();
	        	driver.manage().deleteAllCookies();
		        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        	String title = driver.getTitle();
	        	if(title.equals(""))
	        	{
	        		System.out.println("Login Successfully");
	        	}
	        	else
	        	{
	        		driver.close();
	        		System.exit(0);
	        }	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		}		
	}
