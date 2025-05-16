package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountPage;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC02_Login  extends BaseClass
{
	@Test(priority = 2,groups = {"regression","master"})
	
	public void login()
	{
		try
		{
			logger.info("*** started login test case ***");
			HomePage hp = new HomePage(driver);
			hp.setusername("java03");
			hp.setpassword("1234");
			hp.clicklogin();
		 
			
			AccountPage acc = new AccountPage(driver);
			boolean targetPage = acc.isAccountPageExist();
			
			Assert.assertTrue(targetPage, "Welcome raj 01");
         
		} catch (Exception e) 
		{
            logger.error("Login test case failed due to exception: " + e.getMessage());
            Assert.fail("Test case failed due to exception: " + e.getMessage());
        }

        logger.info("Finished the login test case.");
		 
		 
		 
		 
	}
	

}
