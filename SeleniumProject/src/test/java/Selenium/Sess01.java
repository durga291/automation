package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();// here we are creating object and implementing webdriver interface in chrome driver class
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.in/");
		driver.navigate().back();//back to amazon
		driver.navigate().refresh();
		driver.navigate().forward();//forward to again flipkart
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getTitle());
		driver.manage().window().minimize();
		
		
		
		driver.close();
		driver.quit();

	}

}
