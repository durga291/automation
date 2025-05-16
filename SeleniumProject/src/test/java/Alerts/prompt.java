package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		//3.Prompt
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		//driver.switchTo().alert().sendKeys("automation");
		
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		a.sendKeys("yes");
		
		Thread.sleep(1000);
		
		a.dismiss();
		
		driver.quit();
		
		

	}

}
