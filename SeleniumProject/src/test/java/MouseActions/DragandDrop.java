package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement  src =driver.findElement(By.xpath("//img[@id='angular']"));//src,whatever we want to drag
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='droparea']"));//destinations,whatever we want to drop
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, dest).build().perform();
		
		driver.close();
		

	}

}
