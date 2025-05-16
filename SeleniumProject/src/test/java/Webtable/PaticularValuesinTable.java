package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaticularValuesinTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//web table rows and columns
		
		int rows  =	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	
		System.out.println("Number of Rows : "  +rows);
		
		int columns  =	driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println("Number of columns : "  +columns);
		
		String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]//th[1]")).getText();
		
		System.out.println(book);
		
		String amit = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[2]")).getText();
		
		System.out.println(amit);
		
		
		
		

	}

}
