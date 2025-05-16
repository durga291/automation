package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
	WebElement ms = driver.findElement(By.xpath("//a[@href='Register.html']"));
	
	Actions act= new Actions(driver);
	
	act.contextClick(ms).build().perform();//for right click we use contextclick method
	
	

	}

}
