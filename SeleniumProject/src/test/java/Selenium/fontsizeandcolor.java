package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fontsizeandcolor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		   WebElement abc = driver.findElement(By.linkText("Forgotten password?"));
		   
		   System.out.println(abc.getCssValue("font-size"));
		   
		   System.out.println(abc.getCssValue("color"));
		
		
		

	}

}
