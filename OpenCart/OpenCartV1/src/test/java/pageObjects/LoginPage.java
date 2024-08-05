package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(id = "input-email")
	WebElement txtEmailAdress;
	
	@FindBy(id = "input-password")
	WebElement txtPassword;
	
	@FindBy(css = "input[value='Login']")
	WebElement btnLogin;
	
	
	public void setEmailAdress(String mail) {
		txtEmailAdress.sendKeys(mail);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
}




