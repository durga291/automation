package TestngGroups;

import org.testng.annotations.Test;

public class groupsbyboth {

	
	@Test(groups = {"sanity" ,"smoke","functional"})
	public void paymentcd() throws Exception {
		
		System.out.println("payment by cd");
		
	}
	
	@Test(groups = {"sanity" ,"smoke","functional"})
	public void paymentdd() throws Exception {
		
		System.out.println("payment by dd");
		
	}
	
	@Test(groups = {"sanity" ,"smoke","functional"})
	public void paymentapp() throws Exception {
		
		System.out.println("payment by app");
		
	}
}
