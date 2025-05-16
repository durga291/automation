package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.name("coffee"));
		
		Select s = new Select(w);
		
		 boolean b = s.isMultiple();
		 
		 System.out.println(b);

	}

}
