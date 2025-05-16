package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//change dimension
		
		Dimension d = new Dimension(300, 400);
		driver.manage().window().setSize(d);
		
		//change the position
		
		Point p =new Point(500, 600);
		driver.manage().window().setPosition(p);
		
		
		

	}

}
