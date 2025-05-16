package TestNg;

import org.testng.annotations.Test;

public class Priority {

		@Test
		public void login()
		
		{
			System.out.println("this login testcase");
		}
		
		@Test(priority = -1)
		public void signup()
		
		{
			System.out.println("this signup testcase");
		}
		
		@Test(priority = 3)
		public void addtocart()
		
		{
			System.out.println("this addtocart testcase");
		}
		
		@Test(priority = 3)
		public void payment()
		
		{
			System.out.println("this payment testcase");
		}
		
		

}
