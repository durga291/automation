package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAlternateClicking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> ch=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<ch.size();i++)
		{
			if(ch.get(i).getAttribute("value").equals("Cricket")||ch.get(i).getAttribute("value").equals("Hockey"))
			
			{
				ch.get(i).click();
			}
			if(ch.get(i).isSelected())
			{
				System.out.println(ch.get(i).getAttribute("value"));
			}
			
		}
		
		

	}

}
