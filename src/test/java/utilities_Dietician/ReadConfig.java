package utilities_Dietician;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 

{


	Properties pro;
	
	public ReadConfig() 
	{
		File src = new File("./Config/Config.properties"); 
		
	
	
	try
	{
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		
	}
	  catch (Exception e) 
	{
	System.out.println("Exception is "  +e.getMessage());
	
	}
}
	public String GetApplicationURL()
	{
		String URL = pro.getProperty("Baseurl");
		return URL;
	}
	public String GetUserName()
	{
		String username = pro.getProperty("UserName");
		return username;
	}
	public String GetPassword()
	{
		String password = pro.getProperty("Password");
		return password;
	}
	public String Getchromepath()
	{
		String Chromepath = pro.getProperty("chromepath");
		return Chromepath;
	}
	public String GetFirefoxpath()
	{
		String Firefoxpath = pro.getProperty("firefoxpath");
		return Firefoxpath;
	}
	public String GetEdgeDriver()
	{
		String Edgedriver = pro.getProperty("edgedriver");
		return Edgedriver;
	}
	
	
	
	
	
	
	
	}




