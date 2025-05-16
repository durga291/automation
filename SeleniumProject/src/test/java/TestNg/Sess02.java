package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sess02 {
  @Test
  public void login() {
	  System.out.println("this is testcase");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("4");
  }

}
