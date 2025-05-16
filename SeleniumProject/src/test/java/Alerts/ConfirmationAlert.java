package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		//2.Confirmtion Alert
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		

	}

}
