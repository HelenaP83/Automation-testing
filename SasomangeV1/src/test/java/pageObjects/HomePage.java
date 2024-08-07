package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(css = "a[href='/registracija']")
	WebElement lnkRegistracija;
	
	@FindBy(css = " a[href='/uloguj-se']")
	WebElement lnkLogIn;
	
	@FindBy(css = "a[class*='add-btn']")
	WebElement btnDodajOglas;
	
	
	
	
	public void clickLnkRegistracija()
	{
		lnkRegistracija.click();
		
	}
	
	
	public void clickLnkUlogujSe() {
		lnkLogIn.click();
	}
	
	public void clickDodajoglas() {
		btnDodajOglas.click();
	}


	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}
	
	
}
