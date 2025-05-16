package Datadriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Hybrid {
	
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

  @Test
  public void login() throws IOException {
	  
	  File src = new File("C:\\Users\\vvldu\\OneDrive\\Desktop\\Datadriven.xlsx");
	  FileInputStream fi = new FileInputStream(src);
	  workbook = new XSSFWorkbook(fi);
	  sheet =workbook.getSheetAt(0);
	  
	  //read the data from xl sheet
	  
	  for(int i=1;i<=sheet.getLastRowNum();i++)
	  {
		  //read the data
		  cell = sheet.getRow(i).getCell(0); //for UID
		  
		  if(cell != null)
		  {
			  cell.setCellType(CellType.STRING);
			  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cell.getStringCellValue());  // inspecting facebook login id
			  
		  }
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  
		  cell = sheet.getRow(i).getCell(1); //for PWS
		  
		  if(cell != null)
		  {
			  cell.setCellType(CellType.STRING);
			  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(cell.getStringCellValue()); // inspecting facebook password 
			  
		  }
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  }
	  
	  
  }
	  

  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.close();
  }

}
