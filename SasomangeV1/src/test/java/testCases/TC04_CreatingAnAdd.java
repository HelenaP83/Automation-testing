package testCases;

import java.time.Duration;

import org.apache.commons.codec.digest.HmacAlgorithms;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testBase.BaseTestClass;

public class TC04_CreatingAnAdd extends BaseTestClass {

	@Test
	public void CreatingAdd_MandatoryFields_e2eTest() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("........ Login into account........");
		hp.clickLnkUlogujSe();
		ulogujp.setImejl_KorisnickoIme(properties.getProperty("imejl"));
		ulogujp.setPassword(properties.getProperty("password"));
		ulogujp.clickEyeToggle();
		String passwordAtributeReveal = ulogujp.RevealPassword();
		softAssert.assertEquals(passwordAtributeReveal, "text");
		ulogujp.clickbtnPrijaviSe();
		System.out.println("......Making an Add.....");
		hp.clickDodajoglas();
		String expectedUrl = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		String actualUrl = dodajOglasp.verifyCurrentUrl();
		softAssert.assertEquals(actualUrl, expectedUrl);
		softAssert.assertTrue(dodajOglasp.verifyFirstStepIzborKategorije());
		dodajOglasp.clickCloseQr();
		dodajOglasp.clickVozilaCategory();
		dodajOglasp.clickAutomobili();
		dodajOglasp.clickPolovniAutomobili();
		dodajOglasp.clickBtNastavi();
		softAssert.assertTrue(dodajOglasp.verifySecontStep());
		dodajOglasp.uploadPhotos(properties.getProperty("path"));
		dodajOglasp.clickMenuMarkaAutomobila();
		dodajOglasp.chooseOptionBMW();
		dodajOglasp.clickMenuModel();
		dodajOglasp.chooseOptionX5();
		dodajOglasp.clickMenuGorivo();
		dodajOglasp.chooseBenzinOption();
		dodajOglasp.clickMenuOblikKaroserije();
		dodajOglasp.chooseSUV();
		Thread.sleep(Duration.ofSeconds(3));
		dodajOglasp.clickMenuBrojVrata();
		dodajOglasp.choose4Vrata();
		Thread.sleep(Duration.ofSeconds(2));
		dodajOglasp.clickMenuGodinaProizvodnje();
		dodajOglasp.setYear();
		Thread.sleep(Duration.ofSeconds(3));
		dodajOglasp.clickMenuTip();
		dodajOglasp.chooseTip();
		Thread.sleep(Duration.ofSeconds(3));
		dodajOglasp.setPredjeniKilometri(properties.getProperty("kilometri"));
		String kilometri = dodajOglasp.verifyInputKilometri();
		softAssert.assertEquals(kilometri, properties.getProperty("kilometri"));
		System.out.println("Upisana kilometraza je: " + kilometri);
		dodajOglasp.clickMenuEkoloskaKategorija();
		dodajOglasp.chooseOptionEuro2();
		dodajOglasp.clickMenuRegistrovanDo();
		dodajOglasp.chooseOptionDate();
		dodajOglasp.setNazivOglasa(properties.getProperty("nazivoglasa"));
		String textNazivOglasaString = dodajOglasp.verifyTextOglasaString();
		softAssert.assertEquals(textNazivOglasaString, properties.getProperty("nazivoglasa"));
		System.out.println("Naziv oglasa je:" + textNazivOglasaString);
		dodajOglasp.setTextOglasa(properties.getProperty("oglas"));
		dodajOglasp.setCenaField(properties.getProperty("cena"));
		String enteredCena = dodajOglasp.verifyInputCena();
		softAssert.assertEquals(enteredCena, properties.getProperty("cena"));

		dodajOglasp.clickBtnNastavi2();
		softAssert.assertTrue(dodajOglasp.verifyThirdStep());
		dodajOglasp.clickBtnSacuvajIobjaviOglas();
		boolean confMessage = dodajOglasp.isConfMessageExist();
		if (confMessage == true) {
			softAssert.assertTrue(true);
		} else {
			softAssert.assertTrue(false);
		}

		String actualconfmsgText = dodajOglasp.verifyConfMsgText();
		String expectedConfMsgText = "Čestitamo, tvoj oglas je uspešno objavljen!";

		softAssert.assertEquals(actualconfmsgText, expectedConfMsgText);

		softAssert.assertAll();
	}
}