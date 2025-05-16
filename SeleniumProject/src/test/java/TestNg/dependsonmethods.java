package TestNg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods {
	
	@Test(priority = 1,dependsOnMethods = "Signup")
	public void Login(){
		
		System.out.println("login test case");
		
	}
	
	@Test
	public void Signup() throws Exception {
		
		Assert.assertEquals(123, 123);
		System.out.println("signup test case");
		
	}

}
