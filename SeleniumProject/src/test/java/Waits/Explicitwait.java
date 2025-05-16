package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://www.adactin.com/HotelApp/index.php");				 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ajay");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ajay@123");
		
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(3000));
		
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='login']")))); 
		   
		   
		  driver.findElement(By.xpath("//input[@id='login']")).click(); 

	}

}
