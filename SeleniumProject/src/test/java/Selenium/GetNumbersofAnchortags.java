package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNumbersofAnchortags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		//how many anchor tags are present in site
		
		List<WebElement> href    = driver.findElements(By.tagName("a"));
		
		System.out.println(href.size());
		
		for(WebElement w :href)
		{
			System.out.println(w.getAttribute("href"));
		}
	

	}

}
