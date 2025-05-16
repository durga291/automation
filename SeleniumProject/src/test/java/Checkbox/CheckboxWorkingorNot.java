package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxWorkingorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		Boolean checkbox =driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("checkbox is working");
		}
		else
		{
			System.out.println("checkbox is working");
		}

	}

}
