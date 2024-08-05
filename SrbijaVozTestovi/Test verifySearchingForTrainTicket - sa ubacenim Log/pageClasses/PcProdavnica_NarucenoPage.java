package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class PcProdavnica_NarucenoPage extends BasePage{

	public PcProdavnica_NarucenoPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath = "(//div[@id='doubleprovera'])[1]") //#container
	WebElement predRacun;
	@FindBy(css = "#doubleprovera")
	WebElement greskaElement;
	@FindBy(css = "#proverainside > p > span ")
	WebElement greska1Element;

	
	
	
	public String messageNaruceno() {
		wait.until(ExpectedConditions.urlToBe("https://pcpress.rs/prodavnica/naruceno.php"));
		wait.until(ExpectedConditions.visibilityOf(predRacun));
		return predRacun.getText();
		}
		
	
	public boolean verifyText() {
		return predRacun.getText().contains("Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima");
	}	
	
	public String greskaMessage() {
		return greskaElement.getText();
	}

	public boolean verifyGreskaElement() {
		return greskaElement.getText().contains("Greška!");
	}



    public String verifyUrlNaruceno() {
    	wait.until(ExpectedConditions.urlToBe("https://pcpress.rs/prodavnica/naruceno.php"));
    	return driver.getCurrentUrl();
    } 




}





