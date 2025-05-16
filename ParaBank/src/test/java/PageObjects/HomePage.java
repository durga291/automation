package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	// create constructor for homepage........ write homepage and click ctrl+space
	
	public HomePage (WebDriver driver) 
	{
		super(driver); // call the constructor of BasePage class
		
	}
	
	// object repository
	
	
	@FindBy(xpath="//a[normalize-space()='Register']") // for Register in given application
	WebElement txt_register; //here txt_register is  a variable of register whatever you will give.
	
	@FindBy(xpath="//input[@name='username']") //  for username  
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']") //for password
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value='Log In']") //for login button
	WebElement txt_login;
	
	
	//method for above register
	
	public void clickRegister()
	{
		txt_register.click();
	}
	
	public void setusername(String uname)
	{
		txt_username.sendKeys(uname);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clicklogin()
	{
		txt_login.click();
	}

}
