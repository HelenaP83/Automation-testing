package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseTestClass;

public class TC03_Login extends BaseTestClass {

	@Test
	public void SignInBy_usingValidDataAndEmailAsOption() {

		hp.clickLnkUlogujSe();
		ulogujp.setImejl_KorisnickoIme(properties.getProperty("imejl"));
		ulogujp.setPassword(properties.getProperty("password"));
		ulogujp.clickEyeToggle();
		String passwordAtributeReveal = ulogujp.RevealPassword();
		Assert.assertEquals(passwordAtributeReveal, "text");
		ulogujp.clickbtnPrijaviSe();

		assertTrue(ulogujp.isMsgConfDisplayed());
		String actualUrl = hp.getCurrentUrl();
		String expectedUrl = "https://sasomange.rs/";
		assertEquals(actualUrl, expectedUrl);
	}

	@Test
	public void SingIn_withInvalidPassword() {
		hp.clickLnkUlogujSe();
		ulogujp.setImejl_KorisnickoIme(properties.getProperty("imejl"));
		ulogujp.setPassword(properties.getProperty("invalidPassword"));
		ulogujp.clickEyeToggle();
		String passwordAtributeReveal = ulogujp.RevealPassword();
		Assert.assertEquals(passwordAtributeReveal, "text");
		ulogujp.clickbtnPrijaviSe();
		boolean messageWrongPassword = ulogujp.isMsgConfDisplayed();
		if (messageWrongPassword == true) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	public void leaveAllAndClick() {
		hp.clickLnkUlogujSe();
		ulogujp.clickbtnPrijaviSe();
		boolean msgOvoPoljeJeObaveznoMejl = ulogujp.isMsgImejlPoljeJeObaveznoExist();
		boolean msgOvoPoljeJeObaveznoPassword = ulogujp.isMsgLozinkaPoljeJeObaveznoExist();
		if (msgOvoPoljeJeObaveznoPassword && msgOvoPoljeJeObaveznoMejl == true) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
