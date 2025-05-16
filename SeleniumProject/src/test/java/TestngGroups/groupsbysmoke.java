package TestngGroups;

import org.testng.annotations.Test;

public class groupsbysmoke {
	
	@Test(groups = "smoke")
	public void signupbyemail() throws Exception {
		
		System.out.println("signup by email");
		
	}
	
	@Test(groups = "smoke")
	public void signupbygmail() throws Exception {
		
		System.out.println("signup by gmail");
		
	}
	
	@Test(groups = "smoke")
	public void signupbyotp() throws Exception {
		
		System.out.println("signup by otp");
		
	}



}
