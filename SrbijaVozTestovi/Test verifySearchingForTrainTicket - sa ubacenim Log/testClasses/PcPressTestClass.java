package testClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PcPressTestClass extends BaseTestClass_PcPress{

	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://pcpress.rs/prodavnica/index.php");
		
	}
	
	
	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}


	@Test
	public void testCase_ID1 () {
		SoftAssert softAssert = new SoftAssert();
		prodavnicaPage.clickGodisnjaPretplata11checkbox();
		prodavnicaPage.typeInputKolicina_GodPretplata11("1");
		prodavnicaPage.clickOnKupujemButton();
		prodavnicaPage.typeIntoTheFieldImeIPrezime("A b");
		prodavnicaPage.typeIntoTheFieldUlicaIBroj("B 10");
		prodavnicaPage.typeIntoTheFieldPostanskiBroj("21000");
		prodavnicaPage.typeIntoTheFieldGrad("Novi Sad");
		prodavnicaPage.typeIntoTheFieldTelefon("065208923");
		prodavnicaPage.typeIntoTheFieldEmail("hpapantidis@gmail.com");
		prodavnicaPage.clickOnTheButtonNarucujem();
		
		 String expectedMesage = "Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima";
		 String actualMessage = narucenoPage.greskaMessage();
				
		softAssert.assertEquals(actualMessage, expectedMesage, " Greska narucivanje nije uspesno");
		softAssert.assertTrue(narucenoPage.verifyText());
		softAssert.assertAll();
	}










}
