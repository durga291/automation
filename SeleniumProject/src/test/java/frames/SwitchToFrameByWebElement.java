package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameByWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(frame);//without this we get no such element exception because of frame
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");


	}

}
