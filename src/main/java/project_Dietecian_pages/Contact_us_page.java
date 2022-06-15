package project_Dietecian_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_us_page 
{
	public class Signin_page 
	{

	WebDriver driver;
		
		public Signin_page(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		
		@FindBy(xpath="//input[@type='text']")
		@CacheLookup
		WebElement firstName;
		
		@FindBy(xpath="//input[@type='texts']")
		@CacheLookup
		WebElement lastName;
		
		@FindBy(xpath="")
		@CacheLookup
		WebElement Email;
		
		@FindBy(xpath="//input[@type='texts']")
		@CacheLookup
		WebElement subject;
		
		
		public void TypeUsername(String fname)
		{
			firstName.sendKeys(fname);
			
		}
		
		public void Typelastname(String lname)
		{
			lastName.sendKeys(lname);
		}
		

		public void TypeEmail(String email)
		{
			Email.sendKeys(email);
		}
		
		public  void Typesubject(String sub)
		{
			subject.sendKeys(sub);
	}
	}

}
