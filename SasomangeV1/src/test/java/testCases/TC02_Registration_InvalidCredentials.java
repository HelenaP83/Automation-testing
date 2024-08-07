package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.BaseTestClass;
import utilities.DataInvalidMail;
import utilities.DataInvalidPassword;






public class TC02_Registration_InvalidCredentials extends BaseTestClass {
	
	
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://sasomange.rs/registracija");
	
	}
	
	
	@Test(dataProvider = "Invalid_PasswordCredential", dataProviderClass=DataInvalidPassword.class )
	public void VerifyRegistration_InvalidPaswordCredential(String password) {
		 
		rp.setImejl(randomString()+ "@yahoo.com");
		rp.setPassword(password);
		rp.clickPrihvatam();
		rp.clickRegistrujSe();
		String colorOfPasswordField = rp.getBorderColorErrorPassword();
		System.out.println("Actual border color: " + colorOfPasswordField);
		String expectedColorOfPasswordField ="rgb(255, 41, 71)";
		Assert.assertTrue(expectedColorOfPasswordField.equals(colorOfPasswordField)); 
			
	
		}
	
	
	
	
	@Test(dataProvider = "Invalid mail Credential", dataProviderClass = DataInvalidMail.class )
	public void VerifyRegistration_InvalidMailCredential(String imejl) {
		
		rp.setImejl(imejl);
		rp.setPassword(properties.getProperty("password"));
		rp.clickRevealEye();
		String passwordAtributeReveal = rp.RevealPassword();
		Assert.assertEquals(passwordAtributeReveal, "text" );
		rp.clickPrihvatam();
		rp.clickRegistrujSe();
		//boolean errorMessageWrongMail = rp.isMsgErrorWrongMailDisplayed();
		
		if (rp.isMsgErrorWrongMailDisplayed() == true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}	
		}
		
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

