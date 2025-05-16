package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutDragandDrop1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/test/drag_drop.html"); 
		
		 Actions a = new Actions(driver); 
		 
		WebElement source = driver.findElement(By.xpath("//a[normalize-space()='BANK']")); 
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));  
		
		Thread.sleep(2000); 
		 
		 a.clickAndHold(source).moveToElement(des).release(des).perform();

	}

}
