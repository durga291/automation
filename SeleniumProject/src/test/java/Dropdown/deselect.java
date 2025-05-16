package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.name("coffee2"));
		
		Select s = new Select(w);
		
		List<WebElement> web = s.getOptions();
		
		for(int i=0;i<=web.size();i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
			s.deselectByIndex(i);
		}
		
		
	

	}

}
