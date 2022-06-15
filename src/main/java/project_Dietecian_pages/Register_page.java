package project_Dietecian_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page 
{


public WebDriver driver;
	
	public Register_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);;
		
	}
	 
	@FindBy(id="")
	//@CacheLookup
	public WebElement Firstname;
	
	@FindBy(id="")
	//@CacheLookup
	public WebElement Lastname;
	@FindBy(id="")
	//@CacheLookup
	public WebElement mobilenumber;
	@FindBy(id="")
	//@CacheLookup
	public WebElement Email;
	@FindBy(id="")
	//@CacheLookup
	public WebElement Password;
	@FindBy(id="")
	//@CacheLookup
	public WebElement SignupButton;
	
	public void TypeFirstname(String Fname)
	{
		Firstname.sendKeys(Fname);
		
	}
	
	
	public void TypeLastname(String Lname)
	{
		Lastname.sendKeys(Lname);
	}
	
	public void Typemobilenumber(CharSequence[] Mobile)
	{
		mobilenumber.sendKeys( Mobile);
		
	}
	public void TypeEmail(Object email )
	{
		Email.sendKeys((CharSequence[]) email);
	}
	
	public void TypePassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public  void  clickSignupButton()
	{
		 SignupButton.click();
	
}
}