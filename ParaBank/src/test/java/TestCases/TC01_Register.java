package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import TestBase.BaseClass;

public class TC01_Register extends BaseClass
{
	
	@Test(priority = 1,groups={"sanity","master"})
	public void register()
	{
		logger.info("*** starting home page ***");
		HomePage hp = new HomePage(driver);
				 hp.clickRegister();
		
		logger.info("*** starting register page ***");
		
		RegisterPage rp = new RegisterPage(driver);
		rp.firstName("raj");
		rp.lastName("01");
		rp.addressName("ghi");
		rp.cityName("jkl");
		rp.stateName("klmn");
		rp.zipcodeNum("12345");
		rp.phoneNum("6789321412");
		rp.ssnName("1234556");
		rp.usernameName("raj11");
		rp.custPass("raj11");
		rp.confPass("raj11");
		rp.clickRegister();
		
		//after opening register page selenium dont know what the page is right or wrong thats why we are writing
		
		String expectedtitle = "ParaBank | Customer Created";//inspecting the title from application
		String actualtitle = driver.getTitle();
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("test case is pass");
			Assert.assertEquals(expectedtitle, actualtitle);
		}else
		{
			System.out.println("test case is failed");
		}
		
		logger.info("*** ending register page ***");
	}
	

}
