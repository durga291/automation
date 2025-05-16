package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.name("coffee"));
		
		Select s = new Select(w);
		
		List<WebElement> o = s.getOptions();
		
		for(WebElement e :o)
		{
			System.out.println(e.getAttribute("value"));
			System.out.println(e.getText());
		}
		
		

	}

}
