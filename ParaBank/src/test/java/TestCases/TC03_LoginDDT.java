package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.HomePage;
import PageObjects.AccountPage;
import TestBase.BaseClass;
import Utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
 */

public class TC03_LoginDDT extends BaseClass
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String username, String password, String exp)
	{
		logger.info("**** Starting TC03_LoginDDT *****");

		try {

			//Home page
			HomePage hp=new HomePage(driver);
			hp.setusername(username);
			hp.setpassword(password);

			hp.clicklogin();

			//My Account Page
			AccountPage acc=new AccountPage(driver);
			boolean targetPage=acc.isAccountPageExist();

			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					acc.clicklogout();
					Assert.assertTrue(true);  // pass
					logger.info("**** Test case Pass*****");
				}
				else
				{
					Assert.assertTrue(false);//fail
					logger.info("**** Test case Fail*****");
				}
			}

			if(exp.equalsIgnoreCase("Invalid"))   // negative data   username and password 
			{
				if(targetPage==true)
				{
					acc.clicklogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);    // passs
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}

		logger.info("**** Finished TC03_LoginDDT *****");
	}

}
