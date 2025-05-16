package ScrollUpandDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/Register.html");				 
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		//To scroll down 
		 j.executeScript("window.scrollBy(0,500)"); 
		 
		  Thread.sleep(3000);
		  
		  //To scroll up
		  j.executeScript("window.scrollBy(0,-500)");
		
		

	}

}
