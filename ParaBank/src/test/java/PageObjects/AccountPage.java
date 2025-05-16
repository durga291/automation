package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends BasePage {
	
	//create constructor for accountpage
	
	public AccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Log Out']")
	WebElement btn_logout; //for logout button
	
	@FindBy(xpath="//b[normalize-space()='Welcome']")  
	WebElement msgheading; // for heading welcome and name of user
	
	
	public boolean isAccountPageExist() 
	{
		try
		{
			return (msgheading.isDisplayed());
		}
		catch (Exception e) 
		{
			return false;
		}
		
	}
	
	public void clicklogout() 
	{
		btn_logout.click();
	}

}
