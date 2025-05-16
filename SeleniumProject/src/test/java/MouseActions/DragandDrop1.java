package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement  src =driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover ui-state-focus']"));//sorce,whatever we want to drag
		
		WebElement dest = driver.findElement(By.xpath(""));//destinations,whatever we want to drop
		
		act.dragAndDrop(src, dest).build().perform();

	}

}
