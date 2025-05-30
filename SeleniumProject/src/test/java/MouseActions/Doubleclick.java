package MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement web = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.doubleClick(web).build().perform();
		
		driver.switchTo().alert().accept();//for accepting alert
		
		

	}

}
