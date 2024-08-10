package pageObjects;

import java.util.List;

import javax.swing.table.TableStringConverter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class DodajOglas_Page extends BasePage {

	public DodajOglas_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@FindBy(css = "div [class='steps-wrapper'] >button")
	List<WebElement> crumbsSteps;
	@FindBy(xpath =  "//span[normalize-space()='Izbor kategorije']")
	WebElement stepIzborKategorije;
	
	@FindBy(xpath = "//span[normalize-space()='O oglasu']")
	WebElement stepOOglasu;
	@FindBy(xpath =  "//span[contains(text(),'O oglašivaču')]")
	WebElement stepOOglasivacu;
	
	
	
	@FindBy(xpath = "(//li[@class='category-list-item-n'])")
	List<WebElement> CategoryList;

	@FindBy(xpath = "//p[normalize-space()='Automobili']")
	WebElement subCategoryAutomobili;

	@FindBy(xpath = "//p[normalize-space()='Polovni automobili']")
	WebElement subCategoryPolovniAutomobili;

	@FindBy(xpath = "//button[normalize-space()='Nastavi']")
	WebElement btnNastavi;

	@FindBy(css = "input.photo-input.photo-added[type='file'][name='pic'][accept='image/*']")
	WebElement inputPhotosElement;

	@FindBy(css = "(//span[@class='checkbox-sign round-checkbox-sign'])")
	List<WebElement> checkboxes;

	@FindBy(xpath = "(//p[@class='selected-options'])")
	WebElement menuMarkaAutomobila;
	@FindBy(xpath = "//span[contains(text(),'BMW')]")
	WebElement optionBMW;

	@FindBy(css = "div[data-attribute-type='dropDownSingleSelectOrFreeText'] section[class='single-dropdown'] div p[class='selected-options']")
	WebElement menuModel;
	@FindBy(xpath = "//span[contains(text(),'X5')]")
	WebElement optionX5;

	@FindBy(xpath = "(//p[@class='selected-options'])[3]")
	WebElement menuGorivo;
	@FindBy(xpath = "//span[contains(text(),'Dizel')]")
	WebElement optionDizel;

	@FindBy(xpath = "(//div[@data-attribute-type='dropDownSingleSelect'])[3]")
	WebElement menuOblikKaroserije;
	@FindBy(xpath = "//span[contains(text(),'Džip/SUV')]")
	WebElement optionSUV;

	@FindBy(xpath = "(//p[@class='selected-options'])[5]")
	WebElement menuBrojVrata;
	@FindBy(xpath = "//span[contains(text(),'4/5')]")
	WebElement option4Vrata;

	@FindBy(xpath = "(//p[@class='selected-options'])[6]")
	WebElement menuGodinaProizvodnje;
	@FindBy(xpath = "//span[@class='name'][normalize-space()='2020']")
	WebElement optionYear;

	@FindBy(xpath = "(//i[@class='dropdown-arrow icon-dropdown-arrow-bottom'])[7]")
	WebElement menuTip;

	@FindBy(xpath = "//div[@class='full-column']//li[2]//label[1]//span[2]//span[1]")
	WebElement inputMenuTip;

	@FindBy(xpath = "input[class='main-input'][placeholder='Unesi (cm³)']")
	WebElement inputKubikaza;

	@FindBy(css = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > label > input")
	WebElement inputPredjeniKilometri;

	@FindBy(xpath = "(//span[contains(text(),'Odaberi')])[1]")
	WebElement menuEkoloskaKategorija;
	@FindBy(xpath = "(//span[contains(text(),'EURO2')])[1]")
	WebElement optionEuro2;

	@FindBy(xpath = "(//p[@class='selected-options'])[12]")
	WebElement menuRegistrovanDo;

	
	@FindBy(xpath = "//span[contains(text(),'02/2025')]")
	WebElement optionDate;
	
	@FindBy(xpath = "//textarea[@placeholder='Unesi naziv oglasa']")
	WebElement informacijeOoglasu_Naziv;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement txtOglasa;
	
	@FindBy(xpath = "//input[@placeholder='Unesi cenu (EUR)']")
	WebElement inputCenaField;
	
	@FindBy(xpath = "//div[@class='country-dropdown-selected open']")
	WebElement menuZemlja;
	
	@FindBy(xpath = "//p[normalize-space()='Hrvatska']")
	WebElement optionZemlja;
	
	@FindBy(id = "searchLocations")
	WebElement lokacijaElement;
	
	@FindBy(css = ".btn.btn--type-primary.step-next")
	WebElement btnNastavi2;
	
	@FindBy(xpath = "//button[contains(text(),'Sačuvaj informacije i objavi oglas')]")
	WebElement btnSacuvajIObjaviOglas;
	
	@FindBy(tagName = "h2")
	WebElement confMessagElement;
	
	@FindBy(xpath = "//span[@class='icon-close absolute right-0 top-0 cursor-pointer p-4'] [1]")
	WebElement btnCloseQrCodElement;
	
	
	public String verifyCurrentUrl() {
		wait.until(ExpectedConditions.urlToBe("https://sasomange.rs/moj-sasomange/dodaj-oglas"));
		return driver.getCurrentUrl();
	}

	public void clickVozilaCategory() {
		wait.until(ExpectedConditions.visibilityOfAllElements(CategoryList));
		for (WebElement category : CategoryList) {
			if (category.getText().equalsIgnoreCase("vozila")) {
				category.click();
			}
		}

	}

	public void clickAutomobili() {
		subCategoryAutomobili.click();
	}

	public void clickPolovniAutomobili() {
		subCategoryPolovniAutomobili.click();
	}

	public void clickBtNastavi() {
		btnNastavi.click();
	}

	public void uploadPhotos(String path) {
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
		// inputPhotosElement, path);
		inputPhotosElement.sendKeys(path);
	}

	public void clickMenuMarkaAutomobila() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuMarkaAutomobila);
		wait.until(ExpectedConditions.elementToBeClickable(menuMarkaAutomobila));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuMarkaAutomobila);
	}

	public void chooseOptionBMW() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'BMW')]")));
		optionBMW.click();
	}

	public void clickMenuModel() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuModel);
		wait.until(ExpectedConditions.elementToBeClickable(menuMarkaAutomobila));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuModel);
	}

	public void chooseOptionX5() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'X5')]")));
		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",optionX5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'X5')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionX5);

	}

	public void clickMenuGorivo() {
		wait.until(ExpectedConditions.elementToBeClickable(menuGorivo));
		// ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",optionX5);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuGorivo);
	}

	public void chooseBenzinOption() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionDizel);
	}

	public void clickMenuOblikKaroserije() {
		wait.until(ExpectedConditions.elementToBeClickable(menuOblikKaroserije));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuOblikKaroserije);
	}

	public void chooseSUV() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Džip/SUV')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionSUV);
	}

	public void clickMenuBrojVrata() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuBrojVrata);
	}

	public void choose4Vrata() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", option4Vrata);
	}

	public void clickMenuGodinaProizvodnje() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuGodinaProizvodnje);
	}

	public void setYear() {
		wait.until(ExpectedConditions.elementToBeClickable(optionYear));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionYear);
	}

	public void clickMenuTip() {
		wait.until(ExpectedConditions.elementToBeClickable(menuTip));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuTip);
	}

	public void chooseTip() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputMenuTip);
	}

	public void setPredjeniKilometri(String kilometri) {
		wait.until(ExpectedConditions.elementToBeClickable(inputPredjeniKilometri));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[type=button]")));

		inputPredjeniKilometri.sendKeys(kilometri);
	}

	public String verifyInputKilometri() {
		return inputPredjeniKilometri.getAttribute("value");
	}

	public void clickMenuEkoloskaKategorija() {
		menuEkoloskaKategorija.click();
	}

	public void chooseOptionEuro2() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionEuro2);
	}

	public void clickMenuRegistrovanDo() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionEuro2);
	}

	public void chooseOptionDate() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionDate);
	}
	
	public void setNazivOglasa(String nazivoglasa) {
		informacijeOoglasu_Naziv.clear();
		informacijeOoglasu_Naziv.sendKeys(nazivoglasa);
	}
	
	public String verifyTextOglasaString () {
		return informacijeOoglasu_Naziv.getAttribute("value");
	}
	
	public void setTextOglasa(String oglas) {
		txtOglasa.sendKeys(oglas);
	}
	
	public void setCenaField(String cena) {
		inputCenaField.sendKeys(cena);
	}

public String verifyInputCena() {
	return inputCenaField.getAttribute("value");
}

public void clickMenuZemlja() {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuZemlja);
}
public void chooseOptionZemlja() {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionZemlja);
}

public void setLokacija(String location) {
	lokacijaElement.click();
	lokacijaElement.sendKeys("location");
}
public void clickBtnNastavi2() {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnNastavi2);
}

public void clickBtnSacuvajIobjaviOglas() {
	btnSacuvajIObjaviOglas.click();
}

public boolean isConfMessageExist() {
	return confMessagElement.isDisplayed();
	
}


public String verifyConfMsgText() {
	return confMessagElement.getText();

}

public void clickCloseQr() {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnCloseQrCodElement);
}

public boolean verifyFirstStepIzborKategorije() {
		   if (!stepIzborKategorije.getAttribute("class").contains("btn disabled")) {
			        System.out.println("Selektovan step: " + stepIzborKategorije.getText());
			        return true;
			       }
			    return false;
		}

public boolean verifySecontStep(){
	for (WebElement step : crumbsSteps)    
	if (!step.getAttribute("class").contains("btn disabled")) {
		        System.out.println("Selektovan step: " + stepOOglasu.getText());
		        return true;
		       }
		    return false;
	}



public boolean verifyThirdStep() {
	   if (!stepOOglasivacu.getAttribute("class").contains("btn disabled")) {
		        System.out.println("Selektovan step: " + stepOOglasivacu.getText());
		        return true;
		       }
		    return false;
	}






}


