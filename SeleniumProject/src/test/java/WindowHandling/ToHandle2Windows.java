package WindowHandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandle2Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		
		driver.manage().window().maximize();
		
		//String parentid  =	driver.getWindowHandle(); //for getting parent window id(first window id)
		
		//System.out.println(parentid);
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Help")).click();
		
		 Set<String>     windowids   =  driver.getWindowHandles();//used to find gmail window id (parent)and help window id(child)
	    
	    System.out.println(windowids);
	    
	    //switching windows from one to another will use collection framework iteartor or array or any
	    
	    
	    Iterator<String> it = windowids.iterator();
	    
	             String parentid =  it.next();
	             String childid = it.next();
	             
	     driver.switchTo().window(parentid);//starts with parent id
	     System.out.println("parent window title:"  + driver.getTitle());
	     
	     driver.switchTo().window(childid);
	     System.out.println("child window title:" +driver.getTitle());
	     
	     driver.close();//close current window that is child window(help)
	     
	     //driver.quit();//close all windows

	}

}
