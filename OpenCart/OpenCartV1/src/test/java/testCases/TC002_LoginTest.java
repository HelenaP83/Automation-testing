package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseTestClass;

public class TC002_LoginTest extends BaseTestClass {

	
	@Test
	public void verify_Login() {
		
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmailAdress(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage accountPage= new MyAccountPage(driver);
		boolean targetPage= accountPage.isMyAccountPageExists();
		//Assert.assertEquals(targetPage, true, "Login failed");
		Assert.assertTrue(targetPage);
	
	}
	
	
	
	
	
	
	
}
