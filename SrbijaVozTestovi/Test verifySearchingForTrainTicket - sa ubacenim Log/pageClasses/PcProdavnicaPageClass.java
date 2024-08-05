package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class PcProdavnicaPageClass extends BasePage {

	public PcProdavnicaPageClass(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "input[value='6']")
	WebElement AktuelniBrojCasopisaPCCheckbox;

	@FindBy(id = "arselektor1")
	WebElement GodisnjaPretplata11checkbox;
	@FindBy(id = "kolselektor1")
	WebElement inputKolicina_GodPretplata11;

	@FindBy(id = "arselektor0")
	WebElement polugodišnjaPretplata6BrojevaCheckbox;
	@FindBy(css = "arselektor14")
	WebElement digitalnoIzdanjeCasopisaPCGodišnjaCheckbox;

	@FindBy(id = "arselektor15")
	WebElement digitalnoIzdanjeCasopisaPcPolugodišnjaCheckbox;

	@FindBy(id = "arselektor4")
	WebElement knjiga50GodinaRačunarstvaUSrbijiCheckbox;

	@FindBy(css = "input[value='7']")
	WebElement arhivaBrojevaCasopisaPCCheckbox;

	@FindBy(css = "input[value='9']")
	WebElement arhivaBrojevaCasopisaconnectCheckbox;

	@FindBy(id = "arselektor9")
	WebElement KnjigaOfficNaRadnomMmestuCheckbox;

	@FindBy(id = "arselektor10")
	WebElement iPCDLDVDCheckbox;

	@FindBy(id = "arselektor12")
	WebElement pcVodičKrozPrimeneRačunara;

	@FindBy(css = "[alt=\"Submit\"]")
	WebElement kupujemButton;

	@FindBy(css = "option[value='ar_6_310']")
	WebElement option310;
	@FindBy(css = "option[value='ar_9_37']")
	WebElement optionValue37;
	@FindBy(css = "img[alt='PC Online']")
	WebElement footerElement;
	@FindBy(css = "#pratiteNas > a:nth-child(4)")
	WebElement newsletterElement;
	@FindBy(css = "#pratiteNas > a:nth-child(2)")
	WebElement facebookElement;
	@FindBy(css = "#pratiteNas > a:nth-child(1)")
	WebElement twitterElement;
	@FindBy(css = "a[href='https://pcpress.rs/pravila-koriscenja-sajta/")
	WebElement pravilaKoriscenjaElement;
	@FindBy(css = "option[value='ar_7_267']")
	WebElement optionValue267;
	@FindBy(id = "kolselektor4")
	WebElement kolicinaField4;
	@FindBy(css = "#doubleprovera > a")
	WebElement pCProdavnicaElement;
	@FindBy(id = "kolselektor15")
	WebElement kolicina15FieldElement;

	@FindBy(id = "kolselektor0")
	WebElement inputField_Kolicina;

	@FindBy(css = "input[name='ime']")
	WebElement input_FieldIme;
	@FindBy(css = "textarea[name='adresa']")
	WebElement input_FieldUlicaIBroj;
	@FindBy(css = "input[name='postbroj']")
	WebElement input_FieldPostBroj;
	@FindBy(css = "input[name='grad']")
	WebElement input_FieldGrad;
	@FindBy(css = "input[name='telefon']")
	WebElement input_FieldTelefon;
	@FindBy(css = "input[name='email']")
	WebElement input_FieldEmail;
	@FindBy(css = "textarea[name='napomena']")
	WebElement napomenaField;
	@FindBy(css = "input[value='Naručujem']")
	WebElement buttonNarucujem;
	@FindBy(css = "input[value='Odustajem']")
	WebElement odustajemElement;

	@FindBy(css = "td.zauplatu u")
	WebElement actualElement;
	
	@FindBy(css = ".zauplatu u")
	WebElement podaciZaUplatu;
	@FindBy(id = "logo")
	WebElement logoIcon;
	@FindBy(css = "#pratiteNas > a:nth-child(3)")
	WebElement feedIconElement;
	@FindBy(css = " td:nth-child(1) > a")
	WebElement linkProdavnicaElement;
	@FindBy(css = " td:nth-child(2) > a")
	WebElement emailFormLinkProdajaElement;
	@FindBy(css = "#doubleprovera > a")
	WebElement povratakLinkProdavnicaElement;

	@FindBy(css = "img[onclick='skloniPorudzbenicu()']")
	WebElement xElement;

	public void clickGodisnjaPretplata11checkbox() {
		wait.until(ExpectedConditions.elementToBeClickable(GodisnjaPretplata11checkbox)).click();
	}

	public void typeInputKolicina_GodPretplata11(String amount) {
		wait.until(ExpectedConditions.visibilityOf(inputKolicina_GodPretplata11)).clear();
		inputKolicina_GodPretplata11.sendKeys(amount);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputKolicina_GodPretplata11, amount));
	}

	public void clickOnKupujemButton() {
		wait.until(ExpectedConditions.elementToBeClickable(kupujemButton)).click();
	}

	public void clickOnTheOption310() {
		wait.until(ExpectedConditions.elementToBeClickable(option310)).click();
	}

	public void clickOnThePCProdavnica() {
		wait.until(ExpectedConditions.elementToBeClickable(pCProdavnicaElement)).click();
	}

	public void clickOnThProdaja() {
		wait.until(ExpectedConditions.elementToBeClickable(emailFormLinkProdajaElement)).click();
	}

	public void clickOnTheLinkProdavnica() {
		wait.until(ExpectedConditions.elementToBeClickable(linkProdavnicaElement)).click();
	}

	public void clickOnTheIconLogo() {
		wait.until(ExpectedConditions.elementToBeClickable(logoIcon)).click();
	}

	public void clickOnTheOption37() {
		wait.until(ExpectedConditions.elementToBeClickable(optionValue37)).click();
	}

	public void clickOnTheOption267() {
		wait.until(ExpectedConditions.elementToBeClickable(optionValue267)).click();
	}

	public void typeIntoTheFieldKolicina(String amount) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Kolicina)).clear();
		inputField_Kolicina.sendKeys(amount);
		wait.until(ExpectedConditions.textToBePresentInElementValue(inputField_Kolicina, amount));
	}

	public void typeIntoTheFieldNapomena(String text) {
		wait.until(ExpectedConditions.visibilityOf(napomenaField)).clear();
		napomenaField.sendKeys(text);
		wait.until(ExpectedConditions.textToBePresentInElementValue(napomenaField, text));

	}

	public void typeIntoTheFieldImeIPrezime(String name) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldIme)).clear();
		input_FieldIme.sendKeys(name);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldIme, name));
	}

	public void typeIntoTheFieldUlicaIBroj(String input) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldUlicaIBroj)).clear();
		input_FieldUlicaIBroj.sendKeys(input);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldUlicaIBroj, input));
	}

	public void typeIntoTheFieldPostanskiBroj(String number) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldPostBroj)).clear();
		input_FieldPostBroj.sendKeys(number);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldPostBroj, number));
	}

	public void typeIntoTheFieldGrad(String city) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldGrad)).clear();
		input_FieldGrad.sendKeys(city);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldGrad, city));
	}

	public void typeIntoTheFieldTelefon(String telefon) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldTelefon)).clear();
		input_FieldTelefon.sendKeys(telefon);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldTelefon, telefon));
	}

	public void typeIntoTheFieldEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(input_FieldEmail)).clear();
		input_FieldEmail.sendKeys(email);
		wait.until(ExpectedConditions.textToBePresentInElementValue(input_FieldEmail, email));
	}

	public void clickOnTheButtonNarucujem() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNarucujem)).click();
	}

	

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public boolean verifyActualElement() {
		return actualElement.getText().contains("Podaci potrebni za uplatu");
	}

	public void typeIntoToTheFieldKolicina15(String amount4) {
		wait.until(ExpectedConditions.visibilityOf(kolicina15FieldElement)).clear();
		kolicina15FieldElement.sendKeys(amount4);
	}

	public void typeIntoToTheFieldKolicina4(String amount4) {
		wait.until(ExpectedConditions.visibilityOf(kolicinaField4)).clear();
		kolicinaField4.sendKeys(amount4);
	}

	public void clickOnTheLinkPovratak() {
		wait.until(ExpectedConditions.elementToBeClickable(povratakLinkProdavnicaElement)).click();
	}

	public void clickOnTheLinkOdustajem() {
		wait.until(ExpectedConditions.elementToBeClickable(odustajemElement)).click();
	}

	public void clickOnTheXButton() {
		wait.until(ExpectedConditions.elementToBeClickable(xElement)).click();
	}

	public void alertAppearance() {
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}

	

}
