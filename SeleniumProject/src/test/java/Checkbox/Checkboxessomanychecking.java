package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxessomanychecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement w:checkbox)
		{
			w.click();
		}
		
		

	}

}
