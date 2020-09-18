package browerdrivers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeClass;

public class Alldriverinitialization 
{
	public static void main(String[] args) 
	{
		String paramUrl ="", Chromepath ="";
		Properties prop = new Properties();
		try {
			
				String path = System.getProperty("user.dir"); 
				System.out.println(path); 
				System.setProperty("webdriver.chrome.driver","GrazerTest\\alldrivers");
	        	WebDriver driver= new ChromeDriver();
	        	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        	driver.get(prop.getProperty("url"));
	        	driver.manage().window().maximize();
	        	 driver.manage().deleteAllCookies();
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
		
		
	
//	String paramUrl ="", Chromepath ="", firefoxpath =""; 
//	
//	@BeforeClass
//	private String driverInitialization(String param )
//	{
//		Properties prop = new Properties();
//		try {
//		 paramUrl = this.driverInitialization(param.toString());
//		 
//		 String Name =  System.getProperty("paramUrl").toLowerCase();
//	        if (paramUrl.contains("chrome")) 
//	        {
//	        	Chromepath = "/GrazerTest/src/main/resources/alldrivers/chromedriver.exe";
//	        	System.setProperty("webdriver.chrome.driver",Chromepath); 
//	        	WebDriver driver= new ChromeDriver();
//	        	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//	        	driver.get(prop.getProperty("url"));
//	        	driver.manage().window().maximize();
//	        	 driver.manage().deleteAllCookies();
//	        	String title = driver.getTitle();
//	        	if(title.equals(""))
//	        	{
//	        		System.out.println("Login Successfully");
//	        	}
//	        	else
//	        	{
//	        		driver.close();
//	        		System.exit(0);
//	        	}	
//	        }
//	        if (paramUrl.contains("firefox")){
//	        	firefoxpath  = "/GrazerTest/src/main/resources/alldrivers/geckodriver.exe";
//	        	System.setProperty("webdriver.gecko.driver", firefoxpath);
//	        	WebDriver driver = new FirefoxDriver();
//	        	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//	        	driver.get(prop.getProperty("url"));
//	        	driver.manage().window().maximize();
//	        	 driver.manage().deleteAllCookies();
//	        	String title = driver.getTitle();
//	        	if(title.equals(""))
//	        	{
//	        		System.out.println("Login Successfully");
//	        	}
//	        	else
//	        	{
//	        		driver.close();
//	        		System.exit(0);
//	        	}	 	
//	        }
//		}
//			catch(Exception ex)
//			{
//				ex.printStackTrace();
//			}
//		 return "Initialization failed check the Log" ;				
//	}
//}
