package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		//1.simple alert
		
		driver.findElement(By.xpath("//a[@href='#OKTab']"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		driver.switchTo().alert().accept();

	}

}
