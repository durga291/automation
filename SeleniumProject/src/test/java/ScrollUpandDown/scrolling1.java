package ScrollUpandDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/Register.html");				 
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		 Thread.sleep(3000);
		
		WebElement dumble = driver.findElement(By.xpath("//span[@class='fa fa-facebook-square']"));
		
		 j.executeScript("arguments[0].scrollIntoView",dumble); 
		 
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@class='fa fa-facebook-square']")).click();
		
		  
		

	}

}
