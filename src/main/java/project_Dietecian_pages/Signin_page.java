package project_Dietecian_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement signinButton;
	
	
	public void TypeUsername(String uname)
	{
		UserName.sendKeys(uname);
		
	}
	
	public void TypePassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	
	public  void ClickSignButton()
	{
		signinButton.click();
}
}