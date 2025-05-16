package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithOutDragandDrop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement  src =driver.findElement(By.xpath("//img[@id='angular']"));//sorce,whatever we want to drag
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='droparea']"));//destinations,whatever we want to drop
		
		Thread.sleep(1000);
		
		act.clickAndHold(src).moveToElement(dest).release(dest).perform(); 
		
		
		
		
	}

}
