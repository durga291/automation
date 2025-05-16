package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String abc = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("id");//whatever we are given xpath as id 
																								//compusory will give gaetattribute of id
		
		System.out.println(abc);

	}

}
