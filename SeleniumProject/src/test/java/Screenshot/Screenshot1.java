package Screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub		
																					//In order to take screen shot of a webpage we use an interface called 
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/Register.html");				//TakesScreenShot. 
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
																			//firstly create reference of TakesScreenShot interface. 
		//screenshot declaration										//Get the screen shot using getScreenShotAs(). By default it will store screen 
																			//shots in temp folder. 

		TakesScreenshot tk=(TakesScreenshot)driver;
		 																	//Create destination to store the file using File class. 
		File src =	tk.getScreenshotAs(OutputType.FILE);				//Copy the file from src to destination using copyFile() of  FileUtils class.
		File dest = new File ("C:\\Users\\vvldu\\eclipse-workspace\\SeleniumProject\\screenshots\\pic.png");
		FileUtils.copyFile(src, dest);
		
		
		//logo screenshot(perticular element)
		   
		   
	     WebElement logo = driver.findElement(By.xpath("//img[@id='imagetrgt']"));//we need to create screenshots folder in selenium project then
	     																			//the path should be used
	     
	     File source = logo.getScreenshotAs(OutputType.FILE);
	     
	     File destination = new File("C:\\Users\\vvldu\\eclipse-workspace\\SeleniumProject\\screenshots\\pic1.png");
	     
	    // FileUtils.copyFile(source, destination);
	     
	     source.renameTo(destination);
	     
		
		
		
	
		
     
     
		

	}

}
