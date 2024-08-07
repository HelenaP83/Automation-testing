package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class RegistracijaPage extends BasePage {

	public RegistracijaPage(WebDriver driver) {
		super(driver);
		
	}

	

	@FindBy(css =  "[class*=' gigya-composite-control-textbox'] input[id='resident-email']")
	WebElement txtImejl;
	
	@FindBy(css = "#resident-password")
	WebElement txtPassword;
	
	@FindBy(css= "div[id='register-resident-user-screen-default'] div[class='form-group'] button[type='button']")
	WebElement btnRevealEyepassword;
	
	@FindBy(xpath= "//label[@for='registration-terms-residential-default-consent']")
	WebElement chkPrihvatam;
	
	@FindBy(css="div[id='register-resident-user-screen-default'] button[type='submit']")
	WebElement btnRegistrujSe;
	
	@FindBy(css  = ".gigya-error-code-400009")
	WebElement msgErrorWrongMail;
	
	@FindBy(css  = ".gigya-error-code-400009")
	WebElement msgErrorFieldEmpty;
	
	
	
	
	public void setImejl(String imejl) {
		wait.until(ExpectedConditions.visibilityOf(txtImejl));
		txtImejl.sendKeys(imejl);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickRevealEye() {
		 btnRevealEyepassword.click();
		
	}
	

	public String RevealPassword() {
		return txtPassword.getAttribute("type");
		
	}
	
	
	
	public void clickPrihvatam() {
		wait.until(ExpectedConditions.elementToBeClickable(chkPrihvatam));
		chkPrihvatam.click();
	}
	
	public boolean isPrihvatamBoxSelected() {
		return chkPrihvatam.isSelected();
	}

	public void clickRegistrujSe() {
		wait.until(ExpectedConditions.elementToBeClickable(btnRegistrujSe));
		btnRegistrujSe.click();
	}


public String getMsgErrorWrongMail() {
	return (msgErrorWrongMail.getText());
}

public boolean isMsgErrorWrongMailDisplayed() {
	return msgErrorWrongMail.isDisplayed();
}

public boolean isMsgErrorEpmtyFieldExist() {
	return msgErrorFieldEmpty.isDisplayed();
}

public String getBorderColorErrorPassword() {
	return txtPassword.getCssValue("border-color") ;
}



}


