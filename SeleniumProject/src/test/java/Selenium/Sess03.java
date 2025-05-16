package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sess03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("durga123@gmail.com");
		
		//driver.findElement(By.cssSelector("#login")).sendKeys("2154654654567");//by using css selector you are using the  #id
		
		driver.findElement(By.name("pass")).sendKeys("1234");
		
		//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		

	}

}
