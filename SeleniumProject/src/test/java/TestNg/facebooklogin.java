package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebooklogin {

	public static void main(String[] args) {
		
	}
		WebDriver driver;
		
		@Test
		void Login() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("1234");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1rt34");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		}
		@BeforeClass
		
		void before()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		}
		@AfterClass
		
		void teardown()
		{
			driver.close();
		}
		

}
