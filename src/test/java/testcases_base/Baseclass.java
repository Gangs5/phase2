package testcases_base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities_Dietician.ReadConfig;





	public  class Baseclass 
	{
		ReadConfig readconfig = new ReadConfig();
		public String baseURL = readconfig.GetApplicationURL();
		public String UserName = readconfig.GetUserName();
		public String Password = readconfig.GetPassword();
		
		public static WebDriver driver;
		 
		
		
		
			 public  void Startbrowser(String browser) throws Exception
		     {
		    	if(browser.equals("chrome"))
		    	{
		    		WebDriverManager.chromedriver().setup();
		    		  driver = new ChromeDriver();
		    		 //driver.get(baseURL);
		    		    
		    	}
		    	else if(browser.equals("edgedriver"))
		    	{
		    		WebDriverManager.edgedriver().setup();  
		    		driver = new EdgeDriver();
		    	}
		    	else if(browser.equals("firefox"))
		    	{
		    		
		    		WebDriverManager.firefoxdriver().setup();  		    		
		    		driver = new FirefoxDriver();
		    	}
		    	else 
		    	{
		    		System.out.println("we dont support this browser");
		    		
		    	}

		    	driver.get(baseURL);
		    	
		     }
			 public void teardown()
				{
					driver.quit();
				}
		     }		     

