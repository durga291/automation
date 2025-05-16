package Radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEnableorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		boolean button =driver.findElement(By.xpath("//input[@type='radio'][@value='Male']")).isEnabled();
		
		if(button==true)
		{
			System.out.println("button is working");
		}
		
		else
		{
			System.out.println("button is not working");
		}

	}

}
