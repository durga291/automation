package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	//create constructor..... simply write basepage and ctrl+space......usees is initialise varaible
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) 
	{
		this.driver =driver;     //same class that time we have to use this keyword
		
		
		PageFactory.initElements( driver,  this);
		
		
	}

}
