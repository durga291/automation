package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogopresentorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		//first way to get logo is presnt or not
		
		
		/*Boolean  logo =driver.findElement(By.xpath("//img[@style='height: 50px']")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("logo is present");
			
		}
		else
		{
			System.out.println("logo is not present");
		}
		
		*/
		
		// second way to get logo is present or not
		
		WebElement logo = driver.findElement((By.xpath("//img[@style='height: 50px']")));
		
		System.out.println(logo.isDisplayed());//return type is boolean so will get output as true

	}

}
