package ScrollUpandDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");				 
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement minslider = driver.findElement(By.xpath("//span[@tabindex='0']"));
		
		System.out.println("default location of minslider:" +minslider.getLocation());
		
		act.dragAndDropBy(minslider, 100, 250).perform();
		
		System.out.println("location after the slide:" +minslider.getLocation());
		
		WebElement maxslider = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/span[2]"));
		
		System.out.println("default location of maxslider:" +maxslider.getLocation());
		
		act.dragAndDropBy(maxslider, 100, -110).perform();
		
		System.out.println("location after the slide:" +maxslider.getLocation());
		
		
		
		

	}

}
