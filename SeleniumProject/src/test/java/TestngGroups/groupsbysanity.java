package TestngGroups;

import org.testng.annotations.Test;

public class groupsbysanity {
	
	@Test(groups = "sanity")
	public void loginbyemail() throws Exception {
		
		System.out.println("login by email");
		
	}
	

	@Test(groups = "sanity")
	public void loginbygmail() throws Exception {
		
		System.out.println("login by gmail");
		
	}
	
	@Test(groups = "sanity")
	public void loginbyotp() throws Exception {
		
		System.out.println("login by otp");
		
	}
	
	

}
