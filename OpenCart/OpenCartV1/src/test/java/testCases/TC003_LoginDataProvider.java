package testCases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseTestClass;
import utilities.DataProviders;

public class TC003_LoginDataProvider extends BaseTestClass {

	
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void verifyLogin(String email, String pwd, String exp) {
		
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmailAdress(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		MyAccountPage accountPage= new MyAccountPage(driver);
		boolean targetPage= accountPage.isMyAccountPageExists();
		
		if (exp.equalsIgnoreCase("Valid")) {
			if (targetPage==true) {
				Assert.assertTrue(true);
				accountPage.clickLogout();
			} else {
					Assert.assertTrue(false);
			}
			}
		
		
		if (exp.equalsIgnoreCase("Invalid")) {
			if (targetPage==true) {
				
				Assert.assertTrue(false);
				accountPage.clickLogout();
			} else {
					Assert.assertTrue(true);
			}
			}
		
		
		
		
			}
		
	}	

