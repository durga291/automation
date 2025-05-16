package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectvalue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.name("coffee2"));
		
		Select s = new Select(w);
		
		List<WebElement> web = s.getAllSelectedOptions();
		
		s.selectByValue("milk2");
		s.selectByValue("cream");
		
		Thread.sleep(2000);
		
		s.deselectByValue("milk2");
		s.deselectByValue("cream");


	}

}
