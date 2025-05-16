package TestNgDiff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//before method after method(BMAM) 
//multiple times you want to open browser  and close browser that time have to use
//before and after method
public class BMAM {
	
	WebDriver driver;
	
	@Test
	  public void f1() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	  }
	
	@Test
	  public void f2() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	  }
	
	@BeforeMethod
	
	void before()
	{
		 driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
	}
	
	@AfterMethod
	
	void after() throws InterruptedException
	{
		 Thread.sleep(2000);
		  driver.close();
	}

}
