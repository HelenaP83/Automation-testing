package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import testBase.BaseTestClass;
import utilities.DataInvalidMail;
import utilities.DataInvalidPassword;

public class TC01_Registration_ValidCredentials extends BaseTestClass {


	
	@Test
	public void VerifyRegistration_ValidCredentials() {

		hp.clickLnkRegistracija();
		rp.setImejl(randomAlphaNumeric() + "@gmail.com");
		rp.setPassword(properties.getProperty("password"));
		rp.clickRevealEye();
		String passwordAtributeReveal = rp.RevealPassword();
		Assert.assertEquals(passwordAtributeReveal, "text" );
		rp.clickPrihvatam();
		rp.clickRegistrujSe();

	}

	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

