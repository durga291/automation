package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sess04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("uytr");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		

	}

}
