package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Uloguj_se_Page extends BasePage {

	public Uloguj_se_Page(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='gigya-textbox-loginID']")
	WebElement txtImejl_KorisnickoIme;

	@FindBy(xpath = "//input[@id='gigya-textbox-password']")
	WebElement txtPassword;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	WebElement btnEyeToggle;

	@FindBy(css = "div[id='login-screen'] button[type='submit']")
	WebElement btnPrijaviSe;
	

	@FindBy (id = "notification_1")
	WebElement msgConfrmLogIn;
	
	@FindBy (id = "notification_2")
	WebElement msgWrongPassword;
	
	
	@FindBy(xpath = "(//span[@data-bound-to='loginID'][normalize-space()='Ovo polje je obavezno'])[1]")
	WebElement msgImejlPoljeJeObavezno;
	
	@FindBy(xpath = "(//span[@data-bound-to='password'][normalize-space()='Ovo polje je obavezno'])[1]")
	WebElement msgLozinkaPoljeJeObavezno;
	
	public void setImejl_KorisnickoIme(String imejl) {
		wait.until(ExpectedConditions.visibilityOf(txtImejl_KorisnickoIme)).clear();
		txtImejl_KorisnickoIme.sendKeys(imejl);
	}

	public void setPassword(String pwd) {
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickEyeToggle() {
		btnEyeToggle.click();

	}

	public String RevealPassword() {
		return txtPassword.getAttribute("type");

	}

	public void clickbtnPrijaviSe() {
		wait.until(ExpectedConditions.elementToBeClickable(btnPrijaviSe));
		btnPrijaviSe.click();
	}

	public boolean isMsgConfDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(msgConfrmLogIn));
		return msgConfrmLogIn.isDisplayed();
	}


	public boolean ismsgWrongPasswordisplayed() {
		wait.until(ExpectedConditions.visibilityOf(msgWrongPassword));
		return msgWrongPassword.isDisplayed();
	}


	public boolean isMsgImejlPoljeJeObaveznoExist() {
		wait.until(ExpectedConditions.visibilityOf(msgImejlPoljeJeObavezno));
		return msgImejlPoljeJeObavezno.isDisplayed();
	}

	public boolean isMsgLozinkaPoljeJeObaveznoExist() {
		wait.until(ExpectedConditions.visibilityOf(msgLozinkaPoljeJeObavezno));
		return msgLozinkaPoljeJeObavezno.isDisplayed();
	}

}
