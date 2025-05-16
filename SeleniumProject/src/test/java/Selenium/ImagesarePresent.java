package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesarePresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		//how many images are present in site
		
		List<WebElement> image= driver.findElements(By.tagName("img"));
		
		System.out.println(image.size());
		
		for(WebElement w: image)
		{
			System.out.println(w.getAttribute("src"));
		}
		

	}

}
