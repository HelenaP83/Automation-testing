package testClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SrbijaVozHome_testClass  extends BaseTestClass{

	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to(" https://webapi1.srbvoz.rs/ekarta/app/#!/home");
		
	}
	
	
	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
	
	
	@Test
	public void verifySearchingForTrainTicket () {
		
		logger.info("******Starting verifySearchingForTrainTicket ********");
		
		try {
		
		homePage.clickOnCheckboxJedanSmer();
		logger.info("Clicked on Checkbox Jedan smer");
		homePage.typeIntoField_StanicaOd("be");
		logger.info("Upisana pocetna stanica");
		homePage.typeIntoField_StanicaDo("no");
		logger.info("Upisana dolazna stanica");
		homePage.selectDate();
		logger.info("datum je izabran");
		homePage.selectRazred();
		homePage.NumberOfPassengers("5");
		homePage.clickOnTraziButton();
		homePage.clickOnFirstIzaberiButton();
		String actualButtonColour = homePage.verifyButtonColour();
		String expectedButtonColour = "rgba(14, 136, 12, 1)";
		assertEquals(actualButtonColour,expectedButtonColour, "Button is not green colour");
		homePage.clickOnDaljeButton();
		logger.info("validacija podnaslova");
		assertTrue(homePage.verifySubtitlePrijava(), "The subtitle does not contains text Prijava");
		}
	catch (Exception e) {
		logger.error("Test je pao");
		logger.debug("Debug logs..");
		Assert.fail();
	}
	logger.info("**** Test verifySearchingForTrainTicket Finised *****");
	
	}
	

	
	
	
	
	
	
	
	
	
	
}
