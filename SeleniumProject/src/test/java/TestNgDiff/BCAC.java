package TestNgDiff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

//before class after class 
//when you want to open browser and run all testcases and close browser that time have to use
//before and after class

public class BCAC {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
	 // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
  
	  
  }
  
  @Test
  public void f1() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123");
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123");
	 // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	  Thread.sleep(1000);
  }

  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.close();
  }

}
