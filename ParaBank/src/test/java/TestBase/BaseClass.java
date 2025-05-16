package TestBase;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public Logger logger;
	
	public Properties p;
	
	public static WebDriver driver;
	
	@BeforeClass(groups = {"sanity","regression","master"})
	
	public void setup() throws IOException
	{
		logger=LogManager.getLogger(this.getClass());//Log4j
		
		//loading properties file
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		 p=new Properties();
		 p.load(file);
		 
		driver = new ChromeDriver();
		driver.get(p.getProperty("appURL"));//have to call appurl from config.properties file
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	@AfterClass(groups = {"sanity","regression","master"})
	
	public  void teardown() 
	{
		//driver.close();
	}

	public String captureScreen(String tname) throws IOException
	{
		
			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);

			return targetFilePath;
	}

}
