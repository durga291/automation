package TestNgdataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class dataprovider {
	
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String UID, String PWD) throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UID);
	  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PWD);
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void teardown() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }


  @DataProvider(name ="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "", "abcde" },                  //first is usedrid(blank) and second is paasword(abcde)....testcase1
      new Object[] { "abcd", "b" },                  //first..abcd second..b....tastcase2
    };
  }
}
